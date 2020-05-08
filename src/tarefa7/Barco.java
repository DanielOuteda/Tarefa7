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
public abstract class Barco {

    private int dias;
    private float eslora;
    private String matricula;

    public Barco() {
    }

    public Barco(int dias, float eslora, String matricula) {
        this.dias = dias;
        this.eslora = eslora;
        this.matricula = matricula;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public float getEslora() {
        return eslora;
    }

    public void setEslora(float eslora) {
        this.eslora = eslora;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Eslora=" + eslora + ", dias=" + dias + ", matricula=" + matricula;
    }

    public abstract void calcularPrecio();
}
