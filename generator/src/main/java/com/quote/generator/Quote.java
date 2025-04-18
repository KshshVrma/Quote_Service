package com.quote.generator;

public class Quote {
    private String name;
    private double price;

    // Default constructor (required for Spring)
    public Quote() {}

    // Constructor
    public Quote(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{name='" + name + "', price=" + price + "}";
    }
}
