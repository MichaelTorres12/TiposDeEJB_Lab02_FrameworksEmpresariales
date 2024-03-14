/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.lab02_tc100220.Beans;

import javax.ejb.Remote;

/**
 *
 * @author Michael Torres
 */

@Remote
public interface ISaludoRemote {
    public String getSaludo(String suNombre);
}
