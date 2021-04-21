/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;

import java.util.ArrayList;
import java.util.Iterator;
import recorridos.Trayecto;

/**
 *
 * @author WIN
 */
public class Tren {
    private final ArrayList<Vagon> vagones;
    
    public Tren() {
        vagones = new ArrayList<Vagon>();
        setVagones();
    } 
    //se inicializa los vagones de 1 a 4 o crean
    private void setVagones(){
        for (int i = 1; i < 5; i++) {
            vagones.add(new Vagon(i));
        }
    }
    //convierte la lista de vagones en iterator 
    public void desplazarPasajeros(Trayecto trayecto) {
        Iterator<Vagon> v = vagones.iterator();
        //el ejecuta las funcioes espcificas
        String ingreso = "Ingreso Pasajeros: " ;
        String bajantes = "Salen Pasajeros: ";
        String sentados = "Sentados Pasajeros: " ;
        //devuelve una cadena de string se va agregando los bajantes y subidos
        while (v.hasNext()) {
            Vagon vagon = v.next();
            bajantes += vagon.bajarPasajeros();
            ingreso += vagon.subirPasajeros(trayecto);
            sentados += vagon.sentarPasajeros();
        }
        //y se emprime los bajantes y etc
        System.out.println(bajantes + "\n" + ingreso + "\n" + sentados);
    }
    
    public void totalPasajeros() {
        Iterator<Vagon> vga = vagones.iterator();//lista vagones se convierte se recorrer
        String transportado = "\nTotal Pasajeros Transportados: ";
        String recaudado = "Total Recaudado: ";
        int tt = 0, tn = 0, tj = 0, tr = 0, ta = 0, rt = 0, rn = 0, rj = 0, rr = 0;//lista de variables
        
        while (vga.hasNext()) {//recoremos el codigo
            Vagon vagon = vga.next();
            tt += vagon.total_transportado;
            tn += vagon.total_transportado_ninos;
            tj += vagon.total_transportado_joven;
            tr += vagon.total_transportado_regular;
            ta += vagon.total_transportado_adulto;
            rt += vagon.total_recaudado;
            rn += vagon.total_recaudado_ninos;
            rj += vagon.total_recaudado_joven;
            rr += vagon.total_recaudado_regular;
        }
        //se utiliza vari t se usa tranportados y su concat cadena de string 
        String t = transportado.concat(tt + " (Niños "+tn+",").concat("Joven "+tj+",").concat("Regular "+tr+",").concat("Adulto Mayor "+ta+")");
        String r = recaudado.concat(rt + " colones (Niños "+rn+",").concat("Joven "+rj+",").concat("Regular "+rr+",").concat("Adulto Mayor 0)");
        System.out.println(t + "\n" + r);
        //se imprime t y se pone espacio
    }
}
