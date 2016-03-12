package control.gameworld;

import model.Event;
import model.Location;
import model.World;

/**
 * Created by jonth on 3/11/2016.
 */
public class WorldController {

    World world;


    public WorldController(){
        world = new World(10,10);//set size of world here
        setWorldLocations();
    }


    public void setWorldLocations(){

        Location[][] locations = world.getLocations();

        for(int i = 0;i<locations.length;i++){
            for (int x = 0;x<locations[i].length;x++){

                Event[] events = new Event[2];
                events[0] = new Event("Gold", "Get Rich", "You found the Motherload");
                events[1] = new Event("Monster", "You are gonna die", "Boogeyman gotcha");
                Location newLocation = new Location("location Name", events, false);

                locations[i][x] = newLocation;
            }
        }

        world.setLocations(locations);
    }

    public Event getLocationEvent(Location location){


        return new Event("Gold", "Get Rich", "You found the Motherload");
    }
}
