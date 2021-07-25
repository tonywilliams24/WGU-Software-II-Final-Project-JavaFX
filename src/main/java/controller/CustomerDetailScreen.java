package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class CustomerDetailScreen {

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private TableView<?> customersTable;

    @FXML
    private TableColumn<Customer, String> customerIdColumn;

    @FXML
    private TableColumn<Customer, String> nameColumn;

    @FXML
    private TableColumn<Customer, String> addressColumn;

    @FXML
    private TableColumn<Customer, String> postalCodeColumn;

    @FXML
    private TableColumn<Customer, String> phoneNumberColumn;

    @FXML
    private TableColumn<Customer, String> firstLevelDivisionColumn;

    @FXML
    private TableColumn<Customer, String> countryColumn;

    @FXML
    private Button addCustomerButton;

    @FXML
    private Button updateCustomerButton;

    @FXML
    private Button deleteCustomerButton;

    @FXML
    private Button clearCustomerButton;

    @FXML
    private ToggleGroup appointmentType;

    @FXML
    private TableView<?> appointmentsTable;

    @FXML
    private TableColumn<Appointment, String> titleColumn;

    @FXML
    private TableColumn<Appointment, String> descriptionColumn;

    @FXML
    private TableColumn<Appointment, String> locationColumn;

    @FXML
    private TableColumn<Appointment, String> typeColumn;

    @FXML
    private TableColumn<Appointment, String> startDateTimeColumn;

    @FXML
    private TableColumn<Appointment, String> endDateTimeColumn;

    @FXML
    private Button addAppointmentScreenButton;

    @FXML
    private Button updateAppointmentScreenButton;

    @FXML
    private Button deleteAppointmentButton;

    @FXML
    private Button clearAppointmentButton;

    @FXML
    private Button homeScreenButton;

    @FXML
    void deleteCustomerButtonSelectedHandler(ActionEvent deleteCustomerButtonSelected) throws IOException {

    }

    @FXML
    void clearCustomerButtonSelectedHandler(ActionEvent clearCustomerButtonSelected) {

    }

    @FXML
    void deleteAppointmentButtonSelectedHandler(ActionEvent deleteAppointmentButtonSelected) throws IOException {

    }

    @FXML
    void clearAppointmentButtonSelectedHandler(ActionEvent clearAppointmentButtonSelected) {

    }

    @FXML
    void addCustomerButtonSelectedHandler(ActionEvent addCustomerButtonSelected) throws IOException {
        ScreenControls.switchScreens(addCustomerButtonSelected, ScreenControls.ADD_CUSTOMER_SCREEN_URL);
    }

    @FXML
    void updateCustomerButtonSelectedHandler(ActionEvent updateCustomerButtonSelected) throws IOException {
        ScreenControls.switchScreens(updateCustomerButtonSelected, ScreenControls.UPDATE_CUSTOMER_SCREEN_URL);
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
