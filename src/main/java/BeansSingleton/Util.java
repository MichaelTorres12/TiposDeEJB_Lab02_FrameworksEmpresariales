/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BeansSingleton;

import javax.ejb.Singleton;

/**
 *
 * @author Michael Torres
 */

@Singleton
public class Util implements IUtilRemote{
    
    @Override
    public String saludo(){
        return "Saludo desde BeanSingleton";
    }
    
}
