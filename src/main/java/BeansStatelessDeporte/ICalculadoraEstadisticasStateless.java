/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package BeansStatelessDeporte;

import javax.ejb.Remote;
/**
 *
 * @author Michael Torres
 */
@Remote
public interface ICalculadoraEstadisticasStateless {
    double calcularPromedioGoles(int totalGoles, int totalPartidos);
    double calcularPorcentajeVictorias(int totalVictorias, int totalPartidos);

    //Del local
    public String obtenerInformacionDeporte(String fútbol);
}