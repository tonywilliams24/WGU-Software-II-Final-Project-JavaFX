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

import java.io.IOException;

public class UpdateAppointmentScreen {

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private TextField descriptionTextField;

    @FXML
    private TextField postalCodeTextField;

    @FXML
    private TextField typeTextField;

    @FXML
    private TextField titleTextField;

    @FXML
    private ComboBox<?> userComboBox;

    @FXML
    private ComboBox<?> customerComboBox;

    @FXML
    private ComboBox<?> contactComboBox1;

    @FXML
    private DatePicker startDatePicker;

    @FXML
    private ComboBox<?> startTimeHourComboBox;

    @FXML
    private ComboBox<?> startTimeMinuteComboBox;

    @FXML
    private ChoiceBox<?> startTimeAmPmChoiceBox;

    @FXML
    private TextField appointmentIdTextField;

    @FXML
    private DatePicker endDatePicker;

    @FXML
    private ComboBox<?> endTimeHourComboBox;

    @FXML
    private ComboBox<?> endTimeMinuteComboBox;

    @FXML
    private ChoiceBox<?> endTimeAmPmChoiceBox;

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
        ScreenControls.switchScreens(appointmentDetailScreenButtonSelected, ScreenControls.APPOINTMENT_DETAIL_SCREEN_URL);
    }

    @FXML
    void customerDetailScreenButtonHandler(ActionEvent customerDetailScreenButtonSelected) throws IOException {
        ScreenControls.switchScreens(customerDetailScreenButtonSelected, ScreenControls.CUSTOMER_DETAIL_SCREEN_URL);
    }

}
