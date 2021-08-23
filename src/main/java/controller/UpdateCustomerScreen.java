package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import model.Country;
import model.Customer;
import model.First_Level_Division;

import java.io.IOException;

import static controller.inputControls.setCountryComboBox;
import static controller.inputControls.setFirstLevelDivisionComboBox;
import static model.Inventory.*;

public class UpdateCustomerScreen extends UpdateScreen<Customer> {
    
    CustomerForm customerForm;

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
    private ComboBox<Country> countryComboBox;

    @FXML
    private ComboBox<First_Level_Division> firstLevelDivisionComboBox;

    @FXML
    private TextField idTextField;

    @FXML
    private Button updateCustomerButton;

    @FXML
    private Button clearButton;

    @FXML
    private Button goBackButton;

    @FXML
    public void initialize() {
        this.idTextField.setText(t.getIdString());
        this.nameTextField.setText(t.getCustomer_Name());
        this.addressTextField.setText(t.getAddress());
        this.postalCodeTextField.setText(t.getPostal_Code());
        this.firstLevelDivisionComboBox.getSelectionModel().select(first_level_divisionList.lookup(t.getDivision_ID()));
        this.countryComboBox.getSelectionModel().select(countryList.lookup(t.getCountry()));
        setFirstLevelDivisionComboBox(firstLevelDivisionComboBox);
        setCountryComboBox(countryComboBox);
        customerForm = new CustomerForm(tId,nameTextField,addressTextField,postalCodeTextField,phoneNumberTextField,firstLevelDivisionComboBox,countryComboBox);
    }


    @FXML
    void clearButtonHandler(ActionEvent event) {

    }

    @FXML
    void updateCustomerButtonHandler(ActionEvent event) {
        int Customer_ID = Integer.parseInt(idTextField.getText());
        CustomerForm customerForm = new CustomerForm(Customer_ID, nameTextField, addressTextField, postalCodeTextField, phoneNumberTextField, firstLevelDivisionComboBox, countryComboBox);
        customerForm.submitAddCustomer();

    }

    @FXML
    void goBackButtonHandler(ActionEvent goBackButtonSelected) throws IOException {
        ScreenControls screenControls = new ScreenControls(goBackButtonSelected);
        screenControls.switchScreens(ScreenControls.CUSTOMER_DETAIL_SCREEN_URL);
    }

}
