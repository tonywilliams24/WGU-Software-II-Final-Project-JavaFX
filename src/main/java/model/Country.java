package model;

import controller.LoginScreen;


public class Country extends TableItem {
    private int Country_ID;
    private String Country;

    public Country() {
        super();
    }

    public Country(int country_ID, String country) {
        super();
        Country_ID = country_ID;
        Country = country;
    }

    public Country(int country_ID, String country, DateTime create_Date, String created_By, DateTime last_Update, String last_Updated_By) {
        Country_ID = country_ID;
        Country = country;
        Create_Date = create_Date;
        Created_By = created_By;
        Last_Update = last_Update;
        Last_Updated_By = last_Updated_By;
    }

    public int getCountry_ID() {
        return Country_ID;
    }

    public void setCountry_ID(int country_ID) {
        Country_ID = country_ID;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    @Override
    public int getId() {
        return Country_ID;
    }

    @Override
    public String getIdString() {
        return Integer.toString(Country_ID);
    }

    @Override
    public String getName() {
        return Country;
    }

    @Override
    public String toString() {
        return Country;
    }
}
