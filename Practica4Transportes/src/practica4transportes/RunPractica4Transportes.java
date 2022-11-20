/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica4transportes;
import java.util.Scanner;
/**
 *
 * @author ti
 */
public class RunPractica4Transportes {
    static Scanner Obj=new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // PARA EL AUTOMOVIL
        System.out.println("Introduce la gasolina del automovil: ");
        int v1=Obj.nextInt();
        System.out.println("Introduce la carga electrica del automovil: ");
        double v2=Obj.nextDouble();
        Automovil ford=new Automovil(v1);
        Automovil fordE=new Automovil((double)v2);
        ford.setMarca("Ford");
        ford.setModelo("2020");
        ford.setColor("Negro");
        System.out.println("Automovil Marca: "+ford.getMarca()+", Modelo: "+ford.getModelo()+", Color: "+ford.getColor());
        // PARA EL AVION
        System.out.println("\nIntroduce la gasolina del avion: ");
        int v3=Obj.nextInt();
        System.out.println("Introduce la carga electrica del avion: ");
        double v4=Obj.nextDouble();
        Avion plane=new Avion(v3);
        Avion planeE=new Avion((double)v4);
        plane.setMarca("Airbus");
        plane.setModelo("Privado");
        plane.setColor("Blanco");
        System.out.println("Avion Marca: "+plane.getMarca()+", Modelo: "+plane.getModelo()+", Color: "+plane.getColor());
        // PARA EL TREN
        System.out.println("\nIntroduce la gasolina del tren: ");
        int v5=Obj.nextInt();
        System.out.println("Introduce la carga electrica del tren: ");
        double v6=Obj.nextDouble();
        Tren bala=new Tren(v5);
        Tren baleE=new Tren((double)v6);
        bala.setMarca("Road");
        bala.setModelo("Bala");
        bala.setColor("Gris");
        System.out.println("Tren Marca: "+bala.getMarca()+", Modelo: "+bala.getModelo()+", Color: "+bala.getColor());
    }
    
}
