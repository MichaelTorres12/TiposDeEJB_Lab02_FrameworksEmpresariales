/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BeansLocalesDeporte.UtilidadesDeporte;

import javax.ejb.Stateless;
/**
 *
 * @author Michael Torres
 */
@Stateless
public class UtilidadesDeporteBean implements IUtilidadesDeporteLocal {

    @Override
    public boolean esNombreEquipoValido(String nombreEquipo) {
        // Implementp la lógica para validar el nombre del equipo
        return nombreEquipo != null && !nombreEquipo.trim().isEmpty();
    }

}
