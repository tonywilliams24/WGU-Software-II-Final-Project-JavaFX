package model;

public class Contact implements TableItem {
    private int Contact_ID;
    private String Contact_Name;
    private String Email;

    public int getContact_ID() {
        return Contact_ID;
    }

    public void setContact_ID(int contact_ID) {
        Contact_ID = contact_ID;
    }

    public String getContact_Name() {
        return Contact_Name;
    }

    public void setContact_Name(String contact_Name) {
        Contact_Name = contact_Name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public int getId() {
        return Contact_ID;
    }

    @Override
    public String getName() {
        return Contact_Name;
    }
}
