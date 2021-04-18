/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

import recorridos.Dia;
import recorridos.Horario;
import recorridos.Trayecto;

/**
 *
 * @author WIN
 */
// para saber que override ereda de patre
public class ConstructorHorario implements BaseHorario  {
    private Dia dia;
    private Trayecto trayecto;

    public Horario getResult() {
        return new Horario(trayecto, dia);
    }
    
    @Override
    public void setTrayecto(Trayecto trayecto) {
        this.trayecto = trayecto;
    }

    @Override
    public void setDia(Dia dia) {
        this.dia = dia;
    }
}
