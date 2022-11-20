/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica7;

/**
 *
 * @author ti
 */
public class Gorrion extends Animal {
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    private String raza;
    public String silbido() {
        return "Gorrion silbando";
    }
    public Gorrion() {
        
    }
    public Gorrion(String comida) {
        this.comer(comida);
    }
    private void comer(String comida) {
        System.out.println("Recibiendo " + comida);
    }
    @Override
    public String caminar(double caminar) {
        return "Gorrion vuela: " + caminar;
    }
}
