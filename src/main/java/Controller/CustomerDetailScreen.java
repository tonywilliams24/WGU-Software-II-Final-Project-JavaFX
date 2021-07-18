package Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;

public class CustomerDetailScreen {
    @FXML
    private AnchorPane anchorPane;

    @FXML
    private TableView<?> customersTable;

    @FXML
    private Button addCustomerButton;

    @FXML
    private Button updateCustomerButton;

    @FXML
    private Button deleteCustomerButton;

    @FXML
    private Button clearCustomerSelectionButton;

    @FXML
    private ToggleGroup appointmentType;

    @FXML
    private TableView<?> appointmentsTable;

    @FXML
    private Button addAppointmentButton;

    @FXML
    private Button updateAppointmentButton;

    @FXML
    private Button deleteAppointmentButton;

    @FXML
    private Button clearAppointmentSelectionBUtton;

    @FXML
    private Button goBackButton;
}
