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
    private int startTimeHour;
    private Integer startTimeMinute;
    private LocalTime startTime;
    private MeridiemIndicator startMeridiem;
    private LocalDate startDate;
    private int endTimeHour;
    private Integer endTimeMinute;
    private LocalTime endTime;
    private MeridiemIndicator endMeridiem;
    private LocalDate endDate;
    private int Appointment_ID;
    private String Title;
    private String Description;
    private String Location;
    private String Type;
    private DateTime Start;
    private DateTime End;
    private int Customer_ID;
    private int User_ID;
    private int Contact_ID;

    public Appointment(){
        super();
    }

    public Appointment(int appointment_ID, String title, String description, String location, String type, DateTime start, DateTime end, int customer_ID, int user_ID, int contact_ID) {
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
        LocalDateTime startLocalDateTime = start.getLocalDateTime();
        LocalDateTime endLocalDateTime = end.getLocalDateTime();
        startDate = LocalDate.from(startLocalDateTime);
        startTime = LocalTime.from(startLocalDateTime);
////        startTimeHour =
//        startTimeMinute = appointmentForm.getStartTimeMinuteComboBox().getItems().get(0);
//        startMeridiem = appointmentForm.getStartTimeMeridiemChoiceBox().getItems().get(0);
        endDate = LocalDate.from(endLocalDateTime);
        endTime = LocalTime.from(endLocalDateTime);
//        endTimeHour = appointmentForm.getEndTimeHourComboBox().getItems().get(0);
//        endTimeMinute = appointmentForm.getEndTimeMinuteComboBox().getItems().get(0);
//        endMeridiem = appointmentForm.getEndTimeMeridiemChoiceBox().getItems().get(0);
    }

    public Appointment(int appointment_ID, String title, String description, String location, String type, DateTime start, DateTime end,  DateTime create_Date, String created_By, DateTime last_Update, String last_Updated_By, int customer_ID, int user_ID, int contact_ID) {
        this(appointment_ID,title,description,location,type,start,end,customer_ID,user_ID,contact_ID);
        Create_Date = create_Date;
        Created_By = created_By;
        Last_Update = last_Update;
        Last_Updated_By = last_Updated_By;
    }
    
    public Appointment(AppointmentForm appointmentForm) {
        Appointment_ID = appointmentForm.getAppointment_ID();
        Title = appointmentForm.getTitleTextField().getText().trim();
        Description = appointmentForm.getDescriptionTextField().getText().trim();
        Location = appointmentForm.getLocationTextField().getText().trim();
        Type = appointmentForm.getTypeTextField().getText().trim();
        Customer_ID = appointmentForm.getCustomerComboBox().getItems().get(0).getId();
        User_ID = appointmentForm.getUserComboBox().getItems().get(0).getId();
        Contact_ID = appointmentForm.getContactComboBox().getItems().get(0).getId();
        startDate = appointmentForm.getStartDatePicker().getValue();
        startTimeHour = appointmentForm.getStartTimeHourComboBox().getItems().get(0);
        startTimeMinute = appointmentForm.getStartTimeMinuteComboBox().getItems().get(0);
        startTime = LocalTime.of(startTimeHour,startTimeMinute);
        startMeridiem = appointmentForm.getStartTimeMeridiemChoiceBox().getItems().get(0);
        if(startMeridiem.equals(PM) && startTimeHour<12) startTimeHour+=12;
        else if(startMeridiem.equals(AM) && startTimeHour==12) startTimeHour-=12;
        Start = new DateTime(OffsetDateTime.of(startDate,startTime, SYSTEM_ZONE_OFFSET));
        endDate = appointmentForm.getEndDatePicker().getValue();
        endTimeHour = appointmentForm.getEndTimeHourComboBox().getItems().get(0);
        endTimeMinute = appointmentForm.getEndTimeMinuteComboBox().getItems().get(0);
        endTime = LocalTime.of(endTimeHour,endTimeMinute);
        endMeridiem = appointmentForm.getEndTimeMeridiemChoiceBox().getItems().get(0);
        if(endMeridiem.equals(PM) && startTimeHour<12) startTimeHour+=12;
        else if(endMeridiem.equals(AM) && startTimeHour==12) startTimeHour-=12;
        End = new DateTime(OffsetDateTime.of(endDate,endTime, SYSTEM_ZONE_OFFSET));
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

    public int getStartTimeHour() {
        return startTimeHour;
    }

    public void setStartTimeHour(int startTimeHour) {
        this.startTimeHour = startTimeHour;
    }

    public Integer getStartTimeMinute() {
        return startTimeMinute;
    }

    public void setStartTimeMinute(Integer startTimeMinute) {
        this.startTimeMinute = startTimeMinute;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public MeridiemIndicator getStartMeridiem() {
        return startMeridiem;
    }

    public void setStartMeridiem(MeridiemIndicator startMeridiem) {
        this.startMeridiem = startMeridiem;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public int getEndTimeHour() {
        return endTimeHour;
    }

    public void setEndTimeHour(int endTimeHour) {
        this.endTimeHour = endTimeHour;
    }

    public Integer getEndTimeMinute() {
        return endTimeMinute;
    }

    public void setEndTimeMinute(Integer endTimeMinute) {
        this.endTimeMinute = endTimeMinute;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public MeridiemIndicator getEndMeridiem() {
        return endMeridiem;
    }

    public void setEndMeridiem(MeridiemIndicator endMeridiem) {
        this.endMeridiem = endMeridiem;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
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
                .add("startTimeHour: " + startTimeHour)
                .add("startTimeMinute: " + startTimeMinute)
                .add("startTime: " + startTime)
                .add("startMeridiem: " + startMeridiem)
                .add("startDate: " + startDate)
                .add("endTimeHour: " + endTimeHour)
                .add("endTimeMinute: " + endTimeMinute)
                .add("endTime: " + endTime)
                .add("endMeridiem: " + endMeridiem)
                .add("endDate: " + endDate)
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
}
