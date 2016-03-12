package control.gameworld;

import model.Event;
import view.DisplayEvent;

import java.util.Scanner;

/**
 * Created by jonth on 3/11/2016.
 */
public class GameController {

    WorldController worldControl;
    LocationController locationController;
    EventController eventController;

    public GameController(){
        worldControl = new WorldController();
        locationController = new LocationController();
        eventController = new EventController();
    }


    public void playGame(){

        DisplayEvent.doEvent(new Event("Gold", "Get Rich", "You found the Motherload"));

    }

}
