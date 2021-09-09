package controller;


import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.Appointment;
import model.TableItem;
import model.TableList;

import java.util.HashMap;

public class TableControls {

    public static <T extends TableItem> void selectTableItem(TableList<T> mainList, T tableItem, TableView<T> tableView) {
        tableView.setItems(mainList.getList());
        mainList.getList().forEach(customerListItem -> {
            if(customerListItem.getId() == tableItem.getId()) tableView.getSelectionModel().select(customerListItem);
        });
    }
}
