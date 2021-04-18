/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;

/**
 *
 * @author WIN
 */
public class Estacion {
    private final String nombre;   
    private final String hora; 
    
    public Estacion(String n, String h) {
        nombre = n;
        hora = h;
    } 
    public String getNombre(){
        return (String) nombre;
    }
    
    public String getHora(){
        return (String) hora;
    }
@Override
    public String toString(){
        return "Estacion: " + getNombre() + " - " + getHora();
    }
}
