package model;

import java.time.OffsetDateTime;

public class User implements TableItem {
    private int User_ID;
    private String User_Name;
    private String Password;
    private OffsetDateTime Create_Date;
    private String Created_By;
    private OffsetDateTime Last_Update;
    private String Last_Updated_By;

    public int getUser_ID() {
        return User_ID;
    }

    public void setUser_ID(int user_ID) {
        User_ID = user_ID;
    }

    public String getUser_Name() {
        return User_Name;
    }

    public void setUser_Name(String user_Name) {
        User_Name = user_Name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public OffsetDateTime getCreate_Date() {
        return Create_Date;
    }

    public void setCreate_Date(OffsetDateTime create_Date) {
        Create_Date = create_Date;
    }

    public String getCreated_By() {
        return Created_By;
    }

    public void setCreated_By(String created_By) {
        Created_By = created_By;
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

    @Override
    public int getId() {
        return User_ID;
    }

    @Override
    public String getName() {
        return User_Name;
    }
}
