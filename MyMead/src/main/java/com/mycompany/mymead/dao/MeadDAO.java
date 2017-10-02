package com.mycompany.mymead.dao;

import com.mycompany.mymead.model.BrewMaster;
import com.mycompany.mymead.model.Ingredient;
import com.mycompany.mymead.model.Mead;
import com.mycompany.mymead.model.StorageLocation;

import java.time.LocalDate;
import java.util.List;

public interface MeadDAO {
    Mead addMead(Mead mead);
    Mead updateMead(Mead mead);
    void removeMead(int id);
    List<Mead> getAllMeads();
    Mead getMeadByID(int id);
    List<Mead> getMeadByDate(LocalDate date);
    Mead getMeadByName(String name);
    List<Mead> getMeadByBrewMaster(BrewMaster brewMaster);
    List<Mead> getMeadByIngredient(Ingredient ingredient);
    List<Mead> getMeadByLocation(StorageLocation storageLocation);
}
