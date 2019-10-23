/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.parcial.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import edu.eci.arsw.parcial.services.AeropuertoServices;


/**
 *
 * @author 2130267
 */

@RestController
@RequestMapping(value = "/aeropuerto")
public class ApiControlerAeropuerto {
    
    @Autowired
    private AeropuertoServices aeropuertoServices = null;
    
    
}
