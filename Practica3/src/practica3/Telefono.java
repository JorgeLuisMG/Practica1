/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica3;

/**
 *
 * @author ti
 */
public class Telefono extends DispositivosElectronicos implements IOperacionesAritmeticas{
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo=modelo;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    private String marca;
    private String modelo;
    private String color;
    @Override
    public String encender(){
        return"Telefono Encendido";
    }
    public int hacerLlamadaNum(int num){
        return num;
    }
    public String hacerLlamada(String contacto){
        return"Llamando a "+contacto;
    }
    public String terminarLlamada(){
        return"Llamada terminada";
    }
    public String buscarContacto(String Contacto){
        return"Buscar contacto: Contacto "+Contacto+" encontrado";
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
}
