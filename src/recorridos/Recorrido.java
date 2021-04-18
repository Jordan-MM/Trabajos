/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recorridos;

import componentes.Estacion;
import componentes.Tren;
import java.util.Iterator;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author WIN
 */
public class Recorrido {
    
    private final Trayecto trayecto;   
    private final Dia dia; 
    private final Tren tren;
    private final Horario horario;
    
    public Recorrido(Trayecto trayecto, Dia dia, Tren tren, Horario horario) {
        this.trayecto = trayecto;
        this.dia = dia;
        this.tren = tren;
        this.horario = horario;
    }

    public Trayecto getTrayecto() {
        return trayecto;
    }

    public Dia getDia() {
        return dia;
    }

    public Tren getTren() {
        return tren;
    }
    
    private void esperar() throws InterruptedException {
        Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));      
    }

    public void iniciar() throws InterruptedException {
        System.out.println("\n" + toString() + "\n");
        
        Iterator<Estacion> e = getHorario().getEstaciones().iterator();
        
        while (e.hasNext()) {
            System.out.println("\n" + e.next().toString()); // Muestra Informacion Estacion
            esperar();
            tren.desplazarPasajeros(getTrayecto());
        }
        
        tren.totalPasajeros();
    }
    
    @Override
    public String toString(){
        return "Trayecto: " + getTrayecto() + " - " + getDia();
    }

    public Horario getHorario() {
        return horario;
    }
}