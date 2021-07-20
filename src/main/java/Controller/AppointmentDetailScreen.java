package Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;

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
    private Button addAppointmentButton;

    @FXML
    private Button updateAppointmentButton;

    @FXML
    private Button deleteAppointmentButton;

    @FXML
    private Button clearSelectionButton;

    @FXML
    private Button goBackButton;
}
