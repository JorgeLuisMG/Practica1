/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica9;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Dell
 */
public class RunPractica9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myObj = new Scanner(System.in);
        // PARA LOS DATOS DE PERSONA
        ArrayList<Person> pe = new ArrayList<Person>();
        Person pe1 = new Person();
        pe.add(pe1);
        System.out.println("Introduce el nombre de la persona: ");
        String persona = myObj.nextLine();
        System.out.println("Introduce el address de la persona: ");
        String add = myObj.nextLine();
        pe1.setName(persona);
        pe1.setAddress(add);
        for (Person o:pe) {
            System.out.println(o.toString());
        }
        // PARA LOS DATOS DE ESTUDIANTE
        ArrayList<Student> st = new ArrayList<Student>();
        Student st1 = new Student();
        st.add(st1);
        System.out.println("Introduce el programa del estudiante: ");
        String program = myObj.nextLine();
        System.out.println("Introduce el año del estudiante: ");
        int año = myObj.nextInt();
        myObj.nextLine();
        System.out.println("Introduce la tarifa del estudiante: ");
        double fee = myObj.nextDouble();
        myObj.nextLine();
        st1.setName(persona);
        st1.setAddress(add);
        st1.setProgram(program);
        st1.setYear(año);
        st1.setFee(fee);
        for (Student o:st) {
            System.out.println(o.toString());
        }
        // PARA LOS DATOS DE ESTUDIANTE
        ArrayList<Staff> sff = new ArrayList<Staff>();
        Staff sff1 = new Staff();
        sff.add(sff1);
        System.out.println("Introduce la escula del staff: ");
        String escuela = myObj.nextLine();
        System.out.println("Introduce el pago del staff: ");
        double pago = myObj.nextDouble();
        myObj.nextLine();
        sff1.setName(persona);
        sff1.setAddress(add);
        sff1.setSchool(escuela);
        sff1.setPay(pago);
        for (Staff o:sff) {
            System.out.println(o.toString());
        }
    }
}
