package com.volvo.backend.domain;

public class Car {
    
    private String model;
    private String imageUrl;
    private Double price;

    public Car(String model, String imageUrl, Double price) {
        this.model = model;
        this.imageUrl = imageUrl;
        this.price = price;
    }


    public Car() {
    }

    
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    
}
