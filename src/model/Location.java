package model;

/**
 * Created by jonth on 3/11/2016.
 */
public class Location {

    private String name;
    private Event[] events;
    private boolean discovered;

    public Location(String name, Event[] events, boolean discovered) {
        this.name = name;
        this.events = events;
        this.discovered = discovered;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Event[] getEvents() {
        return events;
    }

    public void setEvents(Event[] events) {
        this.events = events;
    }

    public boolean isDiscovered() {
        return discovered;
    }

    public void setDiscovered(boolean discovered) {
        this.discovered = discovered;
    }
}
