package model;

import java.time.OffsetDateTime;

public abstract class TableItem {

    protected DateTime Create_Date;
    protected String Created_By;
    protected DateTime Last_Update;
    protected String Last_Updated_By;

    public TableItem() {
        this.Create_Date = new DateTime(OffsetDateTime.now());
        this.Created_By = "New User"; //LoginScreen.getLoggedInUserName();
        this.Last_Update = Create_Date;
        this.Last_Updated_By = Created_By;
    }

    public abstract int getId();

    public abstract String getIdString();

    public abstract String getName();

    public boolean equals(TableItem tableItem) {
        return getId() == tableItem.getId();
    }

    public DateTime getCreate_Date() {
        return Create_Date;
    }

    public void setCreate_Date(DateTime create_Date) {
        Create_Date = create_Date;
    }

    public String getCreated_By() {
        return Created_By;
    }

    public void setCreated_By(String created_By) {
        Created_By = created_By;
    }

    public DateTime getLast_Update() {
        return Last_Update;
    }

    public void setLast_Update(DateTime last_Update) {
        Last_Update = last_Update;
    }

    public String getLast_Updated_By() {
        return Last_Updated_By;
    }

    public void setLast_Updated_By(String last_Updated_By) {
        Last_Updated_By = last_Updated_By;
    }
}
