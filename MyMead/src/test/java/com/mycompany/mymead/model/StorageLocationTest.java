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
public class StorageLocationTest {
    
    public StorageLocationTest() {
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
     * Test of getId method, of class StorageLocation.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        StorageLocation instance = new StorageLocation();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class StorageLocation.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        StorageLocation instance = new StorageLocation();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class StorageLocation.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        StorageLocation instance = new StorageLocation();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class StorageLocation.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        StorageLocation instance = new StorageLocation();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLocation method, of class StorageLocation.
     */
    @Test
    public void testGetLocation() {
        System.out.println("getLocation");
        StorageLocation instance = new StorageLocation();
        String expResult = "";
        String result = instance.getLocation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLocation method, of class StorageLocation.
     */
    @Test
    public void testSetLocation() {
        System.out.println("setLocation");
        String location = "";
        StorageLocation instance = new StorageLocation();
        instance.setLocation(location);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class StorageLocation.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        StorageLocation instance = new StorageLocation();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class StorageLocation.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        StorageLocation instance = new StorageLocation();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
