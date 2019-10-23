/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.parcial.exeptions;

/**
 *
 * @author 2130267
 */
public class AeropuertosPersistenceException extends Exception {
    public AeropuertosPersistenceException(String message) {
        super(message);
    }

    public AeropuertosPersistenceException(String message, Throwable cause) {
        super(message, cause);
    }
}
