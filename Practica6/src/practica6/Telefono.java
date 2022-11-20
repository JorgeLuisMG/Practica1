/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica6;

/**
 *
 * @author ti
 */
public class Telefono extends ComponenteElectronico implements IOtrosComponentesE {
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    private String color;
    private double precio;
    private int year;
    @Override
    public String encender() {
        return "Telefono Encendido";
    }
    @Override
    public String apagar() {
        return "Telefono Apagado";
    }
}
