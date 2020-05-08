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
public class Deportivo extends Barco {

    private int potencia;
    private float precio;

    public Deportivo() {
    }

    public Deportivo(int potencia, int dias, float eslora, String matricula) {
        super(dias, eslora, matricula);
        this.potencia = potencia;

    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "potencia=" + potencia + ", precio=" + precio;
    }

    @Override
    public void calcularPrecio() {
        precio = 2 * potencia + 10 * super.getEslora() * super.getDias();
    }
}
