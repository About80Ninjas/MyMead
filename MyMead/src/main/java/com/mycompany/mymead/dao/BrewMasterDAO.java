package com.mycompany.mymead.dao;

import com.mycompany.mymead.model.BrewMaster;

import java.util.List;

public interface BrewMasterDAO {
    BrewMaster addBrewMaster(BrewMaster brewMaster);
    BrewMaster updateBrewMaster(BrewMaster brewMaster);
    void removeBrewMaster(int id);
    List<BrewMaster> getAllBrewMaster();
    BrewMaster getBrewMasterByID(int id);
    BrewMaster getBrewMasterByFirstName(String firstName);
    BrewMaster getGetBrewMasterByLastName(String lastName);
    BrewMaster getBrewMasterByUserName(String userNamme);
}
