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
import model.TableItem;

import java.io.IOException;

import static controller.inputControls.setCountryComboBox;
import static controller.inputControls.setFirstLevelDivisionComboBox;
import static model.Inventory.*;

public class CustomerUpdateScreen implements SendItem {
    
    CustomerForm customerForm;
    Customer customer;

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

    @Override
    public <T extends TableItem> void sendItem(T customer) {
        this.customer = (Customer) customer;
        this.idTextField.setText(this.customer.getIdString());
        this.nameTextField.setText(this.customer.getCustomer_Name());
        this.addressTextField.setText(this.customer.getAddress());
        this.postalCodeTextField.setText(this.customer.getPostal_Code());
        this.phoneNumberTextField.setText(this.customer.getPhone());
        this.firstLevelDivisionComboBox.getSelectionModel().select(first_level_divisionList.lookup(this.customer.getDivision_ID()));
        this.countryComboBox.getSelectionModel().select(countryList.lookup(this.customer.getCountry()));
        setFirstLevelDivisionComboBox(firstLevelDivisionComboBox);
        setCountryComboBox(countryComboBox);
        customerForm = new CustomerForm(this.customer.getCustomer_ID(),nameTextField,addressTextField,postalCodeTextField,phoneNumberTextField,firstLevelDivisionComboBox,countryComboBox);
    }

}
