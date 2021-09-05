package model;

import controller.AppointmentForm;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.util.StringJoiner;

import static controller.inputControls.SYSTEM_ZONE_OFFSET;
import static model.Inventory.appointmentList;
import static model.MeridiemIndicator.AM;
import static model.MeridiemIndicator.PM;

public class Appointment extends TableItem {
    private Integer Appointment_ID;
    private String Title;
    private String Description;
    private String Location;
    private String Type;
    private DateTime Start;
    private DateTime End;
    private Integer Customer_ID;
    private Integer User_ID;
    private Integer Contact_ID;

    public Appointment(){
        super();
    }

    public Appointment(Integer appointment_ID, String title, String description, String location, String type, DateTime start, DateTime end, Integer customer_ID, Integer user_ID, Integer contact_ID) {
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

    public Appointment(Integer appointment_ID, String title, String description, String location, String type, DateTime start, DateTime end,  DateTime create_Date, String created_By, DateTime last_Update, String last_Updated_By, Integer customer_ID, Integer user_ID, Integer contact_ID) {
        this(appointment_ID,title,description,location,type,start,end,customer_ID,user_ID,contact_ID);
        Create_Date = create_Date;
        Created_By = created_By;
        Last_Update = last_Update;
        Last_Updated_By = last_Updated_By;
    }
    
    public Appointment(AppointmentForm appointmentForm) {
        super();
        Appointment_ID = appointmentForm.getAppointment_ID();
        Title = appointmentForm.getTitleTextField().getText().trim();
        Description = appointmentForm.getDescriptionTextField().getText().trim();
        Location = appointmentForm.getLocationTextField().getText().trim();
        Type = appointmentForm.getTypeTextField().getText().trim();
        Customer_ID = appointmentForm.getCustomerComboBox().getSelectionModel().getSelectedItem().getCustomer_ID();
        User_ID = appointmentForm.getUserComboBox().getSelectionModel().getSelectedItem().getUser_ID();
        Contact_ID = appointmentForm.getContactComboBox().getSelectionModel().getSelectedItem().getContact_ID();
        LocalDate startLocalDate = appointmentForm.getStartDatePicker().getValue();
        Integer startTimeHour = appointmentForm.getStartTimeHourComboBox().getValue();
        Integer startTimeMinute = appointmentForm.getStartTimeMinuteComboBox().getValue();
        LocalTime startLocalTime = LocalTime.of(startTimeHour, startTimeMinute);
        Start = new DateTime(OffsetDateTime.of(startLocalDate, startLocalTime, SYSTEM_ZONE_OFFSET));
        LocalDate endLocalDate = appointmentForm.getEndDatePicker().getValue();
        Integer endTimeHour = appointmentForm.getEndTimeHourComboBox().getValue();
        Integer endTimeMinute = appointmentForm.getEndTimeMinuteComboBox().getValue();
        LocalTime endLocalTime = LocalTime.of(endTimeHour, endTimeMinute);
        End = new DateTime(OffsetDateTime.of(endLocalDate, endLocalTime, SYSTEM_ZONE_OFFSET));
   }

    public Integer getAppointment_ID() {
        return Appointment_ID;
    }

    public void setAppointment_ID(Integer appointment_ID) {
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

    public DateTime getStart() {
        return Start;
    }

    public void setStart(DateTime start) {
        Start = start;
    }

    public DateTime getEnd() {
        return End;
    }

    public void setEnd(DateTime end) {
        End = end;
    }

    public Integer getCustomer_ID() {
        return Customer_ID;
    }

    public void setCustomer_ID(Integer customer_ID) {
        Customer_ID = customer_ID;
    }

    public Integer getUser_ID() {
        return User_ID;
    }

    public void setUser_ID(Integer user_ID) {
        User_ID = user_ID;
    }

    public Integer getContact_ID() {
        return Contact_ID;
    }

    public void setContact_ID(Integer contact_ID) {
        Contact_ID = contact_ID;
    }


    @Override
    public int getId() {
        return Appointment_ID;
    }

    @Override
    public String getIdString() {
        return Integer.toString(Appointment_ID);
    }

    @Override
    public String getName() {
        return Title;
    }


    @Override
    public String toString() {
        return new StringJoiner("\n", Appointment.class.getSimpleName() + ": \n", "")
                .add("Appointment_ID: " + Appointment_ID)
                .add("Title: '" + Title + "'")
                .add("Description: '" + Description + "'")
                .add("Location: '" + Location + "'")
                .add("Type: '" + Type + "'")
                .add("Start: " + Start)
                .add("End: " + End)
                .add("Customer_ID: " + Customer_ID)
                .add("User_ID: " + User_ID)
                .add("Contact_ID: " + Contact_ID)
                .add("Id: " + Id)
                .add("Create_Date: " + Create_Date)
                .add("Created_By: '" + Created_By + "'")
                .add("Last_Update: " + Last_Update)
                .add("Last_Updated_By: '" + Last_Updated_By + "'")
                .toString();
    }

    public LocalDate getStartDate() {
        return Start.getLocalDate();
    }

    public LocalTime getStartTime() {
        return Start.getLocalTime();
    }

    public Integer getStartHour() {
        return Start.getHour();
    }

    public Integer getStartMinute() {
        return Start.getMinute();
    }

    public MeridiemIndicator getStartMeridiem() {
        return Start.getMeridiem();
    }

    public LocalDate getEndDate() {
        return End.getLocalDate();
    }

    public LocalTime getEndTime() {
        return End.getLocalTime();
    }

    public MeridiemIndicator getEndMeridiem() {
        return End.getMeridiem();
    }


    public Integer getEndHour() {
        return End.getHour();
    }

    public Integer getEndMinute() {
        return End.getMinute();
    }
}
