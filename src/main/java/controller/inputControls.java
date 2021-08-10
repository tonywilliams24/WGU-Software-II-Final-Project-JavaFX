package controller;

import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class inputControls {

    public static void clearTextFields(TextField... textFields) {
        for(TextField t: textFields) t.clear();
    }

    public static void clearComboBoxes(ComboBox<?>... comboBoxes) {
        for(ComboBox<?> c: comboBoxes) {
            c.valueProperty().set(null);
        }
    }
}
