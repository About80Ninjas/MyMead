package com.mycompany.mymead.model;

public class BrewMaster {
    private int id;
    private String firstName;
    private String userName;
    private String lastName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BrewMaster that = (BrewMaster) o;

        if (id != that.id) return false;
        if (!firstName.equals(that.firstName)) return false;
        if (!userName.equals(that.userName)) return false;
        return lastName.equals(that.lastName);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + firstName.hashCode();
        result = 31 * result + userName.hashCode();
        result = 31 * result + lastName.hashCode();
        return result;
    }
}
