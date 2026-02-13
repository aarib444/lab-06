package com.example.listycity;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable<City>{
    private String city;
    private String province;

    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * City name getter
     * @return string name of city
     */
    String getCityName(){
        return this.city;
    }

    /**
     * City province getter
     * @return string name of province
     */
    String getProvinceName(){
        return this.province;
    }

    /**
     * Method to compare city objects
     * @param o City object to be compared to
     * @return int 0 if they are equal
     */
    @Override
    public  int compareTo(City o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName());
    }

    /**
     * Method to check if city objects are equivalent
     * @param o   the reference object with which to compare.
     * @return boolean, true if they are equal, false if they are not
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        City city = (City) o;
        if (this.city.compareTo(city.getCityName()) == 0 && this.province.compareTo(city.getProvinceName()) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
