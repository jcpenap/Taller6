package com.example.domain;

public class InMemoryWorldDao {
    public static CountryDao getInstance() {
        return new CountryDao();
    }
}
