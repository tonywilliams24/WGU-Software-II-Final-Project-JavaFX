package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.NoSuchElementException;

public class TableList<T extends TableItem> {
    private ObservableList<T> list;
    private int length = 0;
    private int cumulativeLength = 0;

    TableList() {
        this.list = FXCollections.observableArrayList();
    }

    public void add(T tableItem) {
        list.add(tableItem);
        length++;
        cumulativeLength++;
    }

    public void addAll(T[] tableItems) {
        for(T tableItem: tableItems) {
            add(tableItem);
        }
    }

    public T lookup(int id) {
        for(T tableItem: list) {
            if(tableItem.getId() == id) return tableItem;
        }
        throw new NoSuchElementException();
    }

    public T lookup(String name) {
        for(T tableItem: list) {
            if(tableItem.getName().equals(name)) return tableItem;
        }
        throw new NoSuchElementException();
    }

    public void update(T tableItem) {
        if(list.contains(tableItem)) {
            list.remove(tableItem);
            list.add(tableItem);
        }
        else throw new NoSuchElementException();
    }

    public void delete(T tableItem) {
        if(list.contains(tableItem)) {
            list.remove(tableItem);
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

    public ObservableList<T> getList() {
        return list;
    }

}
