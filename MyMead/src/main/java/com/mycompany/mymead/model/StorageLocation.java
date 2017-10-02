package com.mycompany.mymead.model;

public class StorageLocation {
    private int id;
    private String name;
    private String location;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StorageLocation that = (StorageLocation) o;

        if (id != that.id) return false;
        if (!name.equals(that.name)) return false;
        return location.equals(that.location);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        result = 31 * result + location.hashCode();
        return result;
    }
}
