package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import model.Customer;
import model.First_Level_Division;
import model.TableItem;

import java.io.IOException;

import static controller.inputControls.setCountryComboBox;
import static controller.inputControls.setFirstLevelDivisionComboBox;
import static model.Inventory.*;

public class AddCustomerScreen {

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private TextField nameTextField;

    @FXML
    private TextField addressTextField;

    @FXML
    private TextField postalCodeTextField;

    @FXML
    private TextField phoneNumberTextField;

    @FXML
    private ComboBox<TableItem> countryComboBox;

    @FXML
    private ComboBox<TableItem> firstLevelDivisionComboBox;

    @FXML
    private Button addCustomerButton;

    @FXML
    private Button clearButton;

    @FXML
    private Button goBackButton;

    @FXML
    public void initialize() {
        setFirstLevelDivisionComboBox(firstLevelDivisionComboBox);
        setCountryComboBox(countryComboBox);
    }

    @FXML
    void addCustomerButtonSelectedHandler(ActionEvent event) {
        int Customer_ID = customerList.getCumulativeLength()+1;
        String Customer_Name = nameTextField.getText().trim();
        String Address = addressTextField.getText().trim();
        String Postal_Code = postalCodeTextField.getText().trim();
        String Phone = phoneNumberTextField.getText().trim();
        int Division_ID = firstLevelDivisionComboBox.getItems().get(0).getId();
        String Country = countryComboBox.getItems().get(0).getName();
        Customer customer = new Customer(Customer_ID, Customer_Name, Address, Postal_Code, Phone, Division_ID, Country);
        customerList.add(customer);
        inputControls.clearTextFields(nameTextField,addressTextField,postalCodeTextField,phoneNumberTextField);
        inputControls.clearComboBoxes(firstLevelDivisionComboBox,countryComboBox);
    }

    @FXML
    void clearButtonSelectedHandler(ActionEvent event) {
        inputControls.clearTextFields(nameTextField,addressTextField,postalCodeTextField,phoneNumberTextField);
        inputControls.clearComboBoxes(firstLevelDivisionComboBox,countryComboBox);
    }

    @FXML
    void goBackButtonSelectedHandler(ActionEvent goBackButtonSelected) throws IOException {
        ScreenControls screenControls = new ScreenControls(goBackButtonSelected);
        screenControls.switchScreens(ScreenControls.CUSTOMER_DETAIL_SCREEN_URL);
    }

}
