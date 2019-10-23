/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.parcial.services;

import edu.eci.arsw.parcial.persistence.AeropuertoPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author 2130267
 */

@Service
public class AeropuertoServices {
    
    @Autowired
    AeropuertoPersistence aerPersisten = null;
    
}
