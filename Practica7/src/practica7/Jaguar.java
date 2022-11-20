/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica7;

/**
 *
 * @author ti
 */
public class Jaguar extends Animal {
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    private double peso;
    public String Rugido() {
        return "Juguar rugiendo";
    }
    public Jaguar() {
        
    }
    public Jaguar(String comida) {
        this.comer(comida);
    }
    private void comer(String comida) {
        System.out.println("Recibiendo " + comida);
    }
    @Override
    public String caminar(double caminar) {
        return "Jaguar camina: " + caminar;
    }
}
