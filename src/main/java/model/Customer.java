package model;

import controller.CustomerForm;
import controller.LoginScreen;

import static model.Inventory.customerList;


public class Customer extends TableItem {
    private int Customer_ID;
    private String Customer_Name;
    private String Address;
    private String Postal_Code;
    private String Phone;
    private int Division_ID;
    private String Country;

    public Customer(int customer_ID, String customer_Name, String address, String postal_Code, String phone, DateTime create_Date, String created_By, DateTime last_Update, String last_Updated_By, int division_ID, String country) {
        this.Customer_ID = customer_ID;
        this.Customer_Name = customer_Name;
        this.Address = address;
        this.Postal_Code = postal_Code;
        this.Phone = phone;
        this.Create_Date = create_Date;
        this.Created_By = created_By;
        this.Last_Update = last_Update;
        this.Last_Updated_By = last_Updated_By;
        this.Division_ID = division_ID;
        this.Country = country;
    }
    public Customer(int customer_ID, String customer_Name, String address, String postal_Code, String phone, int division_ID, String country) {
        super();
        this.Customer_ID = customer_ID;
        this.Customer_Name = customer_Name;
        this.Address = address;
        this.Postal_Code = postal_Code;
        this.Phone = phone;
        this.Division_ID = division_ID;
        this.Country = country;
    }
    public Customer(CustomerForm customerForm) {
        super();
        this.Customer_ID = customerForm.getCustomer_ID();
        this.Customer_Name = customerForm.getNameTextField().getText().trim();
        this.Address = customerForm.getAddressTextField().getText().trim();
        this.Postal_Code = customerForm.getPostalCodeTextField().getText().trim();
        this.Phone = customerForm.getPhoneNumberTextField().getText().trim();
        this.Division_ID = customerForm.getFirstLevelDivisionComboBox().getItems().get(0).getId();
        this.Country = customerForm.getCountryComboBox().getItems().get(0).getName();
    }

    public Customer() {
        super();
    }

    public int getCustomer_ID() {
        return Customer_ID;
    }

    public void setCustomer_ID(int customer_ID) {
        Customer_ID = customer_ID;
    }

    public String getCustomer_Name() {
        return Customer_Name;
    }

    public void setCustomer_Name(String customer_Name) {
        Customer_Name = customer_Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPostal_Code() {
        return Postal_Code;
    }

    public void setPostal_Code(String postal_Code) {
        Postal_Code = postal_Code;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public int getDivision_ID() {
        return Division_ID;
    }

    public void setDivision_ID(int division_ID) {
        Division_ID = division_ID;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    @Override
    public int getId() {
        return Customer_ID;
    }

    @Override
    public String getIdString() {
        return Integer.toString(Customer_ID);
    }

    @Override
    public String getName() {
        return Customer_Name;
    }
}
