/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.util.ArrayList;

/**
 *<pre>
 * Esta clase revisa la sintaxis de todas las expresiones que se introducen en la calculadora.
 * El objetivo es evitar que se haga todo el proceso con expresiones que no se pueden resolver.
 * </pre>
 * @author DiegoMendez, AndreaCardalda, JuanAntonioCasas, AlmudenaGarza, BernardoMarco
 */
public class Calculadora1 {
    
    /**
     * Método que revisa la sintaxis de una expresión.
     * Usa diferentes listas con operadores dependiendo de los lugares donde sí se pueden encontrar esos operadores.
     * Hay muchas excepciones que se tienen que tomar en cuenta.
     * @param cadena: dato de tipo String de la expresión a evaluar.
     * @return <ul>
     * <li>true: si la expresión tiene una sintaxis correcta. </li>
     * <li>false: si la expresión no tiene una sintaxis correcta. </li>
     * </ul>
     */
    public boolean sintaxis (String cadena){
        int i=0, j=0;
        ArrayList <Character> operadores= new ArrayList <Character> ();
        ArrayList <Character> operadores2= new ArrayList <Character> ();
        PilaC pila=new PilaC();
        boolean r=true;
        boolean resp=false;
       
        operadores.add('+');
        operadores.add('*');
        operadores.add('/');
        operadores.add('^');
        operadores.add('%');
        operadores.add(')');
        operadores.add('-');
        operadores.add('.');
        
        operadores2.add('+');
        operadores2.add('*');
        operadores2.add('/');
        operadores2.add('^');
        operadores2.add('%');
        operadores2.add(')');
        operadores2.add('.');
        if (cadena.charAt(0)!='-' && cadena.charAt(0)!='.' && operadores2.contains(cadena.charAt(0))){
            r=false;
        }
        while (j<cadena.length() && r){
            if(cadena.charAt(j)=='-' && j-1>=0 && j+1<cadena.length()){
                       if(operadores.contains(cadena.charAt(j-1)) && operadores.contains(cadena.charAt(j+1))){
                           r=false;
                       }
                       if (cadena.indexOf(cadena.charAt(j))==cadena.length()-1){
                           r=false;
                       }
                   }
            j++;
        }
        while (i<cadena.length() && r){
           try{
               Double.parseDouble(cadena.substring(i, i+1));
               
           }catch(Exception e){
               if(cadena.charAt(i)== '(' || cadena.charAt(i)== ')' || cadena.indexOf(cadena.charAt(i))!=cadena.length()-1 && i-1>=0){
                   if(cadena.charAt(i)!= '-' && cadena.charAt(i)!= '(' && cadena.charAt(i)!= ')' && cadena.charAt(i-1)!= ')' && cadena.charAt(i+1)!='(' && (operadores2.contains(cadena.charAt(i-1)) || operadores.contains(cadena.charAt(i+1)))){
                        r=false;
                    }
                   
               
                if(cadena.charAt(i)=='('){
                    if (operadores2.contains(cadena.charAt(i+1))){
                        r=false;
                    }
                    pila.push(cadena.charAt(i));
                }
                else 
                    if(cadena.charAt(i)==')'){
                        if (operadores.contains(cadena.charAt(i-1))){
                            r=false;
                        }
                        try{
                            pila.pop();
                            }
                        catch(Exception e2){
                            r=false;
                    }
                  }
               }
            }
           if (r){
               i++;
           }
        }
        if(i==cadena.length() && pila.isEmpty()){
            resp=true;
        }
        return resp;
    }
   }
      


