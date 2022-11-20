/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica7;

/**
 *
 * @author ti
 */
public class Cocodrilo extends Animal {
    public double getLargo() {
        return largo;
    }
    public void setLargo(double largo) {
        this.largo = largo;
    }
    private double largo;
    public String gruñido() {
        return "Cocodrilo gruñendo";
    }
    public Cocodrilo() {
        
    }
    public Cocodrilo(String comida) {
        this.comer(comida);
    }
    private void comer(String comida) {
        System.out.println("Recibiendo " + comida);
    }
    @Override
    public String caminar(double caminar) {
        return "Cocodrilo camina: " + caminar;
    }
}
