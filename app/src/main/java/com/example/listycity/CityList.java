package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps a list of city objects.
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not already exist.
     * @param city
     *      This is a candidate city to add.
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }


    /**
     * Getter method for list of cities
     * @return list: list of cities
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * Method for checking if a city already exists in the list of cities
     * @param city: City object to be checked in the list
     * @return true if it exists, false if it does not.
     */
    public boolean hasCity(City city) {
        for (City c : cities) {
            if (c.equals(city)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Method to delete a city from the list
     * @param city: city to be deleted from list
     */
    public void deleteCity(City city) {
        for (int i = 0; i < cities.size(); i++) {
            if (cities.get(i).equals(city)) {
                cities.remove(i);
            }
        }
    }

    /**
     * Method to count the number of cities in the list
     * @return int: Size of cities list
     */
    public int countCities() {
        return this.cities.size();
    }
}
