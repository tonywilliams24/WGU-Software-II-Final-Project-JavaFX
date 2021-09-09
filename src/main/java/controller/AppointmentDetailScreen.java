package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import model.Appointment;
import model.Customer;
import model.TableItem;

import java.io.IOException;

import static controller.ScreenControls.*;
import static model.Inventory.appointmentList;
import static model.Inventory.customerList;

public class AppointmentDetailScreen implements SendItem {
    Appointment appointment;

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
    private TableView<Appointment> appointmentTable;

    @FXML
    private TableColumn<Appointment, Integer> appointmentIDcolumn;

    @FXML
    private TableColumn<Appointment, String> appointmentTitleColumn;

    @FXML
    private TableColumn<Appointment, String> appointmentDescriptionColumn;

    @FXML
    private TableColumn<Appointment, String> appointmentLocationColumn;

    @FXML
    private TableColumn<Appointment, String> appointmentContactColumn;

    @FXML
    private TableColumn<Appointment, String> appointmentTypeColumn;

    @FXML
    private TableColumn<Appointment, String> appointmentStartDateTimeColumn;

    @FXML
    private TableColumn<Appointment, String> appointmentEndDateTimeColumn;

    @FXML
    private TableColumn<Appointment, Integer> appointmentCustomerId;


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

    public void initialize() {
        appointmentTable.setItems(appointmentList.getList());
        appointmentIDcolumn.setCellValueFactory(new PropertyValueFactory<>("Appointment_ID"));
        AppointmentTable.initializeAppointmentSummaryTable(appointmentTitleColumn, appointmentDescriptionColumn, appointmentLocationColumn, appointmentTypeColumn, appointmentStartDateTimeColumn, appointmentEndDateTimeColumn);
        appointmentCustomerId.setCellValueFactory(new PropertyValueFactory<>("Customer_ID"));
        appointmentContactColumn.setCellValueFactory(new PropertyValueFactory<>("Contact_ID"));
    }

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
        ScreenControls screenControls = new ScreenControls(addAppointmentScreenButtonSelected);
        screenControls.switchScreens(ADD_APPOINTMENT_SCREEN_URL);
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
        screenControls.switchScreens(HOME_SCREEN_URL);
    }

    @Override
    public <T extends TableItem> void sendItem(T tableItem) {
        this.appointment = (Appointment) tableItem;
        TableControls.selectTableItem(appointmentList, appointment, appointmentTable);
    }

}
