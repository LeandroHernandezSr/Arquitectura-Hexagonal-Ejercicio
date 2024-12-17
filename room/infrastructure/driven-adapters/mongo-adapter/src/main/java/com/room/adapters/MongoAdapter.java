package com.room.adapters;

import com.room.Room;
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
        mongoTemplate.save(room);
    }

    @Override
    public Room findRoomByName(Room room) {
        return null;
    }
}
