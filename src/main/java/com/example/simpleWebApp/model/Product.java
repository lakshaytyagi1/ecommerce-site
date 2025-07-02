package com.example.simpleWebApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Product {
    @Id
    private int prodId;
    private int price;
    private String prodName;

    public  Product(){

    }

}
