package org.restws.service;

import org.restws.database.DatabaseClass;
import org.restws.exception.NotFound;
import org.restws.model.Play;
import org.restws.model.Theater;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PlayService {
    private Map<Long, Theater> theaters = DatabaseClass.getTheaters();

    public List<Play> getAllPlays(long theaterId) {
        Map<Long, Play> plays = theaters.get(theaterId).getPlays();
        return new ArrayList<Play>(plays.values());
    }
    public Play getPlay(long theaterId, long playId) {
        Map<Long, Play> plays = theaters.get(theaterId).getPlays();
        Play play = plays.get(playId);
        if(play == null){
            throw new NotFound("Play with id " + playId + " not found");
        }
        return play;
    }
    public Play addPlay(long theaterId, Play play) {
        Map<Long, Play> plays = theaters.get(theaterId).getPlays();
        play.setId(plays.size() + 1);
        plays.put(play.getId(), play);
        return play;
    }
    public Play updatePlay(long theaterId, Play play) {
        Map<Long, Play> plays = theaters.get(theaterId).getPlays();
        if(play.getId() <= 0) {
            return null;
        }
        plays.put(play.getId(), play);
        return play;
    }
    public Play removePlay(long theaterId, long playId) {
        Map<Long, Play> plays = theaters.get(theaterId).getPlays();
        return plays.remove(playId);
    }
}
