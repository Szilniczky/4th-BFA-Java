package com.codecool.szilniczky;

/**
 * Created by szilniczky on 2017.06.01..
 */
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World");
        Landmark landmark = new Landmark(5, 10, "mountain", 400);
        City city = new City(7, 6, "London");
        UserLocation userLocation = UserLocation.getInstance();
    }

}
