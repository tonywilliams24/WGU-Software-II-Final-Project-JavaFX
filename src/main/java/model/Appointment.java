package model;

import controller.LoginScreen;

import java.time.OffsetDateTime;

public class Appointment extends TableItem {
    private int Appointment_ID;
    private String Title;
    private String Description;
    private String Location;
    private String Type;
    private OffsetDateTime Start;
    private OffsetDateTime End;
    private int Customer_ID;
    private int User_ID;
    private int Contact_ID;

    public Appointment(){
        super();
    }

    public Appointment(int appointment_ID, String title, String description, String location, String type, OffsetDateTime start, OffsetDateTime end, int customer_ID, int user_ID, int contact_ID) {
        super();
        Appointment_ID = appointment_ID;
        Title = title;
        Description = description;
        Location = location;
        Type = type;
        Start = start;
        End = end;
        Customer_ID = customer_ID;
        User_ID = user_ID;
        Contact_ID = contact_ID;
    }

    public Appointment(int appointment_ID, String title, String description, String location, String type, OffsetDateTime start, OffsetDateTime end,  OffsetDateTime create_Date, String created_By, OffsetDateTime last_Update, String last_Updated_By, int customer_ID, int user_ID, int contact_ID) {
        Appointment_ID = appointment_ID;
        Title = title;
        Description = description;
        Location = location;
        Type = type;
        Start = start;
        End = end;
        Create_Date = create_Date;
        Created_By = created_By;
        Last_Update = last_Update;
        Last_Updated_By = last_Updated_By;
        Customer_ID = customer_ID;
        User_ID = user_ID;
        Contact_ID = contact_ID;
    }

    public int getAppointment_ID() {
        return Appointment_ID;
    }

    public void setAppointment_ID(int appointment_ID) {
        Appointment_ID = appointment_ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public OffsetDateTime getStart() {
        return Start;
    }

    public void setStart(OffsetDateTime start) {
        Start = start;
    }

    public OffsetDateTime getEnd() {
        return End;
    }

    public void setEnd(OffsetDateTime end) {
        End = end;
    }

    public int getCustomer_ID() {
        return Customer_ID;
    }

    public void setCustomer_ID(int customer_ID) {
        Customer_ID = customer_ID;
    }

    public int getUser_ID() {
        return User_ID;
    }

    public void setUser_ID(int user_ID) {
        User_ID = user_ID;
    }

    public int getContact_ID() {
        return Contact_ID;
    }

    public void setContact_ID(int contact_ID) {
        Contact_ID = contact_ID;
    }

    @Override
    public int getId() {
        return Appointment_ID;
    }

    @Override
    public String getName() {
        return Title;
    }

}
