package edu.miu.cs.cs544.logging;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;

import static edu.miu.cs.cs544.customer.constants.CommonConstants.CORRELATION_ID;


@Slf4j
@Aspect
@Component
public class LogAspect {

    @Around("execution(* edu.miu.cs.cs544..*(..))")
    public Object around(ProceedingJoinPoint call) throws Throwable {

        log.info(MDC.get(CORRELATION_ID) + ": Begin method " + call.getSignature().toString());

        Object result = call.proceed();

        log.info(MDC.get(CORRELATION_ID) + ": End method " + call.getSignature().toString());

        return result;
    }

}
