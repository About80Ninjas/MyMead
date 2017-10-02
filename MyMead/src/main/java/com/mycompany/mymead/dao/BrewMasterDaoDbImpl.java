package com.mycompany.mymead.dao;

import com.mycompany.mymead.model.BrewMaster;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.inject.Inject;
import java.util.List;

public class BrewMasterDaoDbImpl implements BrewMasterDAO {

    private JdbcTemplate jdbcTemplate;
    private static final String SQL_ADD_BREWMASTER = "insert into brewmaster " +
            "(firstname, lastname, username) " +
            "values(?,,?,,?)";
    private static final String SQL_UPDATE_BREWMASTER = "update bremaster set " +
            "firstname = ?, lastname = ?, username = ? " +
            "where id = ?";
    private static final String SQL_REMOVE_BREWMASTER = "drop from brewmaster " +
            "where id = ?";
    private static final String SQL_GET_ALL_BREMASTERS = "select * from brewmaster";
    private static final String SQL_GET_BREWMASTER_BY_ID = "select * from brewmaster where id = ?";
    private static final String SQL_GET_BREWMASTER_BY_FIRSTNAME = "select * from brewmaster where firstname = ?";
    private static final String SQL_GET_BREWMASTER_BY_LASTNAME = "select * from brewmaster where lastname = ?";
    private static final String SQL_GET_BREWMASTER_BY_USERNAME = "select * from brewmaster where username = ?";

    @Inject
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public BrewMaster addBrewMaster(BrewMaster brewMaster) {
        return null;
    }

    @Override
    public BrewMaster updateBrewMaster(BrewMaster brewMaster) {
        return null;
    }

    @Override
    public void removeBrewMaster(int id) {

    }

    @Override
    public List<BrewMaster> getAllBrewMaster() {
        return null;
    }

    @Override
    public BrewMaster getBrewMasterByID(int id) {
        return null;
    }

    @Override
    public BrewMaster getBrewMasterByFirstName(String firstName) {
        return null;
    }

    @Override
    public BrewMaster getGetBrewMasterByLastName(String lastName) {
        return null;
    }

    @Override
    public BrewMaster getBrewMasterByUserName(String userNamme) {
        return null;
    }
}
