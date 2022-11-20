/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora1;

/**
 *
 * @author ti
 */
public class CalculadoraCientifica {
    public double suma(double a,double b) {
        return a+b;
    }
    public double resta(double a,double b) {
        return a-b;
    }
    public double multi(double a,double b) {
        return a*b;
    }
    public double div(double a,double b) {
        return a/b;
    }
    public double raizA(double a) {
        return Math.sqrt(a);
    }
    public double raizB(double b) {
        return Math.sqrt(b);
    }
    public double potencia(double a,double b) {
        return Math.pow(a,b);
    }
}
