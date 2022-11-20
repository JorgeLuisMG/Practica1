/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica5arreglos;

/**
 *
 * @author ti
 */
public class Automotor {
    public String getModelo() {
        return Modelo;
    }
    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }
    public String getMarca() {
        return Marca;
    }
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }
    public double getGas() {
        return gas;
    }
    public void setGas(double gas) {
        this.gas = gas;
    }
    private String Modelo;
    private String Marca;
    public double gas;
    public void acelerar(double gas) {
        gas-=1;
        System.out.println("Auto Acelerando, Gasolina - 1: " + gas);
    }
    public void frenar() {
        System.out.println("Auto Frenando");
        System.out.println("Auto Apagado");
    }
}
