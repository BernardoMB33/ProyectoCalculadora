/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package proyecto;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DiegoMendez, AndreaCardalda, JuanAntonioCasas, AlmudenaGarza, BernardoMarco
 */
public class Calculadora1Test {
    
    public Calculadora1Test() {
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
     * Test of sintaxis method, of class Calculadora1.
     */
    @Test
    public void testSintaxis() {
        System.out.println("sintaxis");
        String cadena = "(4+5)*2";
        Calculadora1 instance = new Calculadora1();
        boolean expResult = true;
        boolean result = instance.sintaxis(cadena);
        assertEquals(expResult, result);
        
    }
    
}
