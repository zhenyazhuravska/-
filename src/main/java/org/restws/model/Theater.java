package org.restws.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.util.HashMap;
import java.util.Map;

@XmlRootElement
public class Theater {

    private long id;
    private String name;
    private String street;

    public Theater() {

    }
    public Theater(long id, String name, String street) {
        this.id = id;
        this.name = name;
        this.street = street;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStreet() {
        return street;
    }

    private Map<Long, Play> books = new HashMap<>();


    @XmlTransient
    public Map<Long, Play> getPlays() {
        return books;
    }
    public void setPlays(Map<Long, Play> books) {
        this.books = books;
    }



}
