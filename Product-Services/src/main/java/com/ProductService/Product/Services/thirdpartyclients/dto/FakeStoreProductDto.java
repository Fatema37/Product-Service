package com.ProductService.Product.Services.thirdpartyclients.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreProductDto {
    private Long id;
    private String title;
    private String category;
    private double price;
    private String description;
    private String image;
}