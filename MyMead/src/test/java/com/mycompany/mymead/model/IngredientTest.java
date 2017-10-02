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
public class IngredientTest {
    
    public IngredientTest() {
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
     * Test of getId method, of class Ingredient.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Ingredient instance = new Ingredient();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Ingredient.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Ingredient instance = new Ingredient();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Ingredient.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Ingredient instance = new Ingredient();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Ingredient.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Ingredient instance = new Ingredient();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuantity method, of class Ingredient.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        Ingredient instance = new Ingredient();
        float expResult = 0.0F;
        float result = instance.getQuantity();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantity method, of class Ingredient.
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        float quantity = 0.0F;
        Ingredient instance = new Ingredient();
        instance.setQuantity(quantity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class Ingredient.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Ingredient instance = new Ingredient();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class Ingredient.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "";
        Ingredient instance = new Ingredient();
        instance.setDescription(description);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Ingredient.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        Ingredient instance = new Ingredient();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Ingredient.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Ingredient instance = new Ingredient();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
