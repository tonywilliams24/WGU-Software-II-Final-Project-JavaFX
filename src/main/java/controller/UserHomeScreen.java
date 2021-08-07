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
    private TableView<TableItem> customerTable;

    @FXML
    private TableColumn<Customer, String> customersNameColumn;

    @FXML
    private TableColumn<Customer, String> customersPhoneNumberColumn;

    @FXML
    private TableColumn<Customer, String> customersCountryColumn;

    @FXML
    private TableView<TableItem> appointmentTable;

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
        customerTable.setItems(customerList.getList());
        customersNameColumn.setCellValueFactory(new PropertyValueFactory<>("Customer_Name"));
        customersPhoneNumberColumn.setCellValueFactory(new PropertyValueFactory<>("Phone"));
        customersCountryColumn.setCellValueFactory(new PropertyValueFactory<>("Country"));
        appointmentTable.setItems(appointmentList.getList());
        appointmentsTitleColumn.setCellValueFactory(new PropertyValueFactory<>("Title"));
        appointmentsLocationColumn.setCellValueFactory(new PropertyValueFactory<>("Location"));
        appointmentsStartDateTimeColumn.setCellValueFactory(new PropertyValueFactory<>("Start"));
        appointmentCustomerColumn.setCellValueFactory(new PropertyValueFactory<>("Customer_ID"));
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
