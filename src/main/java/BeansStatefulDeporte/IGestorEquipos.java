/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package BeansStatefulDeporte;

import javax.ejb.Remote;
/**
 *
 * @author Michael Torres
 */
@Remote
public interface IGestorEquipos {
    void agregarEquipo(String nombreEquipo);
    void borrarEquipo(String nombreEquipo);
    int contarCantidadDeEquipos();
    void borrarTodosLosEquipos();
    
    //Del local
    public String obtenerInformacionDeporte(String fútbol);
}