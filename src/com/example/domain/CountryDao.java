package com.example.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountryDao {
    public List<Country> findAllCountries() {
        List<Country> countries = getCountries();
        return countries;
    }

    private List<Country> getCountries() {
        List<Country> countries = new ArrayList<>();
        Country c1 = new Country("01", "Colombia", "America", 50000000,
                50.7, 4.5, 1);
        c1.setCities(Arrays.asList(new City(1, "Bogotá","01", 10000000),
                new City(2, "Barranquilla","01", 2000000),
                new City(3, "Medellin","01", 4000000)));
        countries.add(c1);
        Country c2 = new Country("02", "Italia", "Europa", 15000000,
                50.7, 4.5, 1);
        c2.setCities(Arrays.asList(new City(1, "Roma","02", 6000000),
                new City(2, "Milan","02", 1000000),
                new City(3, "Napoles","02", 3000000)));
        countries.add(c2);
        return countries;
    }
}
