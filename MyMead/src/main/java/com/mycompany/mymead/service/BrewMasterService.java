package com.mycompany.mymead.service;

import com.mycompany.mymead.dao.BrewMasterDAO;
import com.mycompany.mymead.model.BrewMaster;

import javax.inject.Inject;

public class BrewMasterService {

    private BrewMasterDAO brewMasterDAO;

    @Inject
    public BrewMasterService(BrewMasterDAO brewMasterDAO) {
        this.brewMasterDAO = brewMasterDAO;
    }

    public BrewMaster addBrewMaster(BrewMaster brewMaster){
        return brewMasterDAO.addBrewMaster(brewMaster);
    }

    public BrewMaster updateBrewMaster(BrewMaster brewMaster){
        return brewMasterDAO.updateBrewMaster(brewMaster);
    }

    public void removeBreMaster(int id){
        brewMasterDAO.removeBrewMaster(id);
    }
}
