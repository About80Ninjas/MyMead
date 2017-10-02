/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mymead.model;

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
public class BrewMasterTest {
    
    public BrewMasterTest() {
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
     * Test of getId method, of class BrewMaster.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        BrewMaster instance = new BrewMaster();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class BrewMaster.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        BrewMaster instance = new BrewMaster();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstName method, of class BrewMaster.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        BrewMaster instance = new BrewMaster();
        String expResult = "";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFirstName method, of class BrewMaster.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "";
        BrewMaster instance = new BrewMaster();
        instance.setFirstName(firstName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserName method, of class BrewMaster.
     */
    @Test
    public void testGetUserName() {
        System.out.println("getUserName");
        BrewMaster instance = new BrewMaster();
        String expResult = "";
        String result = instance.getUserName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserName method, of class BrewMaster.
     */
    @Test
    public void testSetUserName() {
        System.out.println("setUserName");
        String userName = "";
        BrewMaster instance = new BrewMaster();
        instance.setUserName(userName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastName method, of class BrewMaster.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        BrewMaster instance = new BrewMaster();
        String expResult = "";
        String result = instance.getLastName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastName method, of class BrewMaster.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "";
        BrewMaster instance = new BrewMaster();
        instance.setLastName(lastName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class BrewMaster.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        BrewMaster instance = new BrewMaster();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class BrewMaster.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        BrewMaster instance = new BrewMaster();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
