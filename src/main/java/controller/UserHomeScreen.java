package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Appointment;
import model.Customer;

import java.io.IOException;

public class UserHomeScreen {

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private TableView<Customer> customerTable;

    @FXML
    private TableColumn<Customer, String> customersNameColumn;

    @FXML
    private TableColumn<Customer, String> customersPhoneNumberColumn;

    @FXML
    private TableColumn<Customer, String> customersCountryColumn;

    @FXML
    private TableView<Appointment> appointmentTable;

    @FXML
    private TableColumn<Appointment, String> appointmentsTitleColumn;

    @FXML
    private TableColumn<Appointment, String> appointmentsLocationColumn;

    @FXML
    private TableColumn<Appointment, String> appointmentsStartDateTimeColumn;

    @FXML
    private TableColumn<Appointment, String> appointmentCustomerColumn;

    @FXML
    private Button customerDetailScreenButton;

    @FXML
    private Button appointmentDetailScreenButton;

    @FXML
    public void initialize() {

    }

    @FXML
    private void appointmentDetailScreenButtonHandler(ActionEvent appointmentDetailScreenButtonSelected) throws IOException {
        ScreenControls.switchScreens(appointmentDetailScreenButtonSelected, ScreenControls.APPOINTMENT_DETAIL_SCREEN_URL);
    }

    @FXML
    private void customerDetailScreenButtonHandler(ActionEvent customerDetailScreenButtonSelected) throws IOException {
        ScreenControls.switchScreens(customerDetailScreenButtonSelected, ScreenControls.CUSTOMER_DETAIL_SCREEN_URL);
    }

    @FXML
    private void logOutButtonSelectedHandler(ActionEvent logOutButtonSelected) throws IOException {
        ScreenControls.switchScreens(logOutButtonSelected, ScreenControls.LOGIN_SCREEN_URL);
    }

}
