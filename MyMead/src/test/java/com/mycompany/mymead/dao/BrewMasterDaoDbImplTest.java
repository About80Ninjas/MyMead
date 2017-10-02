/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mymead.dao;

import com.mycompany.mymead.model.BrewMaster;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author kd0sh
 */
public class BrewMasterDaoDbImplTest {
    
    public BrewMasterDaoDbImplTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setJdbcTemplate method, of class BrewMasterDaoDbImpl.
     */
    @Test
    public void testSetJdbcTemplate() {
        System.out.println("setJdbcTemplate");
        JdbcTemplate jdbcTemplate = null;
        BrewMasterDaoDbImpl instance = new BrewMasterDaoDbImpl();
        instance.setJdbcTemplate(jdbcTemplate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addBrewMaster method, of class BrewMasterDaoDbImpl.
     */
    @Test
    public void testAddBrewMaster() {
        System.out.println("addBrewMaster");
        BrewMaster brewMaster = null;
        BrewMasterDaoDbImpl instance = new BrewMasterDaoDbImpl();
        BrewMaster expResult = null;
        BrewMaster result = instance.addBrewMaster(brewMaster);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateBrewMaster method, of class BrewMasterDaoDbImpl.
     */
    @Test
    public void testUpdateBrewMaster() {
        System.out.println("updateBrewMaster");
        BrewMaster brewMaster = null;
        BrewMasterDaoDbImpl instance = new BrewMasterDaoDbImpl();
        BrewMaster expResult = null;
        BrewMaster result = instance.updateBrewMaster(brewMaster);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeBrewMaster method, of class BrewMasterDaoDbImpl.
     */
    @Test
    public void testRemoveBrewMaster() {
        System.out.println("removeBrewMaster");
        int id = 0;
        BrewMasterDaoDbImpl instance = new BrewMasterDaoDbImpl();
        instance.removeBrewMaster(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllBrewMaster method, of class BrewMasterDaoDbImpl.
     */
    @Test
    public void testGetAllBrewMaster() {
        System.out.println("getAllBrewMaster");
        BrewMasterDaoDbImpl instance = new BrewMasterDaoDbImpl();
        List<BrewMaster> expResult = null;
        List<BrewMaster> result = instance.getAllBrewMaster();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBrewMasterByID method, of class BrewMasterDaoDbImpl.
     */
    @Test
    public void testGetBrewMasterByID() {
        System.out.println("getBrewMasterByID");
        int id = 0;
        BrewMasterDaoDbImpl instance = new BrewMasterDaoDbImpl();
        BrewMaster expResult = null;
        BrewMaster result = instance.getBrewMasterByID(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBrewMasterByFirstName method, of class BrewMasterDaoDbImpl.
     */
    @Test
    public void testGetBrewMasterByFirstName() {
        System.out.println("getBrewMasterByFirstName");
        String firstName = "";
        BrewMasterDaoDbImpl instance = new BrewMasterDaoDbImpl();
        BrewMaster expResult = null;
        BrewMaster result = instance.getBrewMasterByFirstName(firstName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGetBrewMasterByLastName method, of class BrewMasterDaoDbImpl.
     */
    @Test
    public void testGetGetBrewMasterByLastName() {
        System.out.println("getGetBrewMasterByLastName");
        String lastName = "";
        BrewMasterDaoDbImpl instance = new BrewMasterDaoDbImpl();
        BrewMaster expResult = null;
        BrewMaster result = instance.getGetBrewMasterByLastName(lastName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBrewMasterByUserName method, of class BrewMasterDaoDbImpl.
     */
    @Test
    public void testGetBrewMasterByUserName() {
        System.out.println("getBrewMasterByUserName");
        String userNamme = "";
        BrewMasterDaoDbImpl instance = new BrewMasterDaoDbImpl();
        BrewMaster expResult = null;
        BrewMaster result = instance.getBrewMasterByUserName(userNamme);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
