package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import model.Country;
import model.First_Level_Division;

import java.io.IOException;

import static controller.inputControls.setCountryComboBox;
import static controller.inputControls.setFirstLevelDivisionComboBox;
import static model.Inventory.customerList;

public class CustomerAddScreen {

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
    private ComboBox<Country> countryComboBox;

    @FXML
    private ComboBox<First_Level_Division> firstLevelDivisionComboBox;

    @FXML
    private Button addCustomerButton;

    @FXML
    private Button clearButton;

    @FXML
    private Button goBackButton;
    private CustomerForm customerForm;

    @FXML
    public void initialize() {
        setFirstLevelDivisionComboBox(firstLevelDivisionComboBox);
        setCountryComboBox(countryComboBox);
    }

    @FXML
    void addCustomerButtonSelectedHandler(ActionEvent event) {
        int Customer_ID = customerList.getCumulativeLength()+1;
        customerForm = new CustomerForm(Customer_ID, nameTextField, addressTextField, postalCodeTextField, phoneNumberTextField, firstLevelDivisionComboBox, countryComboBox);
        customerForm.submitAddCustomer();
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
