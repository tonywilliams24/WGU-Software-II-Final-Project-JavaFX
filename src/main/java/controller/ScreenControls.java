package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import model.Appointment;
import model.Customer;
import model.TableItem;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.net.URL;

public class ScreenControls {

    public static final String ADD_APPOINTMENT_SCREEN_URL = "file:src/main/View/AddAppointmentScreen.fxml";
    public static final String UPDATE_APPOINTMENT_SCREEN_URL = "file:src/main/View/UpdateAppointmentScreen.fxml";
    public static final String HOME_SCREEN_URL = "file:src/main/View/UserHomeScreen.fxml";
    public static final String UPDATE_CUSTOMER_SCREEN_URL = "file:src/main/View/UpdateCustomerScreen.fxml";
    public static final String ADD_CUSTOMER_SCREEN_URL = "file:src/main/View/AddCustomerScreen.fxml";
    public static final String CUSTOMER_DETAIL_SCREEN_URL = "file:src/main/View/CustomerDetailScreen.fxml";
    public static final String APPOINTMENT_DETAIL_SCREEN_URL = "file:src/main/View/AppointmentDetailScreen.fxml";
    public static final String LOGIN_SCREEN_URL = "file:src/main/View/LoginScreen.fxml";

    private String destinationFxmlUrlString;
    private FXMLLoader destinationFxmlLoader;
    private final ActionEvent switchScreensEvent;
    private Stage currentStage;
    private Scene destinationScene;
    private TableItem tableItem = null;

    public void setDestinationFxmlUrlString(String destinationFxmlUrlString) {
        this.destinationFxmlUrlString = destinationFxmlUrlString;
    }

    public ScreenControls(ActionEvent switchScreensEvent) {
        this.switchScreensEvent = switchScreensEvent;
    }

    public ScreenControls(ActionEvent switchScreensEvent, TableItem tableItem) throws IOException {
        this.switchScreensEvent = switchScreensEvent;
        this.tableItem = tableItem;
    }

    private void sendtableItem() throws IOException {
        assert tableItem != null;
        if(tableItem instanceof Appointment) {
            destinationFxmlUrlString = UPDATE_APPOINTMENT_SCREEN_URL;
            loadDestinationScreenFXML();
            UpdateAppointmentScreen updateAppointmentScreen = destinationFxmlLoader.getController();
            updateAppointmentScreen.sendSelectedItem((Appointment) tableItem);
        }
        else if (tableItem instanceof Customer) {
            destinationFxmlUrlString = UPDATE_CUSTOMER_SCREEN_URL;
            loadDestinationScreenFXML();
            UpdateCustomerScreen updateCustomerScreen = destinationFxmlLoader.getController();
            updateCustomerScreen.sendSelectedItem((Customer) tableItem);
        }
        else throw new InvalidObjectException("Invalid Table Item Type");
    }

    private void sendtableItem(TableItem tableItem) throws IOException {
        this.tableItem = tableItem;
        sendtableItem();;
    }

    public ScreenControls(ActionEvent switchScreensEvent, String destinationFxmlUrlString) {
        this.switchScreensEvent = switchScreensEvent;
        this.destinationFxmlUrlString = destinationFxmlUrlString;
    }

    public void switchScreens(String destinationFxmlUrlString) throws IOException {
        setDestinationFxmlUrlString(destinationFxmlUrlString);
        loadDestinationScreenFXML();
        switchScreens();
    }

    public void switchScreens() throws IOException {
        currentStage = getCurrentStage();
        destinationScene = setDestinationScene();
        applySceneToStage();
    }

    private void loadDestinationScreenFXML() throws IOException {
        destinationFxmlLoader = new FXMLLoader();
        destinationFxmlLoader.setLocation(new URL(destinationFxmlUrlString));
        destinationFxmlLoader.load();
    }

    private Stage getCurrentStage() { ///// refactor current stage and destination scene to be void instead of returning.
        Button selectedButton = ((Button) switchScreensEvent.getSource());
        Scene currentScene = selectedButton.getScene();
        return (Stage) currentScene.getWindow();
    }

    private Scene setDestinationScene() {
        Parent parentScene = destinationFxmlLoader.getRoot();
        Scene destinationScene = new Scene(parentScene);
        destinationScene.getStylesheets().add("stylesheet.css");
        return destinationScene;
    }

    private void applySceneToStage() {
        currentStage.setScene(destinationScene);
        currentStage.show();
    }
}
