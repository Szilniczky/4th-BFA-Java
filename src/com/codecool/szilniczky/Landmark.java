package com.codecool.szilniczky;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by szilniczky on 2017.06.01..
 */
public class Landmark extends Location {

    private int entranceFee;

    public Landmark(int x, int y, String name, int entranceFee) {
        super(x, y, name);
        this.entranceFee = entranceFee;
    }

    public void setEntranceFee(int entranceFee) {
        this.entranceFee = entranceFee;
    }
}
