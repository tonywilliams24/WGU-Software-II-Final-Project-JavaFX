package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class AppointmentDetailScreen {

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private RadioButton allRadioButton;

    @FXML
    private ToggleGroup appointmentType;

    @FXML
    private RadioButton weekRadioButton;

    @FXML
    private RadioButton monthRadioButton;

    @FXML
    private TableView<?> appointmentTable;

    @FXML
    private Button addAppointmentScreenButton;

    @FXML
    private Button updateAppointmentScreenButton;

    @FXML
    private Button deleteAppointmentButton;

    @FXML
    private Button clearButton;

    @FXML
    private Button homeScreenButton;

    @FXML
    void allRadioButtonSelectedHandler(ActionEvent event) {

    }

    @FXML
    void weekRadioButtonSelectedHandler(ActionEvent event) {

    }

    @FXML
    void monthRadioButtonSelectedHandler(ActionEvent event) {

    }

    @FXML
    void deleteAppointmentButtonSelectedHandler(ActionEvent deleteAppointmentButtonSelected) throws IOException {

    }

    @FXML
    void ClearButtonSelectedHandler(ActionEvent event) {

    }

    @FXML
    void addAppointmentScreenButtonSelectedHandler(ActionEvent addAppointmentScreenButtonSelected) throws IOException {
        ScreenControls.switchScreens(addAppointmentScreenButtonSelected, ScreenControls.ADD_APPOINTMENT_SCREEN_URL);
    }

    @FXML
    void updateAppointmentScreenButtonSelectedHandler(ActionEvent updateAppointmentScreenButtonSelected) throws IOException {
        ScreenControls.switchScreens(updateAppointmentScreenButtonSelected, ScreenControls.UPDATE_APPOINTMENT_SCREEN_URL);
    }

    @FXML
    void homeScreenButtonSelectedHandler(ActionEvent homeScreenButtonSelected) throws IOException {
        ScreenControls.switchScreens(homeScreenButtonSelected, ScreenControls.HOME_SCREEN_URL);
    }

}
