package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import model.Appointment;
import model.Country;
import model.Customer;
import model.TableItem;
import model.TableList;

import java.io.IOException;
import java.util.concurrent.CyclicBarrier;

import static controller.inputControls.setCountryComboBox;
import static controller.inputControls.setFirstLevelDivisionComboBox;
import static model.Inventory.*;
import static model.Inventory.countryList;

public class CustomerDetailScreen {

    Customer customer;

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private TableView<Customer> customerTable;

    @FXML
    private TableColumn<Customer, String> customerIdColumn;

    @FXML
    private TableColumn<Customer, String> customerNameColumn;

    @FXML
    private TableColumn<Customer, String> customerAddressColumn;

    @FXML
    private TableColumn<Customer, String> customerPostalCodeColumn;

    @FXML
    private TableColumn<Customer, String> customerPhoneNumberColumn;

    @FXML
    private TableColumn<Customer, String> customerFirstLevelDivisionColumn;

    @FXML
    private TableColumn<Customer, String> customerCountryColumn;

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
    private TableView<Appointment> appointmentTable;

    @FXML
    private TableColumn<Appointment, String> appointmentTitleColumn;

    @FXML
    private TableColumn<Appointment, String> appointmentDescriptionColumn;

    @FXML
    private TableColumn<Appointment, String> appointmentLocationColumn;

    @FXML
    private TableColumn<Appointment, String> appointmentTypeColumn;

    @FXML
    private TableColumn<Appointment, String> appointmentStartDateTimeColumn;

    @FXML
    private TableColumn<Appointment, String> appointmentEndDateTimeColumn;

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
    private final TableList<Appointment> filteredAppointmentTable = new TableList<>();

    @FXML
    public void initialize(){
        appointmentTable.setItems(filteredAppointmentTable.getList());
        appointmentTitleColumn.setCellValueFactory(new PropertyValueFactory<>("Title"));
        appointmentDescriptionColumn.setCellValueFactory(new PropertyValueFactory<>("Description"));
        appointmentLocationColumn.setCellValueFactory(new PropertyValueFactory<>("Location"));
        appointmentTypeColumn.setCellValueFactory(new PropertyValueFactory<>("Type"));
        appointmentStartDateTimeColumn.setCellValueFactory(new PropertyValueFactory<>("Start"));
        appointmentEndDateTimeColumn.setCellValueFactory(new PropertyValueFactory<>("End"));
        customerTable.setItems(customerList.getList());
        customerIdColumn.setCellValueFactory(new PropertyValueFactory<>("Customer_ID"));
        customerNameColumn.setCellValueFactory(new PropertyValueFactory<>("Customer_Name"));
        customerAddressColumn.setCellValueFactory(new PropertyValueFactory<>("Address"));
        customerPostalCodeColumn.setCellValueFactory(new PropertyValueFactory<>("Postal_Code"));
        customerPhoneNumberColumn.setCellValueFactory(new PropertyValueFactory<>("Phone"));
        customerFirstLevelDivisionColumn.setCellValueFactory(new PropertyValueFactory<>("Division_ID"));
        customerCountryColumn.setCellValueFactory(new PropertyValueFactory<>("Country"));
    }

    public void sendCustomer(Customer customer) {
        this.customer = customer;
        appointmentList.getList().forEach(appointment -> {
            if(appointment.getCustomer_ID() == customer.getCustomer_ID()) filteredAppointmentTable.add(appointment);
        });
    }


    @FXML
    void deleteCustomerButtonSelectedHandler(ActionEvent deleteCustomerButtonSelected) {

    }

    @FXML
    void clearCustomerButtonSelectedHandler(ActionEvent clearCustomerButtonSelected) {

    }

    @FXML
    void deleteAppointmentButtonSelectedHandler(ActionEvent deleteAppointmentButtonSelected) {

    }

    @FXML
    void clearAppointmentButtonSelectedHandler(ActionEvent clearAppointmentButtonSelected) {

    }

    @FXML
    void addCustomerButtonSelectedHandler(ActionEvent addCustomerButtonSelected) throws IOException {
        ScreenControls screenControls = new ScreenControls(addCustomerButtonSelected);
        screenControls.switchScreens(ScreenControls.ADD_CUSTOMER_SCREEN_URL);
    }

    @FXML
    void updateCustomerButtonSelectedHandler(ActionEvent updateCustomerButtonSelected) throws IOException {
        Customer selectedCustomer = customerTable.getSelectionModel().getSelectedItem();
        ScreenControls screenControls = new ScreenControls(updateCustomerButtonSelected, selectedCustomer);
        screenControls.switchScreens(ScreenControls.UPDATE_CUSTOMER_SCREEN_URL);

    }

    @FXML
    void addAppointmentScreenButtonSelectedHandler(ActionEvent addAppointmentScreenButtonSelected) throws IOException {
        ScreenControls screenControls = new ScreenControls(addAppointmentScreenButtonSelected);
        screenControls.switchScreens(ScreenControls.ADD_APPOINTMENT_SCREEN_URL);
    }

    @FXML
    void updateAppointmentScreenButtonSelectedHandler(ActionEvent updateAppointmentScreenButtonSelected) throws IOException {
        Appointment selectedAppointment = appointmentTable.getSelectionModel().getSelectedItem();
        ScreenControls screenControls = new ScreenControls(updateAppointmentScreenButtonSelected, selectedAppointment);
        screenControls.switchScreens(ScreenControls.UPDATE_APPOINTMENT_SCREEN_URL);
    }

    @FXML
    void homeScreenButtonSelectedHandler(ActionEvent homeScreenButtonSelected) throws IOException {
        ScreenControls screenControls = new ScreenControls(homeScreenButtonSelected);
        screenControls.switchScreens(ScreenControls.HOME_SCREEN_URL);
    }


}
