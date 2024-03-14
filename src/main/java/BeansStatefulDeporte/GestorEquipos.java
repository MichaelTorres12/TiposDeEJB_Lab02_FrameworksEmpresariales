/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BeansStatefulDeporte;

import BeansLocalesDeporte.BibliotecaDeporte.IBibliotecaDeporteLocal;
import javax.ejb.Stateful;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author Michael Torres
 */
@Stateful
public class GestorEquipos implements IGestorEquipos {
    
    @EJB
    private IBibliotecaDeporteLocal bibliotecaDeporte; // Inyección del EJB local
    
    private final List<String> equipos = new ArrayList<>();

    @Override
    public void agregarEquipo(String nombreEquipo) {
        if (!equipos.contains(nombreEquipo)) {
            equipos.add(nombreEquipo);
        }
    }

    @Override
    public void borrarEquipo(String nombreEquipo) {
        equipos.remove(nombreEquipo);
    }

    @Override
    public int contarCantidadDeEquipos() {
        return equipos.size();
    }

    @Override
    public void borrarTodosLosEquipos() {
        equipos.clear();
    }
    
    // Ejemplo de un nuevo método que utiliza el EJB local
    public String obtenerInformacionDeporte(String deporte) {
        String descripcion = bibliotecaDeporte.obtenerDescripcionDeporte(deporte);
        int maxJugadores = bibliotecaDeporte.obtenerCantidadMaximaJugadores(deporte);
        return "Deporte: " + deporte + ", " + descripcion + ", Máx. Jugadores: " + maxJugadores;
    }
}