package controller;

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
import model.User;

import java.io.IOException;

public class LoginScreen {

    private static User loggedInUser;

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

    public static User getLoggedInUser() {
        return loggedInUser;
    }

    public static String getLoggedInUserName() {
        return loggedInUser.getUser_Name();
    }

    @FXML
    void submitHandler(ActionEvent loginSelected) throws IOException {
        ScreenControls screenControls = new ScreenControls(loginSelected);
        screenControls.switchScreens(ScreenControls.HOME_SCREEN_URL);
    }

}
