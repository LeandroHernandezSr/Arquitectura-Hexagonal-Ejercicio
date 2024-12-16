package com.room;

import com.room.in.CreateRoomUseCase;
import com.room.out.RoomRepository;

public class CreateRoomUseCaseImpl implements CreateRoomUseCase {

    private final RoomRepository roomRepository;

    public CreateRoomUseCaseImpl(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @Override
    public void apply(Room room) {
        roomRepository.save(room);
    }
}
