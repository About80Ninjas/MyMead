package com.mycompany.mymead.model;

import java.time.LocalDate;
import java.util.List;

public class Mead {
    private int id;
    private LocalDate date;
    private String name;
    private String comments;
    private BrewMaster brewMaster;
    private boolean casted;
    private List<Ingredient> ingredients;
    private StorageLocation storageLocation;

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public BrewMaster getBrewMaster() {
        return brewMaster;
    }

    public void setBrewMaster(BrewMaster brewMaster) {
        this.brewMaster = brewMaster;
    }

    public boolean isCasted() {
        return casted;
    }

    public void setCasted(boolean casted) {
        this.casted = casted;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public StorageLocation getStorageLocation() {
        return storageLocation;
    }

    public void setStorageLocation(StorageLocation storageLocation) {
        this.storageLocation = storageLocation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Mead mead = (Mead) o;

        if (id != mead.id) return false;
        if (casted != mead.casted) return false;
        if (!date.equals(mead.date)) return false;
        if (!name.equals(mead.name)) return false;
        if (!comments.equals(mead.comments)) return false;
        if (!brewMaster.equals(mead.brewMaster)) return false;
        if (!ingredients.equals(mead.ingredients)) return false;
        return storageLocation.equals(mead.storageLocation);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + date.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + comments.hashCode();
        result = 31 * result + brewMaster.hashCode();
        result = 31 * result + (casted ? 1 : 0);
        result = 31 * result + ingredients.hashCode();
        result = 31 * result + storageLocation.hashCode();
        return result;
    }
}
