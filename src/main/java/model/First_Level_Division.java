package model;

import java.time.OffsetDateTime;

public class First_Level_Division {
    private int Division_ID;
    private String Division;
    private OffsetDateTime Create_Date;
    private OffsetDateTime Last_Update;
    private String Last_Updated_By;
    private int COUNTRY_ID;

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

    public OffsetDateTime getCreate_Date() {
        return Create_Date;
    }

    public void setCreate_Date(OffsetDateTime create_Date) {
        Create_Date = create_Date;
    }

    public OffsetDateTime getLast_Update() {
        return Last_Update;
    }

    public void setLast_Update(OffsetDateTime last_Update) {
        Last_Update = last_Update;
    }

    public String getLast_Updated_By() {
        return Last_Updated_By;
    }

    public void setLast_Updated_By(String last_Updated_By) {
        Last_Updated_By = last_Updated_By;
    }

    public int getCOUNTRY_ID() {
        return COUNTRY_ID;
    }

    public void setCOUNTRY_ID(int COUNTRY_ID) {
        this.COUNTRY_ID = COUNTRY_ID;
    }
}
