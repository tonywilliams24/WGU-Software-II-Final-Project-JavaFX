package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import model.*;

import java.io.IOException;
import java.time.*;

import static controller.inputControls.*;
import static model.Inventory.appointmentList;
import static model.Inventory.customerList;
import static model.MeridiemIndicator.AM;
import static model.MeridiemIndicator.PM;

public class AppointmentAddScreen {
    DateTime startDateTIme;
    DateTime endDateTIme;
    private static AppointmentForm appointmentForm;


    @FXML
    private AnchorPane anchorPane;

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
    private Button addAppointmentButton;

    @FXML
    private Button clearButton;

    @FXML
    private Button customerDetailScreenButton;

    @FXML
    private Button appointmentDetailScreenButton;

    @FXML
    public void initialize(){
        appointmentForm = new AppointmentForm(appointmentList.getCumulativeLength(), titleTextField, descriptionTextField, locationTextField, contactComboBox, typeTextField, startDatePicker, startTimeHourComboBox, startTimeMinuteComboBox, startTimeMeridiemChoiceBox, endDatePicker, endTimeHourComboBox, endTimeMinuteComboBox, endTimeMeridiemChoiceBox, customerComboBox, userComboBox);
        appointmentForm.initializeAppointmentForm();
    }

    @FXML
    void addAppointmentButtonSelectedHandler(ActionEvent event) {
        int Appointment_ID = appointmentList.getCumulativeLength()+1;
        appointmentForm = new AppointmentForm(Appointment_ID, titleTextField, descriptionTextField, locationTextField, contactComboBox, typeTextField, startDatePicker, startTimeHourComboBox, startTimeMinuteComboBox, startTimeMeridiemChoiceBox, endDatePicker, endTimeHourComboBox, endTimeMinuteComboBox, endTimeMeridiemChoiceBox, customerComboBox, userComboBox);
        appointmentForm.submitAddAppointment();    
    }

    @FXML
    void clearButtonSelectedHandler(ActionEvent event) {
        appointmentForm.clearForm();
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

}
