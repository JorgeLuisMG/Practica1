/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica5arreglos;

/**
 *
 * @author ti
 */
public class Automovil extends Automotor {
    public Automovil() {
        
    }
    public Automovil(double gas) {
        this.avanzaAutomovil(gas);
        this.acelerar(gas);
        this.avanzaDerecha(gas);
        this.avanzaIzquierda(gas);
        this.frenar();
    }
    public String getColor() {
        return Color;
    }
    public void setColor(String Color) {
        this.Color = Color;
    }
    public double getPrecio() {
        return Precio;
    }
    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }
    private String Color;
    private double Precio;
    public void avanzaAutomovil(double gas) {
        if (gas > 1) {
            System.out.println("Auto Encendido");
            System.out.println("Auto Avanzando");
        }
    }
    public void avanzaDerecha(double gas) {
        gas-=2;
        System.out.println("Auto Avanza Derecha, Gasolina - 1: " + gas);
    }
    public void avanzaIzquierda(double gas) {
        gas-=3;
        System.out.println("Auto Avanza Izquierda, Gasolina - 1: " + gas);
    }
}
