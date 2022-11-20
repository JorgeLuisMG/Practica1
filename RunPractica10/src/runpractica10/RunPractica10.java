/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package runpractica10;

/**
 *
 * @author Dell
 */
public class RunPractica10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CalculadorEstandar casio = new CalculadorEstandar();
        System.out.println("El resultado de la suma es: " + casio.suma(10, 12));
        System.out.println("El resultado de la resta es: " + casio.resta(9, 3));
        System.out.println("El resultado de la multiplicacion es: " + casio.multi(10, 4));
        System.out.println("El resultado de la division es: " + casio.div(9, 3));
    }
}
