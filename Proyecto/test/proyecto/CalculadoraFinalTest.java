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
public class CalculadoraFinalTest {
    
    public CalculadoraFinalTest() {
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
     * Test of usar method, of class CalculadoraFinal.
     */
    @Test
    public void testUsar() {
        String expresion = "(5+2)*5";
        String expResult = "35.0";
        String result = CalculadoraFinal.usar(expresion);
        assertEquals(expResult, result);
    }

    /**
     * Test of main method, of class CalculadoraFinal.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CalculadoraFinal.main(args);
    }
    
}
