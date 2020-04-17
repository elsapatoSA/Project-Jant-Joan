/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.etsetb.poo.blog.domini;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author aaron.vaquero
 */
public class TempsIT {
    
    public TempsIT() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of ara method, of class Temps.
     */
    @Test
    public void testAra() {
        System.out.println("ara");
        Temps instance = new Temps();
        instance.ara();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of comparaDia method, of class Temps.
     */
    @Test
    public void testComparaDia() {
        System.out.println("comparaDia");
        Temps altre = null;
        Temps instance = new Temps();
        int expResult = 0;
        int result = instance.comparaDia(altre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of comparaTemps method, of class Temps.
     */
    @Test
    public void testComparaTemps() {
        System.out.println("comparaTemps");
        Temps altre = null;
        Temps instance = new Temps();
        int expResult = 0;
        int result = instance.comparaTemps(altre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
