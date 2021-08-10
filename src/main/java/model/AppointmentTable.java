//package model;
//
//import javafx.fxml.FXML;
//import javafx.scene.control.TableColumn;
//import javafx.scene.control.TableView;
//import javafx.scene.control.cell.PropertyValueFactory;
//
//import static model.Inventory.appointmentList;
//
//public class AppointmentTable {
//
//    private static final TableView<TableItem> appointmentTable = new TableView<>();
//    private static final TableColumn<Appointment, Integer> appointmentIDcolumn = new TableColumn<>();
//    private static final TableColumn<Appointment, String> appointmentTitleColumn = new TableColumn<>();
//    private static final TableColumn<Appointment, String> appointmentDescriptionColumn = new TableColumn<>();
//    private static final TableColumn<Appointment, String> appointmentLocationColumn = new TableColumn<>();
//    private static final TableColumn<Appointment, String> appointmentContactColumn = new TableColumn<>();
//    private static final TableColumn<Appointment, String> appointmentTypeColumn = new TableColumn<>();
//    private static final TableColumn<Appointment, String> appointmentStartDateTimeColumn = new TableColumn<>();
//    private static final TableColumn<Appointment, String> appointmentEndDateTimeColumn = new TableColumn<>();
//    private static final TableColumn<Appointment, Integer> appointmentCustomerId = new TableColumn<>();
//    private static final TableColumn<Appointment, String> appointmentCustomer = new TableColumn<>();
//
//    public AppointmentTable() {
//        appointmentTable.setItems(appointmentList.getList());
//        appointmentIDcolumn.setCellValueFactory(new PropertyValueFactory<>("Appointment_ID"));
//        appointmentTitleColumn.setCellValueFactory(new PropertyValueFactory<>("Title"));
//        appointmentDescriptionColumn.setCellValueFactory(new PropertyValueFactory<>("Description"));
//        appointmentLocationColumn.setCellValueFactory(new PropertyValueFactory<>("Location"));
//        appointmentTypeColumn.setCellValueFactory(new PropertyValueFactory<>("Type"));
//        appointmentStartDateTimeColumn.setCellValueFactory(new PropertyValueFactory<>("Start"));
//        appointmentEndDateTimeColumn.setCellValueFactory(new PropertyValueFactory<>("End"));
//        appointmentCustomerId.setCellValueFactory(new PropertyValueFactory<>("Customer_ID"));
//        appointmentCustomer.setCellValueFactory(new PropertyValueFactory<>("Customer"));
//        appointmentContactColumn.setCellValueFactory(new PropertyValueFactory<>("Contact_ID"));
//    }
//
//    public TableView<TableItem> getAppointmentTable() {
//        return appointmentTable;
//    }
//
//    public TableColumn<Appointment, Integer> getAppointmentIDcolumn() {
//        return appointmentIDcolumn;
//    }
//
//    public TableColumn<Appointment, String> getAppointmentTitleColumn() {
//        return appointmentTitleColumn;
//    }
//
//    public TableColumn<Appointment, String> getAppointmentDescriptionColumn() {
//        return appointmentDescriptionColumn;
//    }
//
//    public TableColumn<Appointment, String> getAppointmentLocationColumn() {
//        return appointmentLocationColumn;
//    }
//
//    public TableColumn<Appointment, String> getAppointmentContactColumn() {
//        return appointmentContactColumn;
//    }
//
//    public TableColumn<Appointment, String> getAppointmentTypeColumn() {
//        return appointmentTypeColumn;
//    }
//
//    public TableColumn<Appointment, String> getAppointmentStartDateTimeColumn() {
//        return appointmentStartDateTimeColumn;
//    }
//
//    public TableColumn<Appointment, String> getAppointmentEndDateTimeColumn() {
//        return appointmentEndDateTimeColumn;
//    }
//
//    public TableColumn<Appointment, Integer> getAppointmentCustomerId() {
//        return appointmentCustomerId;
//    }
//
//    public TableColumn<Appointment, String> getAppointmentCustomer() {
//        return appointmentCustomer;
//    }
//
//}
