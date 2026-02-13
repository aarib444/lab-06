package com.example.listycity;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CityListTest {
    private CityList mockCityList() {
        CityList cityList = new CityList();
        cityList.add(mockCity());
        return cityList;
    }

    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }

    @Test
    void testAdd() {
        CityList cityList = mockCityList();
        assertEquals(1, cityList.getCities().size());
        City city = new City("Regina", "Sakatchewan");
        cityList.add(city);
        assertEquals(2, cityList.getCities().size());
        assertTrue(cityList.getCities().contains(city));
    }

    @Test
    void testAddException() {
        CityList cityList = mockCityList();
        City city = new City("Calgary", "Alberta");
        cityList.add(city);
        assertThrows(IllegalArgumentException.class, () -> {
            cityList.add(city);
        });
    }

    @Test
    void testGetCities() {
        CityList cityList = mockCityList();
        assertEquals(0, mockCity().compareTo(cityList.getCities().get(0)));
        City city = new City("Charlottetown", "Prince Edward Island");
        cityList.add(city);
        assertEquals(0, city.compareTo(cityList.getCities().get(0)));
        assertEquals(0, mockCity().compareTo(cityList.getCities().get(1)));
    }

    @Test
    void testHasCity() {
        CityList cityList = mockCityList();
        City city = new City("Edmonton", "Alberta");
        assertEquals(true, cityList.hasCity(city));
        city = new City("Calgary", "Alberta");
        assertEquals(false, cityList.hasCity(city));
        city = null;
        assertEquals(false, cityList.hasCity(city));
        assertEquals(true, cityList.hasCity(mockCity()));
    }

    @Test
    void testDeleteCity() {
        CityList cityList = mockCityList();
        City city = new City("Edmonton", "Alberta");
        cityList.deleteCity(city);
        assertEquals(0, cityList.getCities().size());
        cityList = mockCityList();
        city = new City("Calgary", "Alberta");
        cityList.deleteCity(city);
        assertEquals(1, cityList.getCities().size());
    }

    @Test
    void testCountCities() {
        CityList cityList = mockCityList();
        assertEquals(1, cityList.countCities());
        City city1 = new City("A", "A");
        cityList.add(city1);
        assertEquals(2, cityList.countCities());
        City city2 = new City("B", "B");
        cityList.add(city2);
        City city3 = new City("C", "C");
        cityList.add(city3);
        City city4 = new City("D", "D");
        cityList.add(city4);
        City city5 = new City("E", "E");
        cityList.add(city5);
        assertEquals(6, cityList.countCities());
    }
}
