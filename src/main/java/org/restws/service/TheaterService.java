package org.restws.service;

import org.restws.database.DatabaseClass;
import org.restws.exception.NotFound;
import org.restws.model.Theater;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TheaterService {
    private  Map<Long, Theater> theaters = DatabaseClass.getTheaters();

    public List<Theater> getAllTheaters() {
        return new ArrayList<Theater>(theaters.values());
    }
    public Theater getTheater(long id) {
        Theater theater = theaters.get(id);
        if(theater == null){
            throw new NotFound("Theater with id " + id + " not found");
        }
        return theater;
    }
    public Theater addTheater(Theater theater) {
        theater.setId(theaters.size() + 1);
        theaters.put(theater.getId(), theater);
        return theater;
    }
    public Theater updateTheater(Theater theater) {
        if(theater.getId() <= 0) {
            return null;
        }
        theaters.put(theater.getId(), theater);
        return theater;
    }
    public Theater removeTheater(long id) {
        return theaters.remove(id);
    }

}
