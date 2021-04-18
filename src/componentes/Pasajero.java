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
public class Pasajero {
    private int edad;
    
    public Pasajero() { 
        this.edad = establecerEdad();
    } 
    
    public int obtenerEdad(){
        return edad;
    }
    
    private int establecerEdad(){
        return (int) Math.floor((Math.random()* 90) + 1);
    }
}
