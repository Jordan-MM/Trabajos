/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

import componentes.Tren;
import recorridos.Dia;
import recorridos.Horario;
import recorridos.Recorrido;
import recorridos.Trayecto;

/**
 *
 * @author WIN
 */
//implementa la base recorrido y hay una reacion con baserecorrido
public class ConstructorRecorrido implements BaseRecorrido {
    private Trayecto trayecto;   
    private Dia dia; 
    private Tren tren;   
    private Horario horario;
    //lammaos las variables y las modificamos
    @Override
    public void setTrayecto(Trayecto trayecto) {
        this.trayecto = trayecto;
    }

    @Override
    public void setDia(Dia dia) {
        this.dia = dia;
    }

    @Override
    public void setTren(Tren tren) {
        this.tren = tren;
    }

    @Override
    public void setHorario(Horario horario) {
        this.horario = horario;
    }   
  //el constructor tiene gerresult que obtenemos el recorrido que tenemos ahora
    public Recorrido getResult() {
        return new Recorrido(trayecto, dia, tren, horario);
    }
} 

