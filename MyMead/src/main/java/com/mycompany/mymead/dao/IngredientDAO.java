package com.mycompany.mymead.dao;

import com.mycompany.mymead.model.Ingredient;

import java.util.List;

public interface IngredientDAO {
    Ingredient addIngredient(Ingredient ingredient);
    Ingredient updateIngredient(Ingredient ingredient);
    void  removeIngredient(int id);
    List<Ingredient> getAllIngredients();
    Ingredient getIngredientByID(int id);
    Ingredient getIngredientByName(String name);
}
