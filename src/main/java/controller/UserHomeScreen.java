package controller;

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
    private Button customerDetailScreenButton;

    @FXML
    private Button appointmentDetailScreenButton;

    @FXML
    void appointmentDetailScreenButtonHandler(ActionEvent appointmentDetailScreenButtonSelected) throws IOException {
        ScreenControls.switchScreens(appointmentDetailScreenButtonSelected, ScreenControls.APPOINTMENT_DETAIL_SCREEN_URL);
    }

    @FXML
    void customerDetailScreenButtonHandler(ActionEvent customerDetailScreenButtonSelected) throws IOException {
        ScreenControls.switchScreens(customerDetailScreenButtonSelected, ScreenControls.CUSTOMER_DETAIL_SCREEN_URL);
    }

    @FXML
    void logOutButtonSelectedHandler(ActionEvent logOutButtonSelected) throws IOException {
        ScreenControls.switchScreens(logOutButtonSelected, ScreenControls.LOGIN_SCREEN_URL);
    }

}
