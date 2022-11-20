package lib;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
public abstract class Calculadora {
    public abstract double suma(double a, double b);
    public double resta(double a, double b) {
        return a - b;
    }
    public double multi(double a, double b) {
        return a * b;
    }
    public double div(double a, double b) {
        return a / b;
    }
}
