package edu.miu.cs.cs544.enums;

import com.fasterxml.jackson.annotation.JsonValue;



public enum AddressType {
    BILLING_ADDRESS("BILLING_ADDRESS"),
    SHIPPING_ADDRESS("SHIPPING_ADDRESS");

    private final String type;

    AddressType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @JsonValue
    public String type() {
        return type;
    }

}
