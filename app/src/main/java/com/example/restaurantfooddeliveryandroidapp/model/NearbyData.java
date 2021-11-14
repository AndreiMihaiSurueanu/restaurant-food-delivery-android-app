package com.example.restaurantfooddeliveryandroidapp.model;

public class NearbyData {

    String name, time;
    Integer imageUrl;

    public NearbyData(String name, String time, Integer imageUrl) {
        this.name = name;
        this.time = time;
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

    public Integer getImageUrl() {
        return imageUrl;
    }

}
