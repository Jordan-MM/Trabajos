/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

import componentes.Tren;
import recorridos.Dia;
import recorridos.Trayecto;
import recorridos.Horario;

//lista de los metodos los atrae utilizen la interfaces estos son los que es van a usar
//metodo que se utiliza para definir el conportamiento para usar por difresntes clases
//interfaces para encapsular los procedimientos y codigo y solo monstras lo que se necesita
public interface BaseRecorrido {
    void setTrayecto(Trayecto trayecto); 
    void setDia(Dia dia); 
    void setHorario(Horario horario);    
    void setTren(Tren tren);
}

