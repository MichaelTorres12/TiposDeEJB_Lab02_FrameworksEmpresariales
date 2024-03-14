/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab02_tc100220.Beans;

import javax.ejb.Stateless;

/**
 *
 * @author Michael Torres
 */

@Stateless
public class Saludo implements ISaludoRemote{
    
    @Override
    public String getSaludo(String suNombre){
        System.out.println("Ejecutando Saludo");
        return "Buenas Noches: " + suNombre;
    }
}
