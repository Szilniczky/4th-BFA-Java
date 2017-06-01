package com.codecool.szilniczky;

/**
 * Created by szilniczky on 2017.06.01..
 */
public abstract class Location {

    private int x;
    private int y;
    private String name;

    public Location(int x, int y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
