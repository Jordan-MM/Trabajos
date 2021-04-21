/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package directores;

import componentes.Tren;
import constructores.BaseRecorrido;
import recorridos.Dia;
import recorridos.Horario;
import recorridos.Trayecto;

/**
 *
 * @author WIN
 */
//es la clase de destribuir el trabajo
public class Director {
    //necsita el builder las base recoriido es la interface de recorrido y utiliza los metodos dia 
    //solo llamos al 
    //para crear el trayecto necesita builder,trayecto y dia
    //el builder que atrrae es un interfaces el director no sabe lo que trae pero si sabe que tiene
    public void construirRecorrido(BaseRecorrido builder, Trayecto trayecto, Dia dia) {
        builder.setDia(dia);//asigna el dia
        builder.setTrayecto(trayecto);
        builder.setTren(new Tren());  
        builder.setHorario(new Horario(trayecto, dia));
    }
}