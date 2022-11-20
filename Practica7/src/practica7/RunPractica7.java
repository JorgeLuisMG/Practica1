/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica7;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author ti
 */
public class RunPractica7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myObj = new Scanner(System.in);
        double sum = 0;
        // PARA EL GATO
        ArrayList<Gato> gt = new ArrayList<Gato>();
        Gato gt1 = new Gato();
        gt.add(gt1);
        System.out.println("Introduce la edad del gato: ");
        int edad = myObj.nextInt();
        myObj.nextLine();
        System.out.println("Introduce el nombre del gato: ");
        String nombre = myObj.nextLine();
        System.out.println("Introduce cuantos metros camino el gato: ");
        double caminar = myObj.nextDouble();
        myObj.nextLine();
        sum += caminar;
        System.out.println("Introduce la raza del gato: ");
        String raza = myObj.nextLine();
        System.out.println("Introduce la comida del gato: ");
        String comida = myObj.nextLine();
        gt1.setEdad(edad);
        gt1.setNombre(nombre);
        gt1.setRaza(raza);
        for (Gato o:gt) {
            System.out.println("\n----- Datos del Gato -----");
            System.out.println("Edad: " + o.getEdad());
            System.out.println("Nombre: " + o.getNombre());
            System.out.println(o.caminar(caminar));
            System.out.println("Raza: " + o.getRaza());
            System.out.println(o.maullar());
            Gato gt11 = new Gato(comida);
        }
        // PARA EL PERRO
        ArrayList<Perro> pr = new ArrayList<Perro>();
        Perro pr1 = new Perro();
        pr.add(pr1);
        System.out.println("Introduce la edad del perro: ");
        int edadP = myObj.nextInt();
        myObj.nextLine();
        System.out.println("Introduce el nombre del perro: ");
        String nombreP = myObj.nextLine();
        System.out.println("Introduce cuantos metros camino el perro: ");
        double caminarP = myObj.nextDouble();
        myObj.nextLine();
        sum += caminarP;
        System.out.println("Introduce el color del perro: ");
        String color = myObj.nextLine();
        System.out.println("Introduce la comida del perro: ");
        String comidaP = myObj.nextLine();
        pr1.setEdad(edadP);
        pr1.setNombre(nombreP);
        pr1.setColor(color);
        for (Perro o:pr) {
            System.out.println("\n----- Datos del Perro -----");
            System.out.println("Edad: " + o.getEdad());
            System.out.println("Nombre: " + o.getNombre());
            System.out.println(o.caminar(caminarP));
            System.out.println("Color: " + o.getColor());
            System.out.println(o.ladrar());
            Perro pr11 = new Perro(comidaP);
        }
        // PARA EL GORRION
        ArrayList<Gorrion> grn = new ArrayList<Gorrion>();
        Gorrion grn1 = new Gorrion();
        grn.add(grn1);
        System.out.println("Introduce la edad del gorrion: ");
        int edadG = myObj.nextInt();
        myObj.nextLine();
        System.out.println("Introduce el nombre del gorrion: ");
        String nombreG = myObj.nextLine();
        System.out.println("Introduce cuantos metros volo el gorrion: ");
        double caminarG = myObj.nextDouble();
        myObj.nextLine();
        sum += caminarG;
        System.out.println("Introduce la raza del gorrion: ");
        String razaG = myObj.nextLine();
        System.out.println("Introduce la comida del gorrion: ");
        String comidaG = myObj.nextLine();
        grn1.setEdad(edadG);
        grn1.setNombre(nombreG);
        grn1.setRaza(razaG);
        for (Gorrion o:grn) {
            System.out.println("\n----- Datos del Gorrion -----");
            System.out.println("Edad: " + o.getEdad());
            System.out.println("Nombre: " + o.getNombre());
            System.out.println(o.caminar(caminarG));
            System.out.println("Raza: " + o.getRaza());
            System.out.println(o.silbido());
            Gorrion grn11 = new Gorrion(comidaG);
        }
        // PARA EL COCODRILO
        ArrayList<Cocodrilo> cc = new ArrayList<Cocodrilo>();
        Cocodrilo cc1 = new Cocodrilo();
        cc.add(cc1);
        System.out.println("Introduce la edad del cocodrilo: ");
        int edadC = myObj.nextInt();
        myObj.nextLine();
        System.out.println("Introduce el nombre del cocodrilo: ");
        String nombreC = myObj.nextLine();
        System.out.println("Introduce cuantos metros camino el cocodrilo: ");
        double caminarC = myObj.nextDouble();
        myObj.nextLine();
        sum += caminarC;
        System.out.println("Introduce el largo del cocodrilo: ");
        double largo = myObj.nextDouble();
        myObj.nextLine();
        System.out.println("Introduce la comida del cocodrilo: ");
        String comidaC = myObj.nextLine();
        cc1.setEdad(edadC);
        cc1.setNombre(nombreC);
        cc1.setLargo(largo);
        for (Cocodrilo o:cc) {
            System.out.println("\n----- Datos del Cocodrilo -----");
            System.out.println("Edad: " + o.getEdad());
            System.out.println("Nombre: " + o.getNombre());
            System.out.println(o.caminar(caminarC));
            System.out.println("Largo: " + o.getLargo() + " m");
            System.out.println(o.gruñido());
            Cocodrilo cc11 = new Cocodrilo(comidaC);
        }
        // PARA EL JAGUAR
        ArrayList<Jaguar> jg = new ArrayList<Jaguar>();
        Jaguar jg1 = new Jaguar();
        jg.add(jg1);
        System.out.println("Introduce la edad del jaguar: ");
        int edadJ = myObj.nextInt();
        myObj.nextLine();
        System.out.println("Introduce el nombre del Jaguar: ");
        String nombreJ = myObj.nextLine();
        System.out.println("Introduce cuantos metros camino el jaguar: ");
        double caminarJ = myObj.nextDouble();
        myObj.nextLine();
        sum += caminarJ;
        System.out.println("Introduce el peso del jaguar: ");
        double peso = myObj.nextDouble();
        myObj.nextLine();
        System.out.println("Introduce la comida del jaguar: ");
        String comidaJ = myObj.nextLine();
        jg1.setEdad(edadJ);
        jg1.setNombre(nombreJ);
        jg1.setPeso(peso);
        for (Jaguar o:jg) {
            System.out.println("\n----- Datos del Jaguar -----");
            System.out.println("Edad: " + o.getEdad());
            System.out.println("Nombre: " + o.getNombre());
            System.out.println(o.caminar(caminarJ));
            System.out.println("Peso: " + o.getPeso() + " kg");
            System.out.println(o.Rugido());
            Jaguar jg11 = new Jaguar(comidaJ);
        }
        // PARA SACAR EL PROMEDIO
        double prom = sum / 5;
        System.out.println("\nPromedio de lo caminado por todos los animales: " + prom);
    }
}
