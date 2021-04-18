/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package directores;

import componentes.Tren;
import constructores.BaseHorario;
import constructores.BaseRecorrido;
import constructores.ConstructorHorario;
import recorridos.Dia;
import recorridos.Trayecto;

/**
 *
 * @author WIN
 */
//es la clase de destribuir el trabajo
public class Director {
    //necsita el builder las base recoriido es la interface de recorrido y utiliza los metodos dia 
    //
    public void construirRecorrido(BaseRecorrido builder, Trayecto trayecto, Dia dia) {
        builder.setDia(dia);
        builder.setTrayecto(trayecto);
        builder.setTren(new Tren());  
        //
        ConstructorHorario builderHorario = new ConstructorHorario();
        construirHorario(builderHorario,trayecto,dia);
        
        builder.setHorario(builderHorario.getResult());
    }
    
    public void construirHorario(BaseHorario builder, Trayecto trayecto, Dia dia) {
        builder.setDia(dia);
        builder.setTrayecto(trayecto);
    }
}