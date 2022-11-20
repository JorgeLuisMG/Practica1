/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica6;

/**
 *
 * @author ti
 */
public class Computadora extends ComponenteElectronico implements IOtrosComponentesE {
    public int getPantalla() {
        return pantalla;
    }
    public void setPantalla(int pantalla) {
        this.pantalla = pantalla;
    }
    public String getMemoria() {
        return memoria;
    }
    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }
    public String getProcesador() {
        return procesador;
    }
    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
    private int pantalla;
    private String memoria;
    private String procesador;
    @Override
    public String encender() {
        return "Computadora Encendida";
    }
    @Override
    public String apagar() {
        return "Computadora Apagada";
    }
}
