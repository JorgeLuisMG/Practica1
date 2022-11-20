/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora1;
import java.util.Scanner;
/**
 *
 * @author ti
 */
public class RunCalculadora1 {
static Scanner sumObj=new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora1 casio=new Calculadora1();
        CalculadoraCientifica casioC=new CalculadoraCientifica();
        System.out.println("Calculadora");
        System.out.println("Introduce el primer valor: ");
        double v1=sumObj.nextDouble();
        System.out.println("Introduce el segundo calor: ");
        double v2=sumObj.nextDouble();
        System.out.println("Clase Calculadora");
        System.out.println("La suma de " + v1 + " + " + v2 + " es: " + casio.suma(v1,v2));
        System.out.println("La resta de " + v1 + " - " + v2 + " es: " + casio.resta(v1,v2));
        System.out.println("La multiplicacion de " + v1 + " * " + v2 + " es: " + casio.multi(v1,v2));
        System.out.println("La division de " + v1 + " / " + v2 + " es: " + casio.div(v1,v2));
        System.out.println("Clase Calculadora Cientifica");
        System.out.println("La suma de " + v1 + " + " + v2 + " es: " + casioC.suma(v1,v2));
        System.out.println("La resta de " + v1 + " - " + v2 + " es: " + casioC.resta(v1,v2));
        System.out.println("La multiplicacion de " + v1 + " * " + v2 + " es: " + casioC.multi(v1,v2));
        System.out.println("La division de " + v1 + " / " + v2 + " es: " + casioC.div(v1,v2));
        System.out.println("La raiz cuadrada del primer valor es: " + casioC.raizA(v1));
        System.out.println("La raiz cuadrada del segundo valor es: " + casioC.raizB(v2));
        System.out.println("La potencia de " + v1 + " elevada a la " + v2 + " es: " + casioC.potencia(v1,v2));
    }
}
