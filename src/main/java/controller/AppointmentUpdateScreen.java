package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import model.Appointment;
import model.Contact;
import model.Customer;
import model.MeridiemIndicator;
import model.TableItem;
import model.User;

import java.io.IOException;

import static model.Inventory.*;

public class AppointmentUpdateScreen implements SendItem {

    Appointment appointment;
    AppointmentForm appointmentForm;

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private TextField appointmentIdTextField;

    @FXML
    private TextField titleTextField;

    @FXML
    private TextField descriptionTextField;

    @FXML
    private TextField locationTextField;

    @FXML
    private TextField postalCodeTextField;

    @FXML
    private ComboBox<Contact> contactComboBox;

    @FXML
    private TextField typeTextField;

    @FXML
    private DatePicker startDatePicker;

    @FXML
    private ComboBox<Integer> startTimeHourComboBox;
    @FXML

    private ComboBox<Integer> startTimeMinuteComboBox;

    @FXML
    private ChoiceBox<MeridiemIndicator> startTimeMeridiemChoiceBox;

    @FXML
    private DatePicker endDatePicker;

    @FXML
    private ComboBox<Integer> endTimeHourComboBox;

    @FXML
    private ComboBox<Integer> endTimeMinuteComboBox;

    @FXML
    private ChoiceBox<MeridiemIndicator> endTimeMeridiemChoiceBox;

    @FXML
    private ComboBox<Customer> customerComboBox;

    @FXML
    private ComboBox<User> userComboBox;

    @FXML
    private Button updateAppointmentButton;

    @FXML
    private Button clearButton;

    @FXML
    private Button appointmentDetailScreenButton;

    @FXML
    private Button customerDetailScreenButton;

    @FXML
    public void initialize(){
//        AppointmentForm.initializeAppointmentForm(contactComboBox, startTimeHourComboBox, startTimeMinuteComboBox, startTimeMeridiemChoiceBox, endTimeHourComboBox, endTimeMinuteComboBox, endTimeMeridiemChoiceBox, customerComboBox, userComboBox);
    }

    @FXML
    void clearButtonHandler(ActionEvent event) {
        appointmentForm.clearForm();
    }

    @FXML
    void updateAppointmentButtonHandler(ActionEvent event) {

    }

    @FXML
    void appointmentDetailScreenButtonHandler(ActionEvent appointmentDetailScreenButtonSelected) throws IOException {
        ScreenControls screenControls = new ScreenControls(appointmentDetailScreenButtonSelected);
        screenControls.switchScreens(ScreenControls.APPOINTMENT_DETAIL_SCREEN_URL);
    }

    @FXML
    void customerDetailScreenButtonHandler(ActionEvent customerDetailScreenButtonSelected) throws IOException {
        ScreenControls screenControls = new ScreenControls(customerDetailScreenButtonSelected);
        screenControls.switchScreens(ScreenControls.CUSTOMER_DETAIL_SCREEN_URL);
    }

    @Override
    public <T extends TableItem> void sendItem(T appointment) {
            this.appointment = (Appointment) appointment;
            this.appointmentIdTextField.setText(String.valueOf(this.appointment.getAppointment_ID()));
            this.titleTextField.setText(this.appointment.getTitle());
            this.descriptionTextField.setText(this.appointment.getDescription());
            this.locationTextField.setText(this.appointment.getLocation());
            this.contactComboBox.getSelectionModel().select(contactList.lookup(this.appointment.getContact_ID()));
            this.typeTextField.setText(this.appointment.getType());
            this.startDatePicker.setValue(this.appointment.getStartDate());
            this.startTimeHourComboBox.getSelectionModel().select(this.appointment.getStartHour());
            this.startTimeMinuteComboBox.getSelectionModel().select(this.appointment.getStartMinute());
            this.startTimeMeridiemChoiceBox.getSelectionModel().select(this.appointment.getStartMeridiem());
            this.endDatePicker.setValue(this.appointment.getEndDate());
            this.endTimeHourComboBox.getSelectionModel().select(this.appointment.getEndHour());
            this.endTimeMinuteComboBox.getSelectionModel().select(this.appointment.getEndMinute());
            this.endTimeMeridiemChoiceBox.getSelectionModel().select(this.appointment.getEndMeridiem());
            this.customerComboBox.getSelectionModel().select(customerList.lookup(this.appointment.getCustomer_ID()));
            this.userComboBox.getSelectionModel().select(userList.lookup(this.appointment.getUser_ID()));
            appointmentForm = new AppointmentForm(this.appointment.getAppointment_ID(), titleTextField, descriptionTextField, locationTextField, contactComboBox, typeTextField, startDatePicker, startTimeHourComboBox, startTimeMinuteComboBox, startTimeMeridiemChoiceBox, endDatePicker, endTimeHourComboBox, endTimeMinuteComboBox, endTimeMeridiemChoiceBox, customerComboBox, userComboBox);
    }

}
