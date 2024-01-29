package edu.miu.cs.cs544.customer.repository;

import edu.miu.cs.cs544.customer.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
