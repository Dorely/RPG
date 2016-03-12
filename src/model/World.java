package model;

/**
 * Created by jonth on 3/11/2016.
 */
public class World {

    int rows;
    int columns;
    Location[][] locations;


    public World(int rows, int columns){
        this.rows = rows;
        this.columns = columns;

        locations = new Location[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }
}
