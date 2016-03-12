package view;

import model.Event;

import java.util.Scanner;

/**
 * Created by jonth on 3/11/2016.
 */
public class DisplayEvent {



    public static String doEvent(Event event){

        Scanner input = new Scanner(System.in);

        System.out.println(event.getEventType());
        System.out.println(event.getName());
        System.out.println(event.getDescription());

        System.out.println("What do you do!");

        System.out.print("Response:");
        String choice = input.nextLine();

        return choice;
    }



}
