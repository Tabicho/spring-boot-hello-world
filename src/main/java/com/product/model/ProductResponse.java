package com.product.model;

import lombok.Data;

@Data
public class ProductResponse {
    private String name;
    private String description;
    private Double price;
    private Boolean inStock;
}