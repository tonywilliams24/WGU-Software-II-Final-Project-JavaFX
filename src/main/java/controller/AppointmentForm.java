package controller;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import model.Contact;
import model.Country;
import model.Appointment;
import model.Customer;
import model.DateTime;
import model.First_Level_Division;
import model.MeridiemIndicator;
import model.User;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;

import static controller.inputControls.*;
import static model.Inventory.appointmentList;
import static model.Inventory.customerList;
import static model.MeridiemIndicator.AM;
import static model.MeridiemIndicator.PM;

public class AppointmentForm {

    private int appointment_ID;
    private TextField titleTextField;
    private TextField descriptionTextField;
    private TextField locationTextField;
    private ComboBox<Contact> contactComboBox;
    private TextField typeTextField;
    private DatePicker startDatePicker;
    private ComboBox<Integer> startTimeHourComboBox;
    private ComboBox<Integer> startTimeMinuteComboBox;
    private ChoiceBox<MeridiemIndicator> startTimeMeridiemChoiceBox;
    private DatePicker endDatePicker;
    private ComboBox<Integer> endTimeHourComboBox;
    private ComboBox<Integer> endTimeMinuteComboBox;
    private ChoiceBox<MeridiemIndicator> endTimeMeridiemChoiceBox;
    private ComboBox<Customer> customerComboBox;
    private ComboBox<User> userComboBox;
    private Appointment appointment;

    public AppointmentForm(int appointment_ID, TextField titleTextField, TextField descriptionTextField, TextField locationTextField, ComboBox<Contact> contactComboBox, TextField typeTextField, DatePicker startDatePicker, ComboBox<Integer> startTimeHourComboBox, ComboBox<Integer> startTimeMinuteComboBox, ChoiceBox<MeridiemIndicator> startTimeMeridiemChoiceBox, DatePicker endDatePicker, ComboBox<Integer> endTimeHourComboBox, ComboBox<Integer> endTimeMinuteComboBox, ChoiceBox<MeridiemIndicator> endTimeMeridiemChoiceBox, ComboBox<Customer> customerComboBox, ComboBox<User> userComboBox) {
        this.appointment_ID = appointment_ID;
        this.titleTextField = titleTextField;
        this.descriptionTextField = descriptionTextField;
        this.locationTextField = locationTextField;
        this.contactComboBox = contactComboBox;
        this.typeTextField = typeTextField;
        this.startDatePicker = startDatePicker;
        this.startTimeHourComboBox = startTimeHourComboBox;
        this.startTimeMinuteComboBox = startTimeMinuteComboBox;
        this.startTimeMeridiemChoiceBox = startTimeMeridiemChoiceBox;
        this.endDatePicker = endDatePicker;
        this.endTimeHourComboBox = endTimeHourComboBox;
        this.endTimeMinuteComboBox = endTimeMinuteComboBox;
        this.endTimeMeridiemChoiceBox = endTimeMeridiemChoiceBox;
        this.customerComboBox = customerComboBox;
        this.userComboBox = userComboBox;
    }

    public void initializeAppointmentForm(ComboBox<Contact> contactComboBox, ComboBox<Integer> startTimeHourComboBox, ComboBox<Integer> startTimeMinuteComboBox, ChoiceBox<MeridiemIndicator> startTimeMeridiemChoiceBox, ComboBox<Integer> endTimeHourComboBox, ComboBox<Integer> endTimeMinuteComboBox, ChoiceBox<MeridiemIndicator> endTimeMeridiemChoiceBox, ComboBox<Customer> customerComboBox, ComboBox<User> userComboBox) {
        setContactComboBox(contactComboBox);
        setHourComboBox(startTimeHourComboBox);
        setMinuteComboBox(startTimeMinuteComboBox);
        setMeridiemChoiceBox(startTimeMeridiemChoiceBox);
        setHourComboBox(endTimeHourComboBox);
        setMinuteComboBox(endTimeMinuteComboBox);
        setMeridiemChoiceBox(endTimeMeridiemChoiceBox);
        setCustomerComboBox(customerComboBox);
        setUserComboBox(userComboBox);
    }

    public void initializeAppointmentForm() {
        initializeAppointmentForm(contactComboBox,startTimeHourComboBox,startTimeMinuteComboBox,startTimeMeridiemChoiceBox, endTimeHourComboBox, endTimeMinuteComboBox, endTimeMeridiemChoiceBox, customerComboBox, userComboBox);
    }

    public TextField getTitleTextField() {
        return titleTextField;
    }

    public TextField getDescriptionTextField() {
        return descriptionTextField;
    }

    public TextField getLocationTextField() {
        return locationTextField;
    }

    public ComboBox<Contact> getContactComboBox() {
        return contactComboBox;
    }

    public TextField getTypeTextField() {
        return typeTextField;
    }

    public DatePicker getStartDatePicker() {
        return startDatePicker;
    }

    public ComboBox<Integer> getStartTimeHourComboBox() {
        return startTimeHourComboBox;
    }

    public ComboBox<Integer> getStartTimeMinuteComboBox() {
        return startTimeMinuteComboBox;
    }

    public ChoiceBox<MeridiemIndicator> getStartTimeMeridiemChoiceBox() {
        return startTimeMeridiemChoiceBox;
    }

    public DatePicker getEndDatePicker() {
        return endDatePicker;
    }

    public ComboBox<Integer> getEndTimeHourComboBox() {
        return endTimeHourComboBox;
    }

    public ComboBox<Integer> getEndTimeMinuteComboBox() {
        return endTimeMinuteComboBox;
    }

    public ChoiceBox<MeridiemIndicator> getEndTimeMeridiemChoiceBox() {
        return endTimeMeridiemChoiceBox;
    }

    public ComboBox<Customer> getCustomerComboBox() {
        return customerComboBox;
    }

    public ComboBox<User> getUserComboBox() {
        return userComboBox;
    }

    public int getAppointment_ID() {
        return appointment_ID;
    }

    public String getAppointment_ID_String() {
        return Integer.toString(appointment_ID);
    }

    public void submitAddAppointment() {
        addToAppointmentList();
        clearForm();
    }

    public void submitUpdateAppointment() {
        updateAppointmentList();
        clearForm();
    }

    private void addToAppointmentList() {
        appointmentList.add(appointment);
    }

    private void updateAppointmentList() {
        appointment = new Appointment(this);
        appointmentList.update(appointment);
    }

    public void clearForm() {
        inputControls.clearTextFields(titleTextField, descriptionTextField, locationTextField, typeTextField);
        inputControls.clearComboBoxes(contactComboBox, startTimeHourComboBox, startTimeMinuteComboBox, endTimeHourComboBox, endTimeMinuteComboBox, customerComboBox, userComboBox);
        inputControls.clearChoiceBoxes(startTimeMeridiemChoiceBox, endTimeMeridiemChoiceBox);
        inputControls.clearDatePicker(startDatePicker, endDatePicker);
    }

}
