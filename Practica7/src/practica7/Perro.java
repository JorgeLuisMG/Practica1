/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica7;

/**
 *
 * @author ti
 */
public class Perro extends Animal {
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    private String color;
    public String ladrar() {
        return "Perro ladrando";
    }
    public Perro() {
        
    }
    public Perro(String comida) {
        this.comer(comida);
    }
    private void comer(String comida) {
        System.out.println("Recibiendo " + comida);
    }
    @Override
    public String caminar(double caminar) {
        return "Perro camina: " + caminar;
    }
}
