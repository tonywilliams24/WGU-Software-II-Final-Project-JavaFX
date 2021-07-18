package Controller;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

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
    private ChoiceBox<?> endTimeAmPmChoiceBox;

    @FXML
    private TextField appointmentIdTextField;

    @FXML
    private DatePicker endDatePicker;

    @FXML
    private ComboBox<?> endTimeHourComboBox;

    @FXML
    private ComboBox<?> endTimeMinuteComboBox;

    @FXML
    private Button updateAppointmentButton;

    @FXML
    private Button clearButton;

    @FXML
    private Button goBackButton;
}
