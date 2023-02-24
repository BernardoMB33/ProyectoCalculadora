/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.util.ArrayList;

/**
 *<pre>
 * Esta clase evalúa una expresión en forma de postfija para poder obtener una solución.
 * </pre>
 * @author DiegoMendez, AndreaCardalda, JuanAntonioCasas, AlmudenaGarza, BernardoMarco
 */
public class EvaPost {
     
    /**
     * Método que obtiene la solución a la expresión convertida de infija a postfija en la clase Calculadora.
     * @param array: una lista de tipo String que fue regresada en la conversión de infija a postfija.
     * @return double: solución final a la expresión.
     */
    public static double metodo(ArrayList<String> array){
        ArrayList<String> array1 = new ArrayList<String>();
        array1.add("+"); array1.add("-"); array1.add("*"); array1.add("/"); array1.add("^");
        
        PilaC<String> pila = new PilaC();
        
        for (int i = 0; i < array.size(); i++) {
            boolean resp=false;
            for (int j = 0; j < array1.size(); j++) {
                if(array.get(i).equals(array1.get(j))){
                    resp=true;
                }
            }
            
            if(!resp){
                pila.push(Double.parseDouble(array.get(i))+"");
            }else{
                double n1 = Double.parseDouble(pila.pop());
                double n2 = Double.parseDouble(pila.pop());
                double respuesta=-1;
                
                switch (array.get(i).charAt(0)) {
                    case '+':
                        respuesta = n2+n1;
                        break;
                    case '-':
                        respuesta = n2-n1;
                        break;
                    case '*':
                        respuesta = n2*n1;
                        break;    
                    case '/':
                        respuesta = n2/n1;
                        break;    
                    case '^':
                        respuesta = Math.pow(n2, n1);
                        break; 
                }
                pila.push(respuesta+"");

            }     
        }
        
        return Double.parseDouble(pila.peek());
        
    }
}
