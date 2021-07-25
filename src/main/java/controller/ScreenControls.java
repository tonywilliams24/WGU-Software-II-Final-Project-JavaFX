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

    public static void switchScreens(ActionEvent switchScreensEvent, String destinationFxmlUrlString) throws IOException {
        FXMLLoader destinationFxmlLoader = loadDestinationScreenFXML(destinationFxmlUrlString);
        Stage currentStage = getCurrentStage(switchScreensEvent);
        Scene destinationScene = setDestinationScene(destinationFxmlLoader);
        currentStage.setScene(destinationScene);
        currentStage.show();
    }

    private static FXMLLoader loadDestinationScreenFXML(String destinationFxmlUrlString) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(new URL(destinationFxmlUrlString));
        fxmlLoader.load();
        return fxmlLoader;
    }

    private static Stage getCurrentStage(ActionEvent buttonSelection) {
        Button selectedButton = ((Button) buttonSelection.getSource());
        Scene currentScene = selectedButton.getScene();
        return (Stage) currentScene.getWindow();
    }

    private static Scene setDestinationScene(FXMLLoader fxmlLoader) {
        Parent parentScene = fxmlLoader.getRoot();
        Scene destinationScene = new Scene(parentScene);
        destinationScene.getStylesheets().add("stylesheet.css");
        return destinationScene;
    }
}
