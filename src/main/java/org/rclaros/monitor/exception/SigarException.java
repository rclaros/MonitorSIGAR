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
public class SigarException extends STException {

    public static final int status = 500;

    public SigarException() {
        super();
    }

    /**
     *
     * @param message
     */
    public SigarException(String message) {
        super(status, message);
    }

    public SigarException(String code, String message) {
        super(status, code, message);
    }

    /**
     *
     * @param message
     * @param rootCause
     */
    public SigarException(String message, Throwable rootCause) {
        super(status, message, rootCause);
    }

    /**
     *
     * @param rootCause
     */
    public SigarException(Throwable rootCause) {
        super(rootCause);
    }
}
