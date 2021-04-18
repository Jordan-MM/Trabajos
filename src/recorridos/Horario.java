/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recorridos;

import componentes.Estacion;
import java.util.ArrayList;

/**
 *
 * @author WIN
 */

public class Horario {
    public final ArrayList<Estacion> estaciones;
    public final Dia dia;
    public final Trayecto trayecto;
    
    public Horario(Trayecto t, Dia d) {
        dia = d;
        trayecto = t;
        estaciones = obtener();
    } 
    
    public ArrayList<Estacion> getEstaciones() {
        return estaciones;
    } 
    
    public ArrayList<Estacion> obtener() {
        ArrayList<Estacion> e = new ArrayList<Estacion>();
        
        if(!Trayecto.SANJOSE_CARTAGO.equals(trayecto)){
            // Este es el recorrido de Cartago a San Jose
            if(!Dia.SABADO.equals(dia)){
                // Recorrido semanal
                e.add(new Estacion("Estación Atlántico", "06:30am"));
            } else {
                // Recorridos sabado
                e.add(new Estacion("Estación Atlántico", "06:30am"));
            }
            
        } else {
            // Este es el recorrido de San Jose a Cartago
            if(Dia.SABADO != dia){
                // Recorrido semanal
                e.add(new Estacion("Estación Atlántico", "06:30am"));
            } else {
                // Recorridos sabado
                e.add(new Estacion("Estación Atlántico", "06:30am"));
            }
        }
        
        return e;
    }
}

