/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavengetstarted;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alek
 */
public class SayHiTest {
    
    public SayHiTest() {
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
     * Test of sayHi method, of class SayHi.
     */
    @Test
    public void testSayHi() {
        System.out.println("sayHi");
        String name = "";
        SayHi instance = new SayHi();
        String expResult = "Hi " + name;
        String result = instance.sayHi(name);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of sayHiHi method, of class SayHi.
     */
    @Test
    public void testSayHiHi() {
        System.out.println("sayHiHi");
        String name = "";
        SayHi instance = new SayHi();
        String expResult = "Hi Hi  " + name;
        String result = instance.sayHiHi(name);
        assertEquals(expResult, result);
        
    }
    
}
