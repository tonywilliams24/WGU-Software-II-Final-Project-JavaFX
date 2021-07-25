package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AddCustomerScreen {

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
    private ComboBox<?> countryComboBox;

    @FXML
    private ComboBox<?> firstLevelDivisionComboBox;

    @FXML
    private Button addCustomerButton;

    @FXML
    private Button clearButton;

    @FXML
    private Button goBackButton;

    @FXML
    void addCustomerButtonSelectedHandler(ActionEvent event) {

    }

    @FXML
    void clearButtonSelectedHandler(ActionEvent event) {

    }

    @FXML
    void goBackButtonSelectedHandler(ActionEvent goBackButtonSelected) throws IOException {
        ScreenControls.switchScreens(goBackButtonSelected, ScreenControls.CUSTOMER_DETAIL_SCREEN_URL);
    }

}
