package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginScreen {

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private TextField usernameTextField;

    @FXML
    private PasswordField passwordPasswordField;

    @FXML
    private Button loginButton;

    @FXML
    private Button clearButton;

    @FXML
    void submitHandler(ActionEvent loginSelected) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/UserHomeScreen.fxml"));
        loader.load();
     /* UserHomeScreen userHomeScreenController = loader.getController(); To implement if I need to send any information from login screen to home screen
        userHomeScreenController.sendSomething();  */
        Stage stage = (Stage) ((Button) loginSelected.getSource()).getScene().getWindow();
        Parent parentScene = loader.getRoot();
        parentScene.getStylesheets().add("stylesheet.css");
        stage.setScene(new Scene(parentScene));
        stage.show();
    }

}
