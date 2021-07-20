package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class UserHomeScreen {

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private TableView<?> customerTable;

    @FXML
    private TableView<?> appointmentTable;

    @FXML
    private Button customerDetailsButton;

    @FXML
    private Button appointmentDetailsButton;

    @FXML
    void appointmentDetailsButtonHandler(ActionEvent appointmentDetailsSelected) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/AppointmentDetailScreen.fxml"));
        loader.load();
     /* UserHomeScreen userHomeScreenController = loader.getController(); To implement if I need to send any information from login screen to home screen
        userHomeScreenController.sendSomething();  */
        Stage stage = (Stage) ((Button) appointmentDetailsSelected.getSource()).getScene().getWindow();
        Parent parentScene = loader.getRoot();
        parentScene.getStylesheets().add("stylesheet.css");
        stage.setScene(new Scene(parentScene));
        stage.show();
    }

    @FXML
    void customerDetailsButtonHandler(ActionEvent customerDetailsSelected) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/CustomerDetailScreen.fxml"));
        loader.load();
     /* UserHomeScreen userHomeScreenController = loader.getController(); To implement if I need to send any information from login screen to home screen
        userHomeScreenController.sendSomething();  */
        Stage stage = (Stage) ((Button) customerDetailsSelected.getSource()).getScene().getWindow();
        Parent parentScene = loader.getRoot();
        parentScene.getStylesheets().add("stylesheet.css");
        stage.setScene(new Scene(parentScene));
        stage.show();
    }

}
