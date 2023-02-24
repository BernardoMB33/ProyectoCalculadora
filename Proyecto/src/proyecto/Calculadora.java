/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *<pre>
 * Esta clase convierte las expresiones de infija a postfija a través de diferentes métodos.
 * </pre>
 * @author DiegoMendez, AndreaCardalda, JuanAntonioCasas, AlmudenaGarza, BernardoMarco
 */
public class Calculadora {
    
    /**
     * Método que regresa boolean dependiendo de si un dato es un operador o no.
     * @param c: dato introducido de tipo char.
     * @return <ul>
     * <li>true: si el elemento introducido se encuentra en la lista establecida. </li>
     * <li>false: si el elemento introducido no se encuentra en la lista establecida. </li>
     * </ul>
     */
    public static boolean isSymbol(char c){
        ArrayList<Character> x = new ArrayList<>(Arrays.asList('-', '+', '/', '*', '%', '^'));
        return x.contains(c);
    }
    
    /**
     * Método que regresa boolean dependiendo de si es un número o no.
     * Se intenta convertir el elemento a entero.
     * @param c: dato introducido de tipo char.
     * @return <ul>
     * <li>true: si el elemento introducido se pudo convertir a entero y por lo tanto es un número. </li>
     * <li>false: si el elemento introducido no se pudo convertir a entero y por lo tanto no es un número. </li>
     * </ul>
     */
    public static boolean isNumber(char c){
        boolean resp;
        try{
            int i = Integer.parseInt(c+"");
            resp = true;
            
        }catch(Exception e){
            resp = false;
        }
        
        return resp;
    }
    
    /**
     * Método que regresa boolean dependiendo de la comparación entre dos datos introducidos.
     * Se le asigna un valor númerico a cada operador dependiendo de su jerarquía.
     * Se compara ese valor númerico para poder establecer una jerarquía de operaciones.
     * Se establece la prioridad de operaciones.
     * @param a: dato introducido de tipo char.
     * @param b: dato introducido de tipo char.
     * @return <ul>
     * <li>true: si a tiene una mayor prioridad que b. </li>
     * <li>false: si b tiene una mayor prioridad que a. </li>
     * </ul>
     */
    public static boolean comparaOperadores(char a, char b){
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('+', 1);
        map.put('-', 1);
        map.put('*', 2);
        map.put('/', 2);
        map.put('^', 3);
        map.put('(', 0);
        
        return map.get(a) <= map.get(b);
    }
    
    /**
     * Método que convierte una expresión de infija a postfija.
     * Utiliza los métodos anteriores encontrados en esta clase.
     * @param ex: dato de tipo String que representa la expresión que se quiere convertir.
     * @return ArrayList de tipo String con la expresión convertida en postfija.
     */
    public ArrayList<String> lee(String ex){
        ArrayList<String> arr =  new ArrayList();
        PilaC<Character> pila = new PilaC();
        int i = 0, j, parEx = 0;
        boolean prev = true, dec = false;
        String val = "";
        
        while(i < ex.length()){
            if(ex.charAt(i) == '-' && prev){
                if(ex.charAt(i + 1) != '('){
                    j = 1;
                    val = "-";
                    prev = false;
                    while( i+j < ex.length()&& (!isSymbol(ex.charAt(i + j)) && ex.charAt(i + j) != ')')){
                        val+= ex.charAt(i+j) + "";
                        j++;
                    }
                    arr.add(val);
                    val = "";
                    i += j - 1;
                }else{
                    arr.add("-1");
                    pila.push('(');
                    pila.push('*');
                    parEx++;
                    prev = false;
                }

                
            }else{
                if(isNumber(ex.charAt(i))){
                    j = 0;
                    prev = false;
                    val = "";
                    while(i+j < ex.length() && (!isSymbol(ex.charAt(i + j)) && ex.charAt(i + j) != ')') ){
                        val+= ex.charAt(i+j) + "";
                        j++;
                    }
                    arr.add(val);
                    val = "";
                    i += j - 1;

                }else{
                    if(isSymbol(ex.charAt(i))){
                        while(!pila.isEmpty() && comparaOperadores(ex.charAt(i), pila.peek())){
                            arr.add(pila.pop() + "");
                        }
                        pila.push(ex.charAt(i));
                        prev = true;
                    }else{
                        if(ex.charAt(i) == '('){
                            prev = true;
                            pila.push(ex.charAt(i));
                        }else{
                            if(ex.charAt(i) == ')'){
                                parEx++;
                                while(parEx > 0){
                                    while(pila.peek() != '('){
                                        arr.add(pila.pop() + "");
                                    }
                                    pila.pop();
                                    parEx--;
                                }
                                    
                            }
                        }
                    }
                }
            }
            i++;
        }
        while(!pila.isEmpty()){
            arr.add(pila.pop() + "");

        }
        
        return arr;
    }
}