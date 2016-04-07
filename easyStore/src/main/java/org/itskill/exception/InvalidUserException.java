/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itskill.exception;

/**
 *
 * @author Programador
 */
public class InvalidUserException extends Exception {

    private static final long serialVersionUID = -182787522200415866L;

    public InvalidUserException() {
        super();
    }

    public InvalidUserException(String message) {
        super(message);
    }

    public InvalidUserException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidUserException(Throwable cause) {
        super(cause);
    }
}
