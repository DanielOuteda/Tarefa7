/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa7;

/**
 *
 * @author Usaurio
 */
public class Velero extends Barco {

    private int numMastiles;
    private float precio;

    public Velero() {
    }

    public Velero(int mastiles, int dias, float eslora, String matricula) {
        super(dias, eslora, matricula);
        this.numMastiles = mastiles;
    }

    public int getNumMastiles() {
        return numMastiles;
    }

    public void setNumMastiles(int numMastiles) {
        this.numMastiles = numMastiles;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public void calcularPrecio() {
        precio = 8 * numMastiles + 10 * super.getEslora() * super.getDias();
    }

    @Override
    public String toString() {
        return "numMastiles=" + numMastiles + ", precio=" + precio;
    }

}
