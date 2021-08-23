package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import model.Appointment;
import model.Contact;
import model.Country;
import model.Customer;
import model.First_Level_Division;
import model.MeridiemIndicator;
import model.TableItem;
import model.TableList;
import model.User;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.zone.ZoneRules;

import static model.Customer.addToCustomerList;
import static model.Inventory.*;

public class inputControls {
    public static final ZoneId SYSTEM_ZONE_ID = ZoneId.systemDefault();
    public static final ZoneRules SYSTEM_ZONE_RULES = SYSTEM_ZONE_ID.getRules();
    public static final ZoneOffset SYSTEM_ZONE_OFFSET = SYSTEM_ZONE_RULES.getOffset(Instant.now());

    public static void clearTextFields(TextField... textFields) {
        for(TextField t: textFields) t.clear();
    }

    public static void clearComboBoxes(ComboBox<?>... comboBoxes) {
        for(ComboBox<?> c: comboBoxes) {
            c.valueProperty().set(null);
        }
    }

    public static void setMeridiemChoiceBox(ChoiceBox<MeridiemIndicator> box) {
        ObservableList<MeridiemIndicator> meridiemIndicators = FXCollections.observableArrayList();
        meridiemIndicators.add(MeridiemIndicator.AM);
        meridiemIndicators.add(MeridiemIndicator.PM);
        box.setItems(meridiemIndicators);
    }

    public static void setHourComboBox(ComboBox<Integer> box){
        setIntegerComboBox(box,1,12);
    }

    public static void setMinuteComboBox(ComboBox<Integer> box){
        setIntegerComboBox(box,0,60);
    }

    public static void setAppointmentComboBox(ComboBox<Appointment> box) {
        setTableItemComboBox(box, appointmentList);
    }

    public static void setContactComboBox(ComboBox<Contact> box) {
        setTableItemComboBox(box, contactList);
    }

    public static void setCountryComboBox(ComboBox<Country> box) {
        setTableItemComboBox(box, countryList);
    }

    public static void setCustomerComboBox(ComboBox<Customer> box) {
        setTableItemComboBox(box, customerList);
    }

    public static void setFirstLevelDivisionComboBox(ComboBox<First_Level_Division> box) {
        setTableItemComboBox(box, first_level_divisionList);
    }

    public static void setUserComboBox(ComboBox<User> box) {
        setTableItemComboBox(box, userList);
    }

    private static <T extends TableItem> void setTableItemComboBox(ComboBox<T> box, TableList<T> tableList) {
        box.setItems(tableList.getList());
    }

    private static void setIntegerComboBox(ComboBox<Integer> box, int min, int max) {
        ObservableList<Integer> integers = FXCollections.observableArrayList();
        for(int i = min; i<=max; i++) integers.add(i);
        box.setItems(integers);
    }

}
