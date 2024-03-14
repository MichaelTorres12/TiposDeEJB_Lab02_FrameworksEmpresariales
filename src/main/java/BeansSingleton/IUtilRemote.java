/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package BeansSingleton;

import javax.ejb.Remote;

/**
 *
 * @author Michael Torres
 */

@Remote
public interface IUtilRemote {
    public String saludo();
}
