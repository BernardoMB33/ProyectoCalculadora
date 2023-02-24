/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *<pre>
 * Clase con el funcionamiento final de la calculadora.
 * Esta clase usa 3 clases:
 * Calculadora1 que revisa la sintaxis.
 * Calculadora que convierte de infija a postfija.
 * EvaPost que evalúa la expresión en postfija.
 * </pre>
 * @author DiegoMendez, AndreaCardalda, JuanAntonioCasas, AlmudenaGarza, BernardoMarco
 */
public class CalculadoraFinal {
    /**
     * Método que permite la revisión de sintaxis, conversión de infija a postfija y su evaluación
     * @param expresion: dato de tipo String que es la expresión a calcular.
     * @return un dato de tipo String<ul>
     * <li>Error: si la sintaxis está mal. </li>
     * <li>La solución: si la expresión pudo ser evaluada. </li>
     * </ul>
     */
    public static String usar(String expresion) {
        String resp;
        Calculadora post = new Calculadora();
        Calculadora1 revision = new Calculadora1();
        EvaPost resolver = new EvaPost();
        
        
        if(revision.sintaxis(expresion)){
            resp = resolver.metodo(post.lee(expresion))+"";
        }else{
            resp = "Error";
        }
        
        return resp;
    }
    
    /**
     * Prueba para asegurar el buen funcionamiento de la clase y el método.
     * @param args 
     */
    public static void main(String[] args)  {
        System.out.println( "A".compareTo("B"));
    }
}