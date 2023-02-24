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
 * @author carme
 */
public class EvaPostTest {
    
    public EvaPostTest() {
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
     * Test of metodo method, of class EvaPost.
     */
    @Test
    public void testMetodo() {
        System.out.println("metodo");
        ArrayList<String> l=new ArrayList();
        l.add("8");
        l.add("4");
        l.add("-");
        l.add("2");
        l.add("^");
        l.add("1");
        l.add("+");
        ArrayList<String> array = l;
        double expResult = 17.0;
        double result = EvaPost.metodo(array);
        assertEquals(expResult, result, 0.0);
       
    }
    
}