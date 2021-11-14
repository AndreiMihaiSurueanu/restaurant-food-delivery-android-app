package com.example.restaurantfooddeliveryandroidapp.model;

public class BestForYouData {

    String name, time, price, rating;
    Integer imageUrl;

    public BestForYouData(String name, String time, String price, String rating, Integer imageUrl) {
        this.name = name;
        this.time = time;
        this.price = price;
        this.rating = rating;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public String getPrice() {
        return price;
    }

    public String getRating() {
        return rating;
    }

    public Integer getImageUrl() {
        return imageUrl;
    }

}
