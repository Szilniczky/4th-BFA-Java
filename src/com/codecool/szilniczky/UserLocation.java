package com.codecool.szilniczky;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by szilniczky on 2017.06.01..
 */
public class UserLocation extends Location {

    private List<Coordinate> coordinates;
    private static UserLocation location = null;

    public static UserLocation getInstance(){
        if (location==null){
            location = new UserLocation(5, 2, "London");
        }
        return location;
    }

    private UserLocation(int x, int y, String name) {
        super(x, y, name);
        coordinates = new ArrayList<>();
    }

    public void history(Coordinate coordinate){
        coordinates.add(coordinate);
    }


}
