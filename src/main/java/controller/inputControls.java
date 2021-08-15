package controller;

import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.zone.ZoneRules;

public class inputControls {
    public static final ZoneId SYSTEM_ZONE_ID = ZoneId.systemDefault();
    public static final ZoneRules SYSTEM_ZONE_RULES = SYSTEM_ZONE_ID.getRules();
    public static final ZoneOffset SYSTEM_ZONE_OFFSET = SYSTEM_ZONE_RULES.getOffset(Instant.now());

    public static void clearTextFields(TextField... textFields) {
        for(TextField t: textFields) t.clear();
    }

    public static void clearComboBoxes(ComboBox<?>... comboBoxes) {
        for(ComboBox<?> c: comboBoxes) {
            c.valueProperty().set(null);
        }
    }
}
