package edu.miu.cs.cs544.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Discount {

    private Long id;

    private Double percentageOfDiscount;

    public Discount(Double percentageOfDiscount) {

        this.percentageOfDiscount = percentageOfDiscount;
    }
}
