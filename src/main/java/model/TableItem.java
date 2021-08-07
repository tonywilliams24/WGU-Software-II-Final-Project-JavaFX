package model;

public interface TableItem {

    abstract int getId();

    abstract String getName();

    public default boolean equals(TableItem tableItem) {
        return getId() == tableItem.getId();
    }
}
