/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.parcial.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 * @author 2130267
 */
@SpringBootApplication
@ComponentScan(basePackages = {"edu.application"})
public class AeropuertosAPIAplication {
    
    public static void main(String[] args) {
		SpringApplication.run(AeropuertosAPIAplication.class,args);
	}
    
}
