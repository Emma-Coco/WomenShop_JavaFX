package com.womenshop.model;

public abstract class Product {

    protected int id;
    protected String name;

    protected double purchasePrice;
    protected double salePrice;
    protected double discountPrice;

    protected int stockQuantity;

    // Constructor
    public Product(int id, String name, double purchasePrice, double salePrice) {
        this.id = id;
        this.name = name;
        this.purchasePrice = purchasePrice;
        this.salePrice = salePrice;

        this.discountPrice = 0;
        this.stockQuantity = 0;
    }
}
