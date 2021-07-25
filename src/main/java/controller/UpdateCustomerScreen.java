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
    private ComboBox<?> countryComboBox;

    @FXML
    private ComboBox<?> firstLevelDivisionComboBox;

    @FXML
    private TextField idTextField;

    @FXML
    private Button updateCustomerButton;

    @FXML
    private Button clearButton;

    @FXML
    private Button goBackButton;

    @FXML
    void clearButtonHandler(ActionEvent event) {

    }

    @FXML
    void updateCustomerButtonHandler(ActionEvent event) {

    }

    @FXML
    void goBackButtonHandler(ActionEvent goBackButtonSelected) throws IOException {
        ScreenControls.switchScreens(goBackButtonSelected, ScreenControls.CUSTOMER_DETAIL_SCREEN_URL);
    }

}
