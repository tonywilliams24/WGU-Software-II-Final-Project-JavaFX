package Controller;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class UpdateCustomerScreen {

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private TextField addressTextField;

    @FXML
    private TextField postalCodeTextField;

    @FXML
    private TextField phoneNumberTextField;

    @FXML
    private TextField nameTextField;

    @FXML
    private TextField idTextField;

    @FXML
    private ComboBox<?> countryComboBox;

    @FXML
    private ComboBox<?> firstLevelDivisionComboBox;
}
