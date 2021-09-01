package com.company;

public class Car {

    private String make;
    private String model;
    private String color;
    private int price;
    private boolean rented;
    private String customerName;


    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isRented() {
        return rented;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }

    public Car (String make, String model, String color, int price, boolean rented){
        this.make = make;
        this.model = model;
        this.color = color;
        this.price = price;
        this.rented = rented;
    }

}
