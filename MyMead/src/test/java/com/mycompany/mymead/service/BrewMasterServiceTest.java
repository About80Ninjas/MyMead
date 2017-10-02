/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mymead.service;

import com.mycompany.mymead.model.BrewMaster;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kd0sh
 */
public class BrewMasterServiceTest {
    
    public BrewMasterServiceTest() {
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
     * Test of addBrewMaster method, of class BrewMasterService.
     */
    @Test
    public void testAddBrewMaster() {
        System.out.println("addBrewMaster");
        BrewMaster brewMaster = null;
        BrewMasterService instance = null;
        BrewMaster expResult = null;
        BrewMaster result = instance.addBrewMaster(brewMaster);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateBrewMaster method, of class BrewMasterService.
     */
    @Test
    public void testUpdateBrewMaster() {
        System.out.println("updateBrewMaster");
        BrewMaster brewMaster = null;
        BrewMasterService instance = null;
        BrewMaster expResult = null;
        BrewMaster result = instance.updateBrewMaster(brewMaster);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeBreMaster method, of class BrewMasterService.
     */
    @Test
    public void testRemoveBreMaster() {
        System.out.println("removeBreMaster");
        int id = 0;
        BrewMasterService instance = null;
        instance.removeBreMaster(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
