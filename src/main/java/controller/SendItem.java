package controller;

import model.TableItem;

public interface SendItem {
    <T extends TableItem> void sendItem(T tableItem);
}
