package com.example.intend;

public class User {
    // поля сущности
    private String id;
    private String place;
    private String time;
    private String count;

    // необходимый конструктор
    public User(String name, String address, String email, String count) {
        this.id = name;
        this.place = address;
        this.time = email;
        this.count = this.count;
    }

    // геттеры и сеттеры

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }
}
