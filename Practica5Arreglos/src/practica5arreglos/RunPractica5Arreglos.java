/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica5arreglos;
import java.util.Scanner;
/**
 *
 * @author ti
 */
public class RunPractica5Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        Scanner myObj = new Scanner(System.in);
        Automovil[] audi = new Automovil[5];
        for (i = 0; i < audi.length; i++) {
            audi[i] = new Automovil();
            System.out.println("Introduce la gasolina " + Integer.toString(i+1) + ": ");
            double gas = myObj.nextDouble();
            myObj.nextLine();
            System.out.println("Introduce la marca " + Integer.toString(i+1) + ": ");
            String marca = myObj.nextLine();
            System.out.println("Introduce el modelo " + Integer.toString(i+1) + ": ");
            String modelo = myObj.nextLine();
            System.out.println("Introduce el color " + Integer.toString(i+1) + ": ");
            String color = myObj.nextLine();
            System.out.println("Introduce el precio " + Integer.toString(i+1) + ": ");
            double precio = myObj.nextDouble();
            audi[i] = new Automovil(gas);
            audi[i].setGas(gas);
            audi[i].setMarca(marca);
            audi[i].setModelo(modelo);
            audi[i].setColor(color);
            audi[i].setPrecio(precio);
        }
        i=1;
        for (Automovil auto: audi) {
            System.out.println("----- Datos del Automovil " + i +" -----");
            System.out.println("Gasolina: " + auto.getGas());
            System.out.println("Marca: " + auto.getMarca());
            System.out.println("Modelo: " + auto.getModelo());
            System.out.println("Color: " + auto.getModelo());
            System.out.println("Precio: " + auto.getPrecio());
            i++;
        }
    }
}
