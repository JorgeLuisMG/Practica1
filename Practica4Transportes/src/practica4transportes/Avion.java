/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4transportes;
import vehiculos.Vehiculo;
/**
 *
 * @author ti
 */
public class Avion extends Vehiculo {
    public Avion(){
        
    }
    public Avion(int gas){
        this.encenderAvion(gas);
        this.avanzaAvion(gas);
    }
    public Avion(double carga){
        this.encenderAvion(carga);
        this.avanzaAvion(carga);
    }
    private void encenderAvion(int gas){
        if(gas>30)
            System.out.println("Avion encendido");    
        else
            System.out.println("No hay suficiente gasolina");
    }
    private void avanzaAvion(int gas){
       if(gas>100&&gas<200)
            System.out.println("Bajo nivel de combustible");
        else
            System.out.println("No hay suficiente gasolina");
    }
    private void encenderAvion(double carga){
        if(carga>50)
            System.out.println("Avion encendido");
        else
            System.out.println("No hay suficiente carga electrica");
    }
    private void avanzaAvion(double carga){
       if(carga>500&&carga<700)
            System.out.println("Bajo nivel de carga electrica");
        else
            System.out.println("No hay suficiente carga electrica");
    }
}
