/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;
import java.util.Scanner;
/**
 *
 * @author ti
 */
public class RunCalculadora {
static Scanner sumObj = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operaciones op = new Operaciones();
        OperacionesAvanzadas opA = new OperacionesAvanzadas();
        System.out.println("Calculadora");
        System.out.println("Introduce el primer valor: ");
        double v1 = sumObj.nextDouble();
        System.out.println("Introduce el segundo valor: ");
        double v2 = sumObj.nextDouble();
        System.out.println("La suma de " + v1 + " + " + v2 + " es: " + op.suma(v1, v2));
        System.out.println("La resta de " + v1 + " - " + v2 + " es: " + op.resta(v1, v2));
        System.out.println("La division de " + v1 + " / " + v2 + " es: " + op.div(v1, v2));
        System.out.println("La multiplicacion de " + v1 + " * " + v2 + " es: " + op.multi(v1, v2));
        System.out.println("La raiz cuadrada del primer valor es: " + opA.raizA(v1));
        System.out.println("La raiz cuadrada del segundo valor es: " + opA.raizB(v2));
        System.out.println("La potencia de " + v1 + " elevada a la " + v2 + " es: " + opA.potencia(v1, v2));
    }
}
