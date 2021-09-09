package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.LinkedHashSet;
import java.util.NoSuchElementException;

public class TableList<T extends TableItem> {
    private final ObservableList<T> list = FXCollections.observableArrayList();
    private final LinkedHashSet<T> linkedHashSet = new LinkedHashSet<>();
    private int length = 0;
    private int cumulativeLength = 0;

    public void add(T tableItem) {
        linkedHashSet.add(tableItem);
        length++;
        cumulativeLength++;
    }

    public void addAll(T... tableItems) {
        for(T tableItem: tableItems) {
            add(tableItem);
        }
    }

    public boolean contains(T t) {
        return linkedHashSet.contains(t);
    }

    public T lookup(int id) {
        for(T tableItem: linkedHashSet) {
            if(tableItem.getId() == id) return tableItem;
        }
        throw new NoSuchElementException();
    }

    public T lookup(String name) {
        for(T tableItem: linkedHashSet) {
            if(tableItem.getName().equals(name)) return tableItem;
        }
        throw new NoSuchElementException();
    }

    public void update(T tableItem) {
        if(linkedHashSet.contains(tableItem)) {
            linkedHashSet.remove(tableItem);
            linkedHashSet.add(tableItem);
        }
        else throw new NoSuchElementException();
    }

    public void remove(T tableItem) {
        if(linkedHashSet.contains(tableItem)) {
            linkedHashSet.remove(tableItem);
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
        list.setAll(linkedHashSet);
        return list;
    }

}
