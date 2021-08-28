package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Appointment;
import model.Contact;
import model.Customer;
import model.MeridiemIndicator;
import model.User;

import java.io.IOException;

import static controller.inputControls.setCountryComboBox;
import static controller.inputControls.setFirstLevelDivisionComboBox;
import static model.Inventory.*;

public class AppointmentUpdateScreen {

    Appointment appointment;

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
    void clearButtonHandler(ActionEvent event) {

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

    public void sendAppointment(Appointment appointment) {
        this.appointment = appointment;
        this.appointmentIdTextField.setText(String.valueOf(appointment.getAppointment_ID()));
        this.titleTextField.setText(appointment.getTitle());
        this.descriptionTextField.setText(appointment.getDescription());
        this.locationTextField.setText(appointment.getLocation());
        this.contactComboBox.getSelectionModel().select(contactList.lookup(appointment.getContact_ID()));
        this.typeTextField.setText(appointment.getType());
        this.startDatePicker.setValue(appointment.getStartDate());
        this.startTimeHourComboBox.getSelectionModel().select(appointment.getStartTimeHour());
        this.startTimeMinuteComboBox.getSelectionModel().select(appointment.getStartTimeMinute());
        this.startTimeMeridiemChoiceBox.getSelectionModel().select(appointment.getStartMeridiem());
        this.endDatePicker.setValue(appointment.getEndDate());
        this.endTimeHourComboBox.getSelectionModel().select(appointment.getEndTimeHour());
        this.endTimeMinuteComboBox.getSelectionModel().select(appointment.getEndTimeMinute());
        this.endTimeMeridiemChoiceBox.getSelectionModel().select(appointment.getEndMeridiem());
        this.customerComboBox.getSelectionModel().select(customerList.lookup(appointment.getCustomer_ID()));
        this.userComboBox.getSelectionModel().select(userList.lookup(appointment.getUser_ID()));
    }

}
