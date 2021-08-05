package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.NoSuchElementException;

public class TableList {
    private ObservableList<TableItem> list;
    private int length = 0;

    TableList() {
        this.list = FXCollections.observableArrayList();
    }

    public void add(TableItem item) {
        list.add(item);
        length++;
    }

    public void addAll(TableItem[] items) {
        for(TableItem tableItem: items) {
            list.add(tableItem);
            length++;
        }
    }

    public TableItem lookup(int id) {
        for(TableItem tableItem: list) {
            if(tableItem.getId() == id) return tableItem;
        }
        throw new NoSuchElementException();
    }

    public TableItem lookup(String name) {
        for(TableItem tableItem: list) {
            if(tableItem.getName().equals(name)) return tableItem;
        }
        throw new NoSuchElementException();
    }

    public void update(TableItem updateItem) {
        if(list.contains(updateItem)) {
            list.remove(updateItem);
            list.add(updateItem);
        }
        else throw new NoSuchElementException();
    }

    public void delete(TableItem updateItem) {
        if(list.contains(updateItem)) list.remove(updateItem);
        else throw new NoSuchElementException();
    }


    public int getLength() {
        return length;
    }

    public ObservableList<TableItem> getList() {
        return list;
    }

    public void setList(ObservableList<TableItem> list) {
        this.list = list;
    }
}
