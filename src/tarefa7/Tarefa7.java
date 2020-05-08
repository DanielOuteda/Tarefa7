/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa7;

import java.util.ArrayList;

/**
 *
 * @author Usaurio
 */
public class Tarefa7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Barco> listaBarco = new ArrayList<>();

        Yate yate1 = new Yate(1000, 25, 15, 50, "YateA1");
        Deportivo deport1 = new Deportivo(1000, 10, 20, "DeportA2");
        Velero velero1 = new Velero(5, 7, 35, "VeleroA3");

        yate1.calcularPrecio();
        deport1.calcularPrecio();
        velero1.calcularPrecio();

        listaBarco.add(yate1);
        listaBarco.add(deport1);
        listaBarco.add(velero1);

        for (int i = 0; i < listaBarco.size(); i++) {
            System.out.println(listaBarco.get(i).toString());
        }

    }

}
