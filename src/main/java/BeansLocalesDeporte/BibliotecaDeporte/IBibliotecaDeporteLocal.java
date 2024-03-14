/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package BeansLocalesDeporte.BibliotecaDeporte;

import javax.ejb.Local;
/**
 *
 * @author Michael Torres
 */
@Local
public interface IBibliotecaDeporteLocal {
    String obtenerDescripcionDeporte(String deporte);
    int obtenerCantidadMaximaJugadores(String deporte);
}