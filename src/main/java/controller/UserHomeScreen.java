package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import model.Appointment;
import model.Customer;
import model.TableItem;

import java.io.IOException;

import static model.Inventory.appointmentList;
import static model.Inventory.customerList;

public class UserHomeScreen {

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private TableView<Customer> customerTable;

    @FXML
    private TableColumn<Customer, String> customerNameColumn;

    @FXML
    private TableColumn<Customer, String> customerPhoneNumberColumn;

    @FXML
    private TableColumn<Customer, String> customerCountryColumn;

    @FXML
    private TableView<Appointment> appointmentTable;

    @FXML
    private TableColumn<Appointment, String> appointmentTitleColumn;

    @FXML
    private TableColumn<Appointment, String> appointmentLocationColumn;

    @FXML
    private TableColumn<Appointment, String> appointmentStartDateTimeColumn;

    @FXML
    private TableColumn<Appointment, String> appointmentCustomerIDColumn;

    @FXML
    private Button customerDetailScreenButton;

    @FXML
    private Button appointmentDetailScreenButton;

    @FXML
    public void initialize() {
        customerTable.setItems(customerList.getList());
        customerNameColumn.setCellValueFactory(new PropertyValueFactory<>("Customer_Name"));
        customerPhoneNumberColumn.setCellValueFactory(new PropertyValueFactory<>("Phone"));
        customerCountryColumn.setCellValueFactory(new PropertyValueFactory<>("Country"));
        appointmentTable.setItems(appointmentList.getList());
        appointmentTitleColumn.setCellValueFactory(new PropertyValueFactory<>("Title"));
        appointmentLocationColumn.setCellValueFactory(new PropertyValueFactory<>("Location"));
        appointmentStartDateTimeColumn.setCellValueFactory(new PropertyValueFactory<>("Start"));
        appointmentCustomerIDColumn.setCellValueFactory(new PropertyValueFactory<>("Customer_ID"));
    }

    @FXML
    private void appointmentDetailScreenButtonHandler(ActionEvent appointmentDetailScreenButtonSelected) throws IOException {
        ScreenControls screenControls = new ScreenControls(appointmentDetailScreenButtonSelected);
        screenControls.switchScreens(ScreenControls.APPOINTMENT_DETAIL_SCREEN_URL);
    }

    @FXML
    private void customerDetailScreenButtonHandler(ActionEvent customerDetailScreenButtonSelected) throws IOException {
        ScreenControls screenControls = new ScreenControls(customerDetailScreenButtonSelected);
        screenControls.switchScreens(ScreenControls.CUSTOMER_DETAIL_SCREEN_URL);
    }

    @FXML
    private void logOutButtonSelectedHandler(ActionEvent logOutButtonSelected) throws IOException {
        ScreenControls screenControls = new ScreenControls(logOutButtonSelected);
        screenControls.switchScreens(ScreenControls.LOGIN_SCREEN_URL);
    }

}
