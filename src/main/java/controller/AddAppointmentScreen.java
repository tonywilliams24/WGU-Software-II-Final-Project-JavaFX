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
import model.DateTime;
import model.MeridiemIndicator;
import model.TableItem;

import java.io.IOException;
import java.time.*;

import static controller.inputControls.*;
import static model.Inventory.appointmentList;
import static model.MeridiemIndicator.AM;
import static model.MeridiemIndicator.PM;

public class AddAppointmentScreen {
    DateTime startDateTIme;
    DateTime endDateTIme;


    @FXML
    private AnchorPane anchorPane;

    @FXML
    private TextField titleTextField;

    @FXML
    private TextField descriptionTextField;

    @FXML
    private TextField locationTextField;

    @FXML
    private ComboBox<TableItem> contactComboBox;

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
    private ComboBox<TableItem> customerComboBox;

    @FXML
    private ComboBox<TableItem> userComboBox;

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

    @FXML
    void addAppointmentButtonSelectedHandler(ActionEvent event) {
        int Appointment_ID = appointmentList.getCumulativeLength()+1;
        String Title = titleTextField.getText().trim();
        String Description = descriptionTextField.getText().trim();
        String Location = locationTextField.getText().trim();
        String Type = typeTextField.getText().trim();
        LocalDate startDate = startDatePicker.getValue();
        int startTimeHour = startTimeHourComboBox.getItems().get(0);
        int startTimeMinute = startTimeMinuteComboBox.getItems().get(0);
        MeridiemIndicator startMeridiem = startTimeMeridiemChoiceBox.getItems().get(0);
        LocalDate endDate = endDatePicker.getValue();
        int endTimeHour = endTimeHourComboBox.getItems().get(0);
        int endTimeMinute = endTimeMinuteComboBox.getItems().get(0);
        MeridiemIndicator endMeridiem = endTimeMeridiemChoiceBox.getItems().get(0);
        int Customer_ID = customerComboBox.getItems().get(0).getId();
        int User_ID = userComboBox.getItems().get(0).getId();
        int Contact_ID = contactComboBox.getItems().get(0).getId();

        if(startMeridiem.equals(PM) && startTimeHour<12) startTimeHour+=12;
        else if(startMeridiem.equals(AM) && startTimeHour==12) startTimeHour-=12;

        if(endMeridiem.equals(PM) && startTimeHour<12) startTimeHour+=12;
        else if(endMeridiem.equals(AM) && startTimeHour==12) startTimeHour-=12;

        LocalTime startTime = LocalTime.of(startTimeHour,startTimeMinute);
        LocalTime endTime = LocalTime.of(endTimeHour,endTimeMinute);
        startDateTIme = new DateTime(OffsetDateTime.of(startDate,startTime, SYSTEM_ZONE_OFFSET));
        endDateTIme = new DateTime(OffsetDateTime.of(endDate,endTime, SYSTEM_ZONE_OFFSET));

        Appointment appointment = new Appointment(Appointment_ID,Title,Description,Location,Type,startDateTIme,endDateTIme,Customer_ID,User_ID,Contact_ID);
        appointmentList.add(appointment);
    }

    @FXML
    void clearButtonSelectedHandler(ActionEvent event) {

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
