package model;

import java.time.OffsetDateTime;

public class User extends TableItem {
    private int User_ID;
    private String User_Name;
    private String Password;

    public User() {
        super();
    }

    public User(int user_ID, String user_Name, String password) {
        super();
        User_ID = user_ID;
        User_Name = user_Name;
        Password = password;
    }

    public User(int user_ID, String user_Name, String password, OffsetDateTime create_Date, String created_By, OffsetDateTime last_Update, String last_Updated_By) {
        User_ID = user_ID;
        User_Name = user_Name;
        Password = password;
        Create_Date = create_Date;
        Created_By = created_By;
        Last_Update = last_Update;
        Last_Updated_By = last_Updated_By;
    }

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

    @Override
    public int getId() {
        return User_ID;
    }

    @Override
    public String getName() {
        return User_Name;
    }
}
