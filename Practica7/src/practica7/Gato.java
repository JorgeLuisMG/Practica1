/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica7;

/**
 *
 * @author ti
 */
public class Gato extends Animal {
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    private String raza;
    public String maullar() {
        return "Gato maullando";
    }
    public Gato() {
        
    }
    public Gato(String comida) {
        this.comer(comida);
    }
    private void comer(String comida) {
        System.out.println("Recibiendo " + comida);
    }
    @Override
    public String caminar(double caminar) {
        return "Gato camina: " + caminar;
    }
}
