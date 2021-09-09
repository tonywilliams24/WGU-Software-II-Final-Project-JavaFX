package controller;

import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Appointment;

public class AppointmentTable {


    public static void initializeAppointmentSummaryTable(TableColumn<Appointment, String> appointmentTitleColumn, TableColumn<Appointment, String> appointmentDescriptionColumn, TableColumn<Appointment, String> appointmentLocationColumn, TableColumn<Appointment, String> appointmentTypeColumn, TableColumn<Appointment, String> appointmentStartDateTimeColumn, TableColumn<Appointment, String> appointmentEndDateTimeColumn) {
        appointmentTitleColumn.setCellValueFactory(new PropertyValueFactory<>("Title"));
        appointmentDescriptionColumn.setCellValueFactory(new PropertyValueFactory<>("Description"));
        appointmentLocationColumn.setCellValueFactory(new PropertyValueFactory<>("Location"));
        appointmentTypeColumn.setCellValueFactory(new PropertyValueFactory<>("Type"));
        appointmentStartDateTimeColumn.setCellValueFactory(new PropertyValueFactory<>("Start"));
        appointmentEndDateTimeColumn.setCellValueFactory(new PropertyValueFactory<>("End"));
    }
}
