package com.room.adapters;

import com.room.Room;
import com.room.entities.RoomEntity;
import com.room.out.RoomRepository;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MongoAdapter implements RoomRepository{

    private final MongoTemplate mongoTemplate;

    public MongoAdapter(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public void save(Room room) {
        RoomEntity roomEntity=new RoomEntity();
        roomEntity.setName(room.getName());
        roomEntity.setDate(room.getDate());
        roomEntity.setAvailable(room.getAvailable());
        roomEntity.setCapacity(room.getCapacity());
        mongoTemplate.save(roomEntity);
    }

    @Override
    public Room findRoomByName(Room room) {
        return null;
    }
}
