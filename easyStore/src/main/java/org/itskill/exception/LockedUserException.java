/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itskill.exception;

/**
 *
 * @author Rhandy
 */
public class LockedUserException extends Exception {

    private static final long serialVersionUID = -182787522200415866L;

    public LockedUserException() {
        super();
    }

    public LockedUserException(String message) {
        super(message);
    }

    public LockedUserException(String message, Throwable cause) {
        super(message, cause);
    }

    public LockedUserException(Throwable cause) {
        super(cause);
    }
}
