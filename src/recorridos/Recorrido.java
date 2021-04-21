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
    //tiene parametros y constructores
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
    
    private void esperar() throws InterruptedException {//tomarse tiempo
        Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));      
    }
//imprime en pantalla la funcion to string escribe los detalles 
    public void iniciar() throws InterruptedException {
        System.out.println("\n" + toString() + "\n");
        
        Iterator<Estacion> e = getHorario().getEstaciones().iterator();
        //iterator los devueve la lista y lo guardamos en e
        while (e.hasNext()) {
            System.out.println("\n" + e.next().toString()); // Muestra Informacion Estacion
            esperar();//
            tren.desplazarPasajeros(getTrayecto());
        }//el tren se encarga del desplazamiento subir bajar y monstarlos 
        
        tren.totalPasajeros();//nos permite recoger la informcaion se han subido
    }
    
    @Override
    public String toString(){
        return "Trayecto: " + getTrayecto() + " - " + getDia();
    }

    public Horario getHorario() {
        return horario;
    }
}