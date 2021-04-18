/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import constructores.ConstructorRecorrido;
import directores.Director;
import java.util.Scanner;
import recorridos.Dia;
import recorridos.Trayecto;

/**
 *
 * @author WIN
 */
public class Simulador {
    private static Simulador instancia; // Singleton
    
    private Simulador() { } 
    
    public static Simulador getInstance() {
        if (instancia == null) {
            instancia = new Simulador();
        }
        return instancia;
    }
    
    private static boolean validar(Trayecto trayecto, Dia dia){
        return trayecto != Trayecto.DEFAULT && dia != Dia.DEFAULT;
    }
    public void inicializar() throws InterruptedException {
        Dia dia = solicitarDia();
        Trayecto trayecto = solicitarRecorrido(); 
        
        if(validar(trayecto,dia)){
            construirRecorrido(dia, trayecto);
        } else {
            System.out.println("El recorrido ingresado es incorrecto.");
        }
    }
    public void construirRecorrido(Dia dia, Trayecto trayecto) throws InterruptedException {        
        ConstructorRecorrido builder = new ConstructorRecorrido(); // Builder
        
        new Director().construirRecorrido(builder,trayecto,dia);
        builder.getResult().iniciar();
    }
    
    private static Trayecto solicitarRecorrido(){
        System.out.println("RECORRIDOS: \n \t 1. Cartago - San José \n \t 2. San José - Cartago \n Ingrese una opcion:");
        int trayecto = Integer.parseInt(new Scanner(System.in).nextLine());
        switch (trayecto) {
            case 1:
                return Trayecto.CARTAGO_SANJOSE;
            case 2:
                return Trayecto.SANJOSE_CARTAGO;
            default:
                return Trayecto.DEFAULT;
        }
    }
    
    private static Dia solicitarDia(){
        System.out.println("DIA DE LA SEMANA: \n\t1. Lunes \n\t2. Martes \n\t3. Miercoles \n\t4. Jueves \n\t5. Viernes \n\t6. Sabado \n Ingrese una opcion:");
        int dia = Integer.parseInt(new Scanner(System.in).nextLine());
        
        switch (dia) {
            case 1:
                return Dia.LUNES;
            case 2:
                return Dia.MARTES;
            case 3:
                return Dia.MIERCOLES;
            case 4:
                return Dia.JUEVES;
            case 5:
                return Dia.VIERNES;
            case 6:
                return Dia.SABADO;
            default:
                return Dia.DEFAULT;
        }
    }
}
