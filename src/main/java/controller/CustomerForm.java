package controller;

import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import model.Country;
import model.First_Level_Division;

public class CustomerForm {
    private final int customer_ID;
    private final TextField nameTextField;
    private final TextField addressTextField;
    private final TextField postalCodeTextField;
    private final TextField phoneNumberTextField;
    private final ComboBox<First_Level_Division> firstLevelDivisionComboBox;
    private final ComboBox<Country> countryComboBox;

    public CustomerForm(int customer_ID, TextField nameTextField, TextField addressTextField, TextField postalCodeTextField, TextField phoneNumberTextField, ComboBox<First_Level_Division> firstLevelDivisionComboBox, ComboBox<Country> countryComboBox) {
        this.customer_ID = customer_ID;
        this.nameTextField = nameTextField;
        this.addressTextField = addressTextField;
        this.postalCodeTextField = postalCodeTextField;
        this.phoneNumberTextField = phoneNumberTextField;
        this.firstLevelDivisionComboBox = firstLevelDivisionComboBox;
        this.countryComboBox = countryComboBox;
    }

    public void clearForm() {
        inputControls.clearTextFields(nameTextField, addressTextField, postalCodeTextField, phoneNumberTextField);
        inputControls.clearComboBoxes(firstLevelDivisionComboBox, countryComboBox);
    }

    public int getCustomer_ID() {
        return customer_ID;
    }

    public TextField getNameTextField() {
        return nameTextField;
    }

    public TextField getAddressTextField() {
        return addressTextField;
    }

    public TextField getPostalCodeTextField() {
        return postalCodeTextField;
    }

    public TextField getPhoneNumberTextField() {
        return phoneNumberTextField;
    }

    public ComboBox<First_Level_Division> getFirstLevelDivisionComboBox() {
        return firstLevelDivisionComboBox;
    }

    public ComboBox<Country> getCountryComboBox() {
        return countryComboBox;
    }
}
