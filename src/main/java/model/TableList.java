package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.NoSuchElementException;

public class TableList {
    private ObservableList<TableItem> list;
    private int length = 0;
    private int cumulativeLength = 0;

    TableList() {
        this.list = FXCollections.observableArrayList();
    }

    public void add(TableItem item) {
        list.add(item);
        length++;
        cumulativeLength++;
    }

    public void addAll(TableItem[] items) {
        for(TableItem tableItem: items) {
            add(tableItem);
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
        if(list.contains(updateItem)) {
            list.remove(updateItem);
            length--;
        }
        else throw new NoSuchElementException();
    }


    public int getLength() {
        return length;
    }

    public int getCumulativeLength() {
        return cumulativeLength;
    }

    public ObservableList<TableItem> getList() {
        return list;
    }

}
