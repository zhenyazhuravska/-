package org.restws.database;

import org.restws.model.Play;
import org.restws.model.Theater;

import java.util.HashMap;
import java.util.Map;

public class DatabaseClass {

    private static Map<Long, Theater> theaters = new HashMap<>();
    private static Map<Long, Play> plays = new HashMap<>();

    public static Map<Long, Theater> getTheaters() {
        return theaters;
    }
    public static Map<Long, Play> getPlays() {
        return plays;
    }
}
