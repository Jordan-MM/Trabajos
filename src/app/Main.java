/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author WIN
 */
//En el maain lo enlazamos con la parte del simulador
//Ejecuta o inicia el codigo
//throws soporta los errores
//tiene el proceso de la elaboracion del simulador
//este simulador usa el singleton
public class Main {
    public static void main(String[] args) throws InterruptedException{
    Simulador simulador = Simulador.getInstance();
    simulador.inicializar();
    }
}