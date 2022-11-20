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
public class Automovil extends Vehiculo{
    public Automovil(){
        
    }
    public Automovil(int gas){
        this.encenderAutomovil(gas);
        this.avanzaAutomovil(gas);
    }
    public Automovil(double carga){
        this.encenderAutomovil(carga);
        this.avanzaAutomovil(carga);
    }
    private void encenderAutomovil(int gas){
        if(gas>1)
            System.out.println("Automovil encendido");
        else
            System.out.println("No hay suficiente gasolina");
    }
    private void avanzaAutomovil(int gas){
       if(gas>1&&gas<10)
            System.out.println("Bajo nivel de combustible");
        else
            System.out.println("No hay suficiente gasolina");
    }
    private void encenderAutomovil(double carga){
        if(carga>10)
            System.out.println("Automovil encendido");
        else
            System.out.println("No hay suficiente carga electrica");
    }
    private void avanzaAutomovil(double carga){
       if(carga>10&&carga<20)
            System.out.println("Bajo nivel de carga electrica");
        else
            System.out.println("No hay suficiente carga electrica");
    }
}
