/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica6;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author ti
 */
public class RunPractica6 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myObj = new Scanner(System.in);
        // PARA LA COMPUTADORA
        ArrayList<Computadora> cp = new ArrayList<Computadora>();
        Computadora cp1 = new Computadora();
        cp.add(cp1);
        System.out.println("Introduce la marca de la computadora: ");
        String marca = myObj.nextLine();
        System.out.println("Introduce el modelo de la computadora: ");
        String modelo = myObj.nextLine();
        System.out.println("Introduce el tamaño de la pantalla de la computadora: ");
        int pantalla = myObj.nextInt();
        myObj.nextLine();
        System.out.println("Introduce la memoria de la computadora: ");
        String memoria = myObj.nextLine();
        System.out.println("Introduce el procesador de la computadora: ");
        String procesador = myObj.nextLine();
        cp1.setMarca(marca);
        cp1.setModelo(modelo);
        cp1.setPantalla(pantalla);
        cp1.setMemoria(memoria);
        cp1.setProcesador(procesador);
        for (Computadora o:cp) {
            System.out.println("\n----- Datos de la Computadora -----");
            System.out.println("Marca: " + o.getMarca());
            System.out.println("Modelo: " + o.getModelo());
            System.out.println("Tamaño de la pantalla: " + o.getPantalla());
            System.out.println("Memoria: " + o.getMemoria());
            System.out.println("Procesador: " + o.getProcesador());
            System.out.println(o.encender());
            System.out.println(o.apagar());
        }
        // PARA EL TELEFONO
        ArrayList<Telefono> tl = new ArrayList<Telefono>();
        Telefono tl1 = new Telefono();
        tl.add(tl1);
        System.out.println("\nIntroduce la marca del telefono: ");
        String marcaT = myObj.nextLine();
        System.out.println("Introduce el modelo del telefono: ");
        String modeloT = myObj.nextLine();
        System.out.println("Introduce el color del telefono: ");
        String color = myObj.nextLine();
        System.out.println("Introduce el precio del telefono: ");
        double precio = myObj.nextDouble();
        myObj.nextLine();
        System.out.println("Introduce el año del telefono: ");
        int year = myObj.nextInt();
        myObj.nextLine();
        tl1.setMarca(marcaT);
        tl1.setModelo(modeloT);
        tl1.setColor(color);
        tl1.setPrecio(precio);
        tl1.setYear(year);
        for (Telefono o:tl) {
            System.out.println("\n----- Datos del Telefono -----");
            System.out.println("Marca: " + o.getMarca());
            System.out.println("Modelo: " + o.getModelo());
            System.out.println("Color: " + o.getColor());
            System.out.println("Precio: " + o.getPrecio());
            System.out.println("Año: " + o.getYear());
            System.out.println(o.encender());
            System.out.println(o.apagar());
        }
    }
}
