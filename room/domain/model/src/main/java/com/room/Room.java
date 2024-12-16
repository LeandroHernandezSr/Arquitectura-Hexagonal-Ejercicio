package com.room;

import java.util.Date;

public class Room {

    private String name;
    private Integer capacity;
    private Boolean available;
    private Date date;

    public Room(String name, Integer capacity, Boolean available,Date date) {
        this.name = name;
        this.capacity = capacity;
        this.available = available;
        this.date = date;
    }

    public Room() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
