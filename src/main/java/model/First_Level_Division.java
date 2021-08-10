package model;

import java.time.OffsetDateTime;

public class First_Level_Division extends TableItem {
    private int Division_ID;
    private String Division;
    private int COUNTRY_ID;

    public First_Level_Division() {
        super();
    }
    public First_Level_Division(int division_ID, String division, int COUNTRY_ID) {
        super();
        Division_ID = division_ID;
        Division = division;
        this.COUNTRY_ID = COUNTRY_ID;
    }
    public First_Level_Division(int division_ID, String division, OffsetDateTime create_Date, String created_By, OffsetDateTime last_Update, String last_Updated_By, int COUNTRY_ID) {
        Division_ID = division_ID;
        Division = division;
        Create_Date = create_Date;
        Created_By = created_By;
        Last_Update = last_Update;
        Last_Updated_By = last_Updated_By;
        this.COUNTRY_ID = COUNTRY_ID;
    }



    public int getDivision_ID() {
        return Division_ID;
    }

    public void setDivision_ID(int division_ID) {
        Division_ID = division_ID;
    }

    public String getDivision() {
        return Division;
    }

    public void setDivision(String division) {
        Division = division;
    }

    public int getCOUNTRY_ID() {
        return COUNTRY_ID;
    }

    public void setCOUNTRY_ID(int COUNTRY_ID) {
        this.COUNTRY_ID = COUNTRY_ID;
    }

    @Override
    public int getId() {
        return Division_ID;
    }

    @Override
    public String getName() {
        return Division;
    }

    @Override
    public String toString() {
        return Division;
    }
}
