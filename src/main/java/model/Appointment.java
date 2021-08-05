package model;

import java.time.OffsetDateTime;

public class Appointment implements TableItem {
    private int Appointment_ID;
    private String Title;
    private String Description;
    private String Location;
    private String Type;
    private OffsetDateTime Start;
    private OffsetDateTime End;
    private OffsetDateTime Create_Date;
    private String Created_By;
    private OffsetDateTime Last_Update;
    private String Last_Updated_By;
    private int Customer_ID;
    private int User_ID;
    private int Contact_ID;

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
