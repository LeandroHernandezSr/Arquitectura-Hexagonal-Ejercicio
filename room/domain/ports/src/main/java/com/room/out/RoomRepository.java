package com.room.out;

import com.room.Room;

public interface RoomRepository {
    void save(Room room);
    Room findRoomByName(Room room);
}
