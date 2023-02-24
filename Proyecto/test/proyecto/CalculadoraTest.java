/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package proyecto;

import java.util.ArrayList;
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
public class CalculadoraTest {
    
    public CalculadoraTest() {
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
     * Test of main method, of class Calculadora.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Main.main(args);
    }

    /**
     * Test of isSymbol method, of class Calculadora.
     */
    @Test
    public void testIsSymbol() {
        System.out.println("isSymbol");
        char c = '-';
        boolean expResult = true;
        boolean result = Calculadora.isSymbol(c);
        assertEquals(expResult, result);
    }

    /**
     * Test of isNumber method, of class Calculadora.
     */
    @Test
    public void testIsNumber() {
        System.out.println("isNumber");
        char c = '2';
        boolean expResult = true;
        boolean result = Calculadora.isNumber(c);
        assertEquals(expResult, result);
    }

    /**
     * Test of comparaOperadores method, of class Calculadora.
     */
    @Test
    public void testComparaOperadores() {
        System.out.println("comparaOperadores");
        char a = '*';
        char b = '-';
        boolean expResult = false;
        boolean result = Calculadora.comparaOperadores(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of lee method, of class Calculadora.
     */
    @Test
    public void testLee() {
        System.out.println("lee");
        String ex = "(8-4)^2+1";
        Calculadora instance = new Calculadora();
        ArrayList<String> l=new ArrayList();
        l.add("8");
        l.add("4");
        l.add("-");
        l.add("2");
        l.add("^");
        l.add("1");
        l.add("+");
        ArrayList<String> expResult = l;
        ArrayList<String> result = instance.lee(ex);
        assertEquals(expResult, result);
    }
    
}
