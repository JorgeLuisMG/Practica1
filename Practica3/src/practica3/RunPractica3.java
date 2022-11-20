/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica3;
import java.util.Scanner;
/**
 *
 * @author ti
 */
public class RunPractica3 {
    static Scanner sumObj=new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        Telefono android=new Telefono();
        android.setMarca("Samsung");
        android.setModelo("Nueve");
        android.setColor("Azul");
        System.out.println("Telefono Marca: "+android.getMarca()+", Modelo: "+android.getModelo()+" , Color: "+android.getColor());                         
        System.out.println(android.encender());
        System.out.println(android.buscarContacto("Jorge"));
        System.out.println(android.hacerLlamada("Jorge")+", Numero: "+android.hacerLlamadaNum(818200));
        System.out.println(android.terminarLlamada());
        System.out.println("Introduce el primer valor: ");
        double v1=sumObj.nextDouble();
        System.out.println("Introduce el segundo calor: ");
        double v2=sumObj.nextDouble();
        System.out.println("La suma de "+v1+" + "+v2+" es: "+android.suma(v1,v2));
        System.out.println("La resta de "+v1+" - "+v2+" es: "+android.resta(v1,v2));
        System.out.println("La multiplicacion de "+v1+" * "+v2+" es: "+android.multi(v1,v2));
        System.out.println("La division de "+v1+" / "+v2+" es: "+android.div(v1,v2));
        Calculadora casio=new Calculadora();
        casio.setMarca("Casio");
        casio.setModelo("Pro");
        casio.setColor("Gris");
        System.out.println("Calculadora Marca: "+casio.getMarca()+", Modelo: "+casio.getModelo()+" , Color: "+casio.getColor());
        System.out.println("Introduce el primer valor: ");
        double v3=sumObj.nextDouble();
        System.out.println("Introduce el segundo calor: ");
        double v4=sumObj.nextDouble();
        System.out.println("La suma de "+v3+" + "+v4+" es: "+casio.suma(v3,v4));
        System.out.println("La resta de "+v3+" - "+v4+" es: "+android.resta(v3,v4));
        System.out.println("La multiplicacion de "+v3+" * "+v4+" es: "+android.multi(v3,v4));
        System.out.println("La division de "+v3+" / "+v4+" es: "+android.div(v3,v4));
        System.out.println("La raiz cuadrada del primer valor es: "+casio.raizA(v3));
        System.out.println("La raiz cuadrada del segundo valor es: "+casio.raizB(v4));
        System.out.println("La potencia de "+v1+" elevada a la "+v2+" es: "+casio.potencia(v3,v4));
    }
}
