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

import static model.Inventory.*;

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

    public void sendSelectedCustomerToScreen(Customer customer){
        idTextField.setText(customer.getIdString());
        nameTextField.setText(customer.getCustomer_Name());
        addressTextField.setText(customer.getAddress());
        postalCodeTextField.setText(customer.getPostal_Code());
        firstLevelDivisionComboBox.getSelectionModel().select(first_level_divisionList.lookup(customer.getDivision_ID()));
        countryComboBox.getSelectionModel().select(countryList.lookup(customer.getCountry()));
    }


    @FXML
    void clearButtonHandler(ActionEvent event) {

    }

    @FXML
    void updateCustomerButtonHandler(ActionEvent event) {
        int Customer_ID = Integer.parseInt(idTextField.getText());
        inputControls.extractCustomerData(new CustomerForm(Customer_ID, nameTextField, addressTextField, postalCodeTextField, phoneNumberTextField, firstLevelDivisionComboBox, countryComboBox));

    }

    @FXML
    void goBackButtonHandler(ActionEvent goBackButtonSelected) throws IOException {
        ScreenControls screenControls = new ScreenControls(goBackButtonSelected);
        screenControls.switchScreens(ScreenControls.CUSTOMER_DETAIL_SCREEN_URL);
    }

}
