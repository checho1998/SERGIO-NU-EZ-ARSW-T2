/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.parcial.DAO;

import edu.eci.arsw.parcial.model.Aiport;
import edu.eci.arsw.parcial.exeptions.AeropuertosPersistenceException;
/**
 *
 * @author 2130267
 */
public interface  AeropuertoDAO {
    
    public Aiport consultarAeropuerto(String aiportID)throws AeropuertosPersistenceException;
    
    
}
