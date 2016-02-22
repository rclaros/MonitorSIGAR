/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rclaros.monitor.exception;

/**
 *
 * @author Reynaldo Claros
 * @email reyiclaros@gmail.com
 */
public class STException extends Exception {

    private String code;
    private int status;

    public STException() {
        super();
    }

    /**
     *
     * @param message
     */
    public STException(String message) {
        super(message);
    }

    public STException(int status, String message) {
        super(message);
        this.status = status;
    }

    /**
     * Este metodo se inicia cuando se invoca desde las excepciones que lo
     * extienden
     *
     * @param status
     * @param code
     * @param message
     */
    public STException(int status, String code, String message) {
        super(message);
        this.status = status;
        this.code = code;
    }

    /**
     *
     * @param status
     * @param message
     * @param rootCause
     */
    public STException(int status, String message, Throwable rootCause) {
        super(message, rootCause);
        this.status = status;
    }

    /**
     *
     * @param rootCause
     */
    public STException(Throwable rootCause) {
        super(rootCause);
    }

    public STException(String message, Throwable rootCause) {
        super(message, rootCause);
    }

    public String getCode() {
        return code;
    }

    public int getStatus() {
        return status;
    }
}
