package edu.miu.cs.cs544.product.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Discount {

    @Id
    @GeneratedValue
    private Long id;

    private Double percentageOfDiscount;

    public Discount(Double percentageOfDiscount) {
        this.percentageOfDiscount = percentageOfDiscount;
    }
}
