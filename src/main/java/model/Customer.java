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
        Customer_ID = customer_ID;
        Customer_Name = customer_Name;
        Address = address;
        Postal_Code = postal_Code;
        Phone = phone;
        Create_Date = create_Date;
        Created_By = created_By;
        Last_Update = last_Update;
        Last_Updated_By = last_Updated_By;
        Division_ID = division_ID;
        Country = country;
    }
    public Customer(int customer_ID, String customer_Name, String address, String postal_Code, String phone, int division_ID, String country) {
        super();
        Customer_ID = customer_ID;
        Customer_Name = customer_Name;
        Address = address;
        Postal_Code = postal_Code;
        Phone = phone;
        Division_ID = division_ID;
        Country = country;
    }
    public Customer(CustomerForm customerForm) {
        super();
        int Customer_ID = customerForm.getCustomer_ID();
        String Customer_Name = customerForm.getNameTextField().getText().trim();
        String Address = customerForm.getAddressTextField().getText().trim();
        String Postal_Code = customerForm.getPostalCodeTextField().getText().trim();
        String Phone = customerForm.getPhoneNumberTextField().getText().trim();
        int Division_ID = customerForm.getFirstLevelDivisionComboBox().getItems().get(0).getId();
        String Country = customerForm.getCountryComboBox().getItems().get(0).getName();
    }

    public static void addToCustomerList(int customer_ID, String Customer_Name, String Address, String Postal_Code, String Phone, int Division_ID, String Country) {
        customerList.add(new Customer(customer_ID, Customer_Name, Address, Postal_Code, Phone, Division_ID, Country));
    }

    public static void addToCustomerList(Customer customer) {
        customerList.add(customer);
    }

    public static void addToCustomerList(CustomerForm customerForm) {
        customerList.add(new Customer(customerForm));
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
