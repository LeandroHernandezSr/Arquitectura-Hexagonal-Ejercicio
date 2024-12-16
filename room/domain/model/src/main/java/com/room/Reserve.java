package com.room;

import java.time.LocalDate;

public class Reserve {

    private LocalDate date;
    private Room room;

    public Reserve(){}

    public Reserve(LocalDate date, Room room) {
        this.date = date;
        this.room = room;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
