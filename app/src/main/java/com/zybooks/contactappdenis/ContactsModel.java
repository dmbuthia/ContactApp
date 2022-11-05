package com.zybooks.contactappdenis;

public class ContactsModel {
    // create variables for our user name and contact number.
    private String userName;
    private String contactNumber;

    // constructor
    public ContactsModel(String userName, String contactNumber) {
        this.userName = userName;
        this.contactNumber = contactNumber;
    }

    // on below line i created getter and setter
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}
