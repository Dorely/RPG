package model;

import control.character.Actor;

/**
 * Created by jonth on 3/11/2016.
 */
public class Event {

    String eventType;
    String name;
    //Actor[] actors;
    String description;

    public Event(String eventType, String name, String description) {
        this.eventType = eventType;
        this.name = name;
        this.description = description;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
