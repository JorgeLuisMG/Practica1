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
public class Tren extends Vehiculo{
    public Tren(){
        
    }
    public Tren(int gas){
        this.encenderTren(gas);
        this.avanzaTren(gas);
    }
    public Tren(double carga){
        this.encenderTren(carga);
        this.avanzaTren(carga);
    }
    private void encenderTren(int gas){
        if(gas>50)
            System.out.println("Tren encendido");
        else
            System.out.println("No hay suficiente gasolina");
    }
    private void avanzaTren(int gas){
       if(gas>200&&gas<300)
            System.out.println("Bajo nivel de combustible");
        else
            System.out.println("No hay suficiente gasolina");
    }
    private void encenderTren(double carga){
        if(carga>70)
            System.out.println("Tren encendido");
        else
            System.out.println("No hay suficiente carga electrica");
    }
    private void avanzaTren(double carga){
       if(carga>900&&carga<1000)
            System.out.println("Bajo nivel de carga electrica");
        else
            System.out.println("No hay suficiente carga electrica");
    }
}
