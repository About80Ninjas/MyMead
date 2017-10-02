/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mymead.model;

import java.time.LocalDate;
import java.util.List;
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
public class MeadTest {
    
    public MeadTest() {
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
     * Test of getId method, of class Mead.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Mead instance = new Mead();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Mead.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Mead instance = new Mead();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDate method, of class Mead.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Mead instance = new Mead();
        LocalDate expResult = null;
        LocalDate result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDate method, of class Mead.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        LocalDate date = null;
        Mead instance = new Mead();
        instance.setDate(date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Mead.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Mead instance = new Mead();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Mead.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Mead instance = new Mead();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComments method, of class Mead.
     */
    @Test
    public void testGetComments() {
        System.out.println("getComments");
        Mead instance = new Mead();
        String expResult = "";
        String result = instance.getComments();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setComments method, of class Mead.
     */
    @Test
    public void testSetComments() {
        System.out.println("setComments");
        String comments = "";
        Mead instance = new Mead();
        instance.setComments(comments);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBrewMaster method, of class Mead.
     */
    @Test
    public void testGetBrewMaster() {
        System.out.println("getBrewMaster");
        Mead instance = new Mead();
        BrewMaster expResult = null;
        BrewMaster result = instance.getBrewMaster();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBrewMaster method, of class Mead.
     */
    @Test
    public void testSetBrewMaster() {
        System.out.println("setBrewMaster");
        BrewMaster brewMaster = null;
        Mead instance = new Mead();
        instance.setBrewMaster(brewMaster);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isCasted method, of class Mead.
     */
    @Test
    public void testIsCasted() {
        System.out.println("isCasted");
        Mead instance = new Mead();
        boolean expResult = false;
        boolean result = instance.isCasted();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCasted method, of class Mead.
     */
    @Test
    public void testSetCasted() {
        System.out.println("setCasted");
        boolean casted = false;
        Mead instance = new Mead();
        instance.setCasted(casted);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIngredients method, of class Mead.
     */
    @Test
    public void testGetIngredients() {
        System.out.println("getIngredients");
        Mead instance = new Mead();
        List<Ingredient> expResult = null;
        List<Ingredient> result = instance.getIngredients();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIngredients method, of class Mead.
     */
    @Test
    public void testSetIngredients() {
        System.out.println("setIngredients");
        List<Ingredient> ingredients = null;
        Mead instance = new Mead();
        instance.setIngredients(ingredients);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStorageLocation method, of class Mead.
     */
    @Test
    public void testGetStorageLocation() {
        System.out.println("getStorageLocation");
        Mead instance = new Mead();
        StorageLocation expResult = null;
        StorageLocation result = instance.getStorageLocation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStorageLocation method, of class Mead.
     */
    @Test
    public void testSetStorageLocation() {
        System.out.println("setStorageLocation");
        StorageLocation storageLocation = null;
        Mead instance = new Mead();
        instance.setStorageLocation(storageLocation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Mead.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        Mead instance = new Mead();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Mead.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Mead instance = new Mead();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
