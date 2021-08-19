package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
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

    public ScreenControls(ActionEvent switchScreensEvent) {
        this.switchScreensEvent = switchScreensEvent;
    }

    public ScreenControls(ActionEvent switchScreensEvent, String destinationFxmlUrlString) {
        this.switchScreensEvent = switchScreensEvent;
        this.destinationFxmlUrlString = destinationFxmlUrlString;
    }

    public void switchScreens() throws IOException {
        loadDestinationScreenFXML();
        currentStage = getCurrentStage();
        destinationScene = setDestinationScene();
        applySceneToStage(currentStage, destinationScene);
    }

    public void switchScreens(String destinationFxmlUrlString) throws IOException {
        this.destinationFxmlUrlString = destinationFxmlUrlString;
        loadDestinationScreenFXML();
        currentStage = getCurrentStage();
        destinationScene = setDestinationScene();
        applySceneToStage(currentStage, destinationScene);
    }


    private FXMLLoader loadDestinationScreenFXML() throws IOException {
        destinationFxmlLoader = new FXMLLoader();
        destinationFxmlLoader.setLocation(new URL(destinationFxmlUrlString));
        destinationFxmlLoader.load();
        return destinationFxmlLoader;
    }

    private Stage getCurrentStage() {
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

    private void applySceneToStage(Stage currentStage, Scene destinationScene) {
        currentStage.setScene(destinationScene);
        currentStage.show();
    }
}
