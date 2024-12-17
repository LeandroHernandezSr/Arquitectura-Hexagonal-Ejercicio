package com.room;

import com.room.in.FindRoomByNameUseCase;
import com.room.out.RoomRepository;

public class FindRoomByName implements FindRoomByNameUseCase {

    private final RoomRepository repository;

    public FindRoomByName(RoomRepository repository) {
        this.repository = repository;
    }

    @Override
    public void apply(Room room) {
        repository.findRoomByName(room);
    }

}
