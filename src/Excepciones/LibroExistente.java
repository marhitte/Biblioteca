/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author pc
 */
public class LibroExistente extends Exception {

    /**
     * Creates a new instance of <code>LibroExistente</code> without detail
     * message.
     */
    public LibroExistente() {
    }

    /**
     * Constructs an instance of <code>LibroExistente</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public LibroExistente(String msg) {
        super(msg);
    }
}
