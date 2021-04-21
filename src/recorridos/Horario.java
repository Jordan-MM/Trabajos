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
    //para inciar necesita el trayecto y el dia
    public Horario(Trayecto t, Dia d) {
        dia = d;
        trayecto = t;
        estaciones = obtener();
    } 
    //usamos getestaciones para conseguir la lista de estaciones
    public ArrayList<Estacion> getEstaciones() {
        return estaciones;
    } 
    
     public ArrayList<Estacion> obtener() {
        ArrayList<Estacion> e = new ArrayList<Estacion>();
        
        if(!Trayecto.SANJOSE_CARTAGO.equals(trayecto)){
            // Este es el recorrido de Cartago a San Jose
            if(!Dia.SABADO.equals(dia)){
                // Recorrido semanal
                e.add(new Estacion("Estación Los Angeles", "05:20am"));
                e.add(new Estacion("Estación Cartago", "05:30am"));
                e.add(new Estacion("Estación Tres Rios", "05:5am"));
                e.add(new Estacion("Estación Uaca", "05:59am"));
                e.add(new Estacion("Estación CFIA", "06:07am"));
                e.add(new Estacion("Estación U.Latina", "06:11am"));
                e.add(new Estacion("Estación UCR", "06:15am"));
                e.add(new Estacion("Estación Atlántico", "06:21am"));
                e.add(new Estacion("Estación Atlantico", "06:30am"));
                e.add(new Estacion("Estación UCR", "06:34am"));
                e.add(new Estacion("Estación CFIA", "06:38am"));
                e.add(new Estacion("Estación U.Latina", "06:42am"));
                e.add(new Estacion("Estación Uaca", "06:49am"));
                e.add(new Estacion("Estación Tres Rios", "06:58am"));
                e.add(new Estacion("Estación Cartago", "07:22am"));
                e.add(new Estacion("Estación Los Angeles", "07:25am"));
                e.add(new Estacion("Estación Los Angeles", "07:30am"));
                e.add(new Estacion("Estación Cartago", "07:35am"));
                e.add(new Estacion("Estación Tres Rios", "07:56am"));
                e.add(new Estacion("Estación Uaca", "08:04am"));
                e.add(new Estacion("Estación CFIA", "08:12am"));
                e.add(new Estacion("Estación U.Latina", "08:16am"));
                e.add(new Estacion("Estación UCR", "08:20am"));
                e.add(new Estacion("Estación Atlántico", "08:26am"));
                e.add(new Estacion("Estación Atlantico", "15:00am"));
                e.add(new Estacion("Estación UCR", "15:04am"));
                e.add(new Estacion("Estación CFIA", "15:08am"));
                e.add(new Estacion("Estación U.Latina", "15:12am"));
                e.add(new Estacion("Estación Uaca", "15:19am"));
                e.add(new Estacion("Estación Tres Rios", "15:28am"));
                e.add(new Estacion("Estación Cartago", "15:52am"));
                e.add(new Estacion("Estación Los Angeles", "15:55am"));
                e.add(new Estacion("Estación Los Angeles", "16:00am"));
                e.add(new Estacion("Estación Cartago", "16:05am"));
                e.add(new Estacion("Estación Tres Rios", "16:21am"));
                e.add(new Estacion("Estación Uaca", "16:34am"));
                e.add(new Estacion("Estación CFIA", "16:42am"));
                e.add(new Estacion("Estación U.Latina", "16:46am"));
                e.add(new Estacion("Estación UCR", "16:50am"));
                e.add(new Estacion("Estación Atlántico", "16:56am"));
                e.add(new Estacion("Estación Atlantico", "17:00am"));
                e.add(new Estacion("Estación UCR", "17:04am"));
                e.add(new Estacion("Estación CFIA", "17:08am"));
                e.add(new Estacion("Estación U.Latina", "17:12am"));
                e.add(new Estacion("Estación Uaca", "17:19am"));
                e.add(new Estacion("Estación Tres Rios", "17:28am"));
                e.add(new Estacion("Estación Cartago", "17:52am"));
                e.add(new Estacion("Estación Los Angeles", "17:55am"));
                e.add(new Estacion("Estación Los Angeles", "18:00am"));
                e.add(new Estacion("Estación Cartago", "18:16am"));
                e.add(new Estacion("Estación Tres Rios", "18:29am"));
                e.add(new Estacion("Estación Uaca", "18:37am"));
                e.add(new Estacion("Estación CFIA", "18:41am"));
                e.add(new Estacion("Estación U.Latina", "18:45am"));
                e.add(new Estacion("Estación UCR", "16:51am"));
            } else {
                // Recorridos sabado
                e.add(new Estacion("Estación Cartago", "06:30am"));
                e.add(new Estacion("Estación Tres Rios", "06:51am"));
                e.add(new Estacion("Estación Uaca", "06:59am"));
                e.add(new Estacion("Estación CFIA", "07:07am"));
                e.add(new Estacion("Estación U.Latina", "07:11am"));
                e.add(new Estacion("Estación UCR", "07:15am"));
                e.add(new Estacion("Estación Atlántico", "07:21am"));
                e.add(new Estacion("Estación Cartago", "07:30am"));
                e.add(new Estacion("Estación Tres Rios", "07:51am"));
                e.add(new Estacion("Estación Uaca", "07:59am"));
                e.add(new Estacion("Estación CFIA", "08:07am"));
                e.add(new Estacion("Estación U.Latina", "08:11am"));
                e.add(new Estacion("Estación UCR", "08:15am"));
                e.add(new Estacion("Estación Atlántico", "08:21am"));
                e.add(new Estacion("Estación Cartago", "08:30am"));
                e.add(new Estacion("Estación Tres Rios", "08:51am"));
                e.add(new Estacion("Estación Uaca", "08:59am"));
                e.add(new Estacion("Estación CFIA", "09:07am"));
                e.add(new Estacion("Estación U.Latina", "09:11am"));
                e.add(new Estacion("Estación UCR", "09:15am"));
                e.add(new Estacion("Estación Atlántico", "09:21am"));
                e.add(new Estacion("Estación Cartago", "09:30am"));
                e.add(new Estacion("Estación Tres Rios", "09:51am"));
                e.add(new Estacion("Estación Uaca", "09:59am"));
                e.add(new Estacion("Estación CFIA", "10:07am"));
                e.add(new Estacion("Estación U.Latina", "10:11am"));
                e.add(new Estacion("Estación UCR", "10:15am"));
                e.add(new Estacion("Estación Atlántico", "10:21am"));
                e.add(new Estacion("Estación Cartago", "10:30am"));
                e.add(new Estacion("Estación Tres Rios", "10:51am"));
                e.add(new Estacion("Estación Uaca", "10:59am"));
                e.add(new Estacion("Estación CFIA", "11:07am"));
                e.add(new Estacion("Estación U.Latina", "11:11am"));
                e.add(new Estacion("Estación UCR", "11:15am"));
                e.add(new Estacion("Estación Atlántico", "11:21am"));
                e.add(new Estacion("Estación Cartago", "11:30am"));
                e.add(new Estacion("Estación Tres Rios", "11:51am"));
                e.add(new Estacion("Estación Uaca", "11:59am"));
                e.add(new Estacion("Estación CFIA", "12:07am"));
                e.add(new Estacion("Estación U.Latina", "12:11am"));
                e.add(new Estacion("Estación UCR", "12:15am"));
                e.add(new Estacion("Estación Atlántico", "12:21am"));
                e.add(new Estacion("Estación Cartago", "12:30am"));
                e.add(new Estacion("Estación Tres Rios", "12:51am"));
                e.add(new Estacion("Estación Uaca", "12:59am"));
                e.add(new Estacion("Estación CFIA", "01:07pm"));
                e.add(new Estacion("Estación U.Latina", "01:11pm"));
                e.add(new Estacion("Estación UCR", "01:15pm"));
                e.add(new Estacion("Estación Atlántico", "01:21pm"));
                e.add(new Estacion("Estación Cartago", "01:30pm"));
                e.add(new Estacion("Estación Tres Rios", "01:51pm"));
                e.add(new Estacion("Estación Uaca", "01:59pm"));
                e.add(new Estacion("Estación CFIA", "02:07pm"));
                e.add(new Estacion("Estación U.Latina", "02:11pm"));
                e.add(new Estacion("Estación UCR", "02:15pm"));
                e.add(new Estacion("Estación Atlántico", "02:21pm"));
            }
            
        } else {
            // Este es el recorrido de San Jose a Cartago
            if(Dia.SABADO != dia){
                // Recorrido semanal
                e.add(new Estacion("Estación Atlantico", "06:30am"));
                e.add(new Estacion("Estación UCR", "06:34am"));
                e.add(new Estacion("Estación CFIA", "06:38am"));
                e.add(new Estacion("Estación U.Latina", "06:42am"));
                e.add(new Estacion("Estación Uaca", "06:49am"));
                e.add(new Estacion("Estación Tres Rios", "06:58am"));
                e.add(new Estacion("Estación Cartago", "07:22am"));
                e.add(new Estacion("Estación Los Angeles", "07:25am"));
                e.add(new Estacion("Estación Los Angeles", "07:30am"));
                e.add(new Estacion("Estación Cartago", "07:35am"));
                e.add(new Estacion("Estación Tres Rios", "07:56am"));
                e.add(new Estacion("Estación Uaca", "08:04am"));
                e.add(new Estacion("Estación CFIA", "08:12am"));
                e.add(new Estacion("Estación U.Latina", "08:16am"));
                e.add(new Estacion("Estación UCR", "08:20am"));
                e.add(new Estacion("Estación Atlántico", "08:26am"));
                e.add(new Estacion("Estación Atlantico", "15:00am"));
                e.add(new Estacion("Estación UCR", "15:04am"));
                e.add(new Estacion("Estación CFIA", "15:08am"));
                e.add(new Estacion("Estación U.Latina", "15:12am"));
                e.add(new Estacion("Estación Uaca", "15:19am"));
                e.add(new Estacion("Estación Tres Rios", "15:28am"));
                e.add(new Estacion("Estación Cartago", "15:52am"));
                e.add(new Estacion("Estación Los Angeles", "15:55am"));
                e.add(new Estacion("Estación Los Angeles", "16:00am"));
                e.add(new Estacion("Estación Cartago", "16:05am"));
                e.add(new Estacion("Estación Tres Rios", "16:21am"));
                e.add(new Estacion("Estación Uaca", "16:34am"));
                e.add(new Estacion("Estación CFIA", "16:42am"));
                e.add(new Estacion("Estación U.Latina", "16:46am"));
                e.add(new Estacion("Estación UCR", "16:50am"));
                e.add(new Estacion("Estación Atlántico", "16:56am"));
                e.add(new Estacion("Estación Atlantico", "17:00am"));
                e.add(new Estacion("Estación UCR", "17:04am"));
                e.add(new Estacion("Estación CFIA", "17:08am"));
                e.add(new Estacion("Estación U.Latina", "17:12am"));
                e.add(new Estacion("Estación Uaca", "17:19am"));
                e.add(new Estacion("Estación Tres Rios", "17:28am"));
                e.add(new Estacion("Estación Cartago", "17:52am"));
                e.add(new Estacion("Estación Los Angeles", "17:55am"));
                e.add(new Estacion("Estación Los Angeles", "18:00am"));
                e.add(new Estacion("Estación Cartago", "18:16am"));
                e.add(new Estacion("Estación Tres Rios", "18:29am"));
                e.add(new Estacion("Estación Uaca", "18:37am"));
                e.add(new Estacion("Estación CFIA", "18:41am"));
                e.add(new Estacion("Estación U.Latina", "18:45am"));
                e.add(new Estacion("Estación UCR", "16:51am"));
            } else {
                // Recorridos sabado
                e.add(new Estacion("Estación Atlántico", "06:30am"));
                e.add(new Estacion("Estación UCR", "06:34am"));
                e.add(new Estacion("Estación U.Latina", "06:38am"));
                e.add(new Estacion("Estación CFIA", "06:42am"));
                e.add(new Estacion("Estación UACA", "06:49am"));
                e.add(new Estacion("Estación Tres Rios", "06:58am"));
                e.add(new Estacion("Estación Cartago", "07:22am"));
                e.add(new Estacion("Estación Atlántico", "07:30am"));
                e.add(new Estacion("Estación UCR", "07:34am"));
                e.add(new Estacion("Estación U.Latina", "07:38am"));
                e.add(new Estacion("Estación CFIA", "07:42am"));
                e.add(new Estacion("Estación UACA", "07:49am"));
                e.add(new Estacion("Estación Tres Rios", "07:58am"));
                e.add(new Estacion("Estación Cartago", "08:22am"));
                e.add(new Estacion("Estación Atlántico", "08:30am"));
                e.add(new Estacion("Estación UCR", "08:34am"));
                e.add(new Estacion("Estación U.Latina", "08:38am"));
                e.add(new Estacion("Estación CFIA", "08:42am"));
                e.add(new Estacion("Estación UACA", "08:49am"));
                e.add(new Estacion("Estación Tres Rios", "09:58am"));
                e.add(new Estacion("Estación Cartago", "09:22am"));
                e.add(new Estacion("Estación Atlántico", "09:30am"));
                e.add(new Estacion("Estación UCR", "09:34am"));
                e.add(new Estacion("Estación U.Latina", "09:38am"));
                e.add(new Estacion("Estación CFIA", "09:42am"));
                e.add(new Estacion("Estación UACA", "09:49am"));
                e.add(new Estacion("Estación Tres Rios", "09:58am"));
                e.add(new Estacion("Estación Cartago", "10:22am"));
                e.add(new Estacion("Estación Atlántico", "10:30am"));
                e.add(new Estacion("Estación UCR", "10:34am"));
                e.add(new Estacion("Estación U.Latina", "10:38am"));
                e.add(new Estacion("Estación CFIA", "10:42am"));
                e.add(new Estacion("Estación UACA", "10:49am"));
                e.add(new Estacion("Estación Tres Rios", "10:58am"));
                e.add(new Estacion("Estación Cartago", "11:22am"));
                e.add(new Estacion("Estación Atlántico", "11:30am"));
                e.add(new Estacion("Estación UCR", "11:34am"));
                e.add(new Estacion("Estación U.Latina", "11:38am"));
                e.add(new Estacion("Estación CFIA", "11:42am"));
                e.add(new Estacion("Estación UACA", "11:49am"));
                e.add(new Estacion("Estación Tres Rios", "12:58am"));
                e.add(new Estacion("Estación Cartago", "12:22am"));
                e.add(new Estacion("Estación Atlántico", "12:30am"));
                e.add(new Estacion("Estación UCR", "12:34am"));
                e.add(new Estacion("Estación U.Latina", "12:38am"));
                e.add(new Estacion("Estación CFIA", "12:42am"));
                e.add(new Estacion("Estación UACA", "12:49am"));
                e.add(new Estacion("Estación Tres Rios", "12:58am"));
                e.add(new Estacion("Estación Cartago", "01:22pm"));
                e.add(new Estacion("Estación Atlántico", "01:30pm"));
                e.add(new Estacion("Estación UCR", "01:34pm"));
                e.add(new Estacion("Estación U.Latina", "01:38pm"));
                e.add(new Estacion("Estación CFIA", "01:42pm"));
                e.add(new Estacion("Estación UACA", "01:49pm"));
                e.add(new Estacion("Estación Tres Rios", "01:58pm"));
                e.add(new Estacion("Estación Cartago", "02:22pm"));
            }
        }
        
        return e;
    }
}

