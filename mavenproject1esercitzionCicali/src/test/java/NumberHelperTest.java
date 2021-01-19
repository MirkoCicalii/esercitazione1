/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author informatica
 */
public class NumberHelperTest {
    
    public NumberHelperTest() {
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
     * Test of isEven method, of class NumberHelper.
     */
    @Test
    public void testIsEven() {
        System.out.println("isEven");
        NumberHelper instance = new NumberHelper(4);
        boolean expResult = true;
        boolean result = instance.isEven();
        assertEquals(expResult, result);
        
    }
    @Test
    public void testIsEven2() {
        System.out.println("isEven");
        NumberHelper instance = new NumberHelper(5);
        boolean expResult = false;
        boolean result = instance.isEven();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of isOdd method, of class NumberHelper.
     */
    @Test
    public void testIsOdd() {
        System.out.println("isOdd");
        NumberHelper instance = new NumberHelper(4);
        boolean expResult = false;
        boolean result = instance.isOdd();
        assertEquals(expResult, result);
        
    }
    @Test
    public void testIsOdd2() {
        System.out.println("isOdd");
        NumberHelper instance = new NumberHelper(5);
        boolean expResult = true;
        boolean result = instance.isOdd();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of sum method, of class NumberHelper.
     */
    @Test
    public void testSum() {
        System.out.println("sum");
        int n = 5;
        NumberHelper instance = new NumberHelper(10);
        int expResult = 15;
        int result = instance.sum(n);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of isPrime method, of class NumberHelper.
     */
    @Test
    public void testIsPrime() {
        System.out.println("isPrime");
        NumberHelper instance = new NumberHelper(2);
        boolean expResult = true;
        boolean result = instance.isPrime();
        assertEquals(expResult, result);
       
    }
     @Test
    public void testIsPrime2() {
        System.out.println("isPrime");
        NumberHelper instance = new NumberHelper(10);
        boolean expResult = false;
        boolean result = instance.isPrime();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of isDivisibleBy method, of class NumberHelper.
     */
    @Test
    public void testIsDivisibleBy() {
        System.out.println("isDivisibleBy");
        int n =5;
        NumberHelper instance = new NumberHelper(5);
        boolean expResult = true;
        boolean result = instance.isDivisibleBy(n);
        assertEquals(expResult, result);
        
    }
    
}
