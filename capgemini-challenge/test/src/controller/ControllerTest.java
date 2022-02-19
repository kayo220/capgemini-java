/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.controller;

import java.util.LinkedList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kayos
 */
public class ControllerTest {
    
    public ControllerTest() {
    }
    
  

    /**
     * Test of challege01 method, of class Controller.
     */
    @Test
    public void testChallege01() {
        Controller instance = new Controller();
        String result = instance.challege01(-2);
        String result1 = instance.challege01(0);
        String result2 = instance.challege01(1);
        String result3 = instance.challege01(2);
        System.out.println(result);
        assertEquals(result, "");
        assertEquals(result1, "");
        assertEquals(result2, "*");
        assertEquals(result3, "*\n**");

        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of challege02 method, of class Controller.
     */
    @Test
    public void testChallege02() {
        Controller instance = new Controller();
        int result = instance.challege02("Ya3");
        assertEquals(3, result);
        result = instance.challege02("Ya3!@");
        assertEquals(1, result);
        result = instance.challege02("Ya3!@x");
        assertEquals(0, result);
        result = instance.challege02("Ya3!@x00");
        assertEquals(0, result);
        result = instance.challege02("aaaaaa");
        assertEquals(3, result);
        result = instance.challege02("aaa");
        assertEquals(3, result);
        result = instance.challege02("!!!");
        assertEquals(3, result);
        result = instance.challege02("AAA");
        assertEquals(3, result);
        result = instance.challege02("AaA!");
        assertEquals(2, result);
        result = instance.challege02("");
        assertEquals(6, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of challege03 method, of class Controller.
     */
    @Test
    public void testChallege03() {
        Controller instance = new Controller();
        int result = instance.challege03("ovo");
        assertEquals(2, result);
        result = instance.challege03("ifailuhkqq");
        assertEquals(3, result);
        // TODO review the generated test code and remove the default call to fail.
    }


    
}
