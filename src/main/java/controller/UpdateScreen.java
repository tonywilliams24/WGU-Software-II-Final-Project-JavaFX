package controller;

import model.TableItem;

public abstract class UpdateScreen<T extends TableItem> {

    T t;
    int tId;

    public void sendSelectedItem(T t) {
        this.t = t;
        this.tId = t.getId();
    }
}
