/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package proyecto;

/**
 *<pre>
 * Esta interface contiene los métodos requeridos para la clase PilaC.
 * </pre>
 * @author DiegoMendez, AndreaCardalda, JuanAntonioCasas, AlmudenaGarza, BernardoMarco
 */
public interface PilaADT<T> {
    public void push(T t);
    public T pop();
    public boolean isEmpty();
    public T peek();
}
