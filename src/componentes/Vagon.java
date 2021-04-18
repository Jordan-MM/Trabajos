/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;

import java.util.ArrayList;
import recorridos.Trayecto;

/**
 *
 * @author WIN
 */
public class Vagon {
    private final int id;   
    private final ArrayList<Pasajero> pasajeros;
    public final int maximo = 90;
    public int total_recaudado = 0;
    public int total_recaudado_ninos = 0;
    public int total_recaudado_joven = 0;
    public int total_recaudado_regular = 0;

    public int total_transportado = 0;
    public int total_transportado_ninos = 0;
    public int total_transportado_joven = 0;
    public int total_transportado_regular = 0;
    public int total_transportado_adulto = 0;
    
    public Vagon(int i) {
        id = i;
        pasajeros = new ArrayList();
    }
    
    public int getId() {
        return id;
    }
        
    private int establecerBajantes(int cantidad){
        return (int) Math.floor(Math.random() * cantidad);
    }
    
    public String bajarPasajeros() {
        int bajantes = establecerBajantes(pasajeros.size());
        for(int i = bajantes; i > 0; i--) { 
            pasajeros.remove(i);
        }
        return "Vagón" + getId() + ": " + bajantes + "-";
    }           
    private int establecerEntrantes(int cantidad){
        // Returna un numero entre 0 a (la cantidad maxima menos la cantidad actual)
        return (int) Math.floor((Math.random() * (maximo - cantidad)));
    }
private boolean esNino(int edad){
        return edad > 1 && edad <= 10;
    }
    
    private boolean esJoven(int edad){
        return edad > 10 && edad <= 25;
    }
    
    private boolean esRegular(int edad){
        return edad > 25 && edad <= 64;
    }
    
    private boolean esAdulto(int edad){
        return edad > 64;
    }
private int establecerRecaudacion(int edad, Trayecto trayecto){
        boolean t = Trayecto.CARTAGO_SANJOSE.equals(trayecto);
        int r = 0;
        
        if(esNino(edad)){            
            r = t ? 450 : 400;
            total_recaudado_ninos += r;
            total_transportado_ninos++;
            
        } else if(esJoven(edad)){
            r = t ? 550 : 450;
            total_recaudado_joven += r;
            total_transportado_joven++;
            
        } else if(esRegular(edad)){
            r = t ? 700 : 600;
            total_recaudado_regular += r;
            total_transportado_regular++;
            
        } else if(esAdulto(edad)){
            total_transportado_adulto++;
        }
        
        return r;
    }
    
public String subirPasajeros(Trayecto trayecto) {
        int entrantes = establecerEntrantes(pasajeros.size());
        
        for (int i = 0; i < entrantes; i++) { 
            Pasajero pasajero = new Pasajero();
            total_recaudado += establecerRecaudacion(pasajero.obtenerEdad(),trayecto);
            pasajeros.add(pasajero);
        }
        
        total_transportado += entrantes;
        return "Vagón" + getId() + ": " + entrantes + " - "; 
    } 
  private int establecerSentados(int cantidad){
        return (int) Math.floor((Math.random() * (maximo - cantidad) / 2));
    }
    
    public String sentarPasajeros() {
        int sentados = establecerSentados(pasajeros.size());
        return "Vagón" + getId() + ": " + sentados + " - "; 
    } 
}
