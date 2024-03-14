/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package BeansSingletonDeporte;
import javax.ejb.Remote;

/**
 *
 * @author Michael Torres
 */

@Remote
public interface IConfiguracionTorneoSingleton {
    int getNumeroDeEquipos();
    void setNumeroDeEquipos(int numeroDeEquipos);
    
    //Del local
    public String obtenerInformacionDeporte(String fútbol);
}
