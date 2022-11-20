/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica8;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author ti
 */
public class Utils {
    public Utils(String fileN) {
        this.wfiles(fileN);
    }
    private void wfiles(String fileN) {
        try {
            FileWriter fw = new FileWriter(fileN);
            Scanner myObj = new Scanner(System.in);
            System.out.print("Introduce texto: ");
            String texto = myObj.nextLine();
            fw.write(texto);
            fw.close();
            FileReader fr = new FileReader(fileN);
            fr.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            
        }
    }
}
