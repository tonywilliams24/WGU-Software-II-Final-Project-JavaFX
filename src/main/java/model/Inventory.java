package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Inventory {
    public static ObservableList<Customer> customers = FXCollections.observableArrayList();
    public static ObservableList<Customer> contacts = FXCollections.observableArrayList();
    public static ObservableList<Customer> appointments = FXCollections.observableArrayList();
}
