/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica3;

/**
 *
 * @author ti
 */
public class Calculadora extends DispositivosElectronicos implements IOperacionesAritmeticas{
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo=modelo;
    }
    private String modelo;
    @Override
    public String encender(){
        return"Calculadora Encendido";
    }
    @Override
    public double suma(double a,double b){
        return a+b;
    }
    @Override
    public double resta(double a,double b){
        return a-b;
    }
    @Override
    public double multi(double a,double b){
        return a*b;
    }
    @Override
    public double div(double a,double b){
        return a/b;
    }
    public double raizA(double a){
        return Math.sqrt(a);
    }
    public double raizB(double b){
        return Math.sqrt(b);
    }
    public double potencia(double a,double b){
        return Math.pow(a,b);
    }
}
