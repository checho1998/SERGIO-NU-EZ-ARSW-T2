/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.parcial.MyBatisDAO;

import edu.eci.arsw.parcial.DAO.AeropuertoDAO;
import edu.eci.arsw.parcial.model.Aiport;

import edu.eci.arsw.parcial.exeptions.AeropuertosPersistenceException;
import edu.eci.arsw.parcial.persistence.AeropuertoPersistence;
import org.springframework.beans.factory.annotation.Autowired;
/**
 *
 * @author 2130267
 */
public class MyBatisAeropuertoDAO implements AeropuertoDAO{
    @Autowired
    AeropuertoPersistence usPer = null;
    
    @Override
    public Aiport consultarAeropuerto(String aiportID) throws AeropuertosPersistenceException{
        return usPer.getAeropuerto(aiportID);
    }
    
}
