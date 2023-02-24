/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *<pre>
 * Representa una pila genérica.
 * Es una estructura abstracta.
 * Tiene toda la funcionalidad esperada en una pila.
 * </pre>
 * @author DiegoMendez, AndreaCardalda, JuanAntonioCasas, AlmudenaGarza, BernardoMarco
 */
public class PilaC<T> implements PilaADT<T>{
    private T[] pila; 
    private int tope;
    private final int MAXIMO = 100;
    
    public PilaC(){
        pila = (T[]) new Object[MAXIMO];
        tope = -1;
    }
    
    public PilaC(int max){
        pila = (T[]) new Object[max];
        tope = -1;
    }
    
    /**
    * Método que introduce datos a una pila
    * @param dato: objeto de tipo T
    */
    public void push(T dato) {
        if(tope == pila.length - 1)
            expande();
        tope ++;
        pila[tope] = dato;
        
    }

    /**
     * Método que saca datos de una pila
     * @return dato tipo T: aquel que se saca de la pila
     */
    public T pop() {
        if(isEmpty())
            throw new ExcepcionColeccionVacia("la pila no tiene datos");
        T eliminado = pila[tope];
        pila[tope] = null;
        
        tope--;
        
        return eliminado;
    }

    /**
     * Permite revisar si la pila está vacía o no
     * @return <ul>
     * <li>true: si la pila no contiene elementos. </li>
     * <li>false: si la pila tiene al menos un elemento </li>
     * </ul>
     */
    public boolean isEmpty() {
        return tope == -1;
    }

    /**
     * Método que permite saber el dato que se encuentra en el tope (o hasta arriba) de la pila
     * @return dato de tipo T: aquel que se encuentra en el topo
     */
    public T peek() {
        if(isEmpty())
            throw new ExcepcionColeccionVacia("la pila no tiene datos");
        return pila[tope];
    }
    
    /**
     * Método que permite expandir el tamaño de la pila para poder almacenar más datos
     */
    private void expande(){
        T[] masGrande = (T[]) new Object[pila.length*2];
        
        for(int i = 0; i <= tope; i++)
            masGrande[i] = pila[i];
        
        pila = masGrande;
    }
}
