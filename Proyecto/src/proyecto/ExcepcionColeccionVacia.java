/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *<pre>
 * Esta clase contiene las excepciones que se usaran en la clase PilaC.
 * </pre>
 * @author DiegoMendez, AndreaCardalda, JuanAntonioCasas, AlmudenaGarza, BernardoMarco
 */
public class ExcepcionColeccionVacia extends RuntimeException{

    public ExcepcionColeccionVacia() {
    }

    public ExcepcionColeccionVacia(String message) {
        super(message);
    }
    
}