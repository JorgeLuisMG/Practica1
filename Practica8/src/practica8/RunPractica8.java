/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica8;
import java.io.File;
/**
 *
 * @author ti
 */
public class RunPractica8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File fl = new File("C:\\Users\\ti\\Documents\\file.txt");
        String fileN = "C:\\Users\\ti\\Documents\\file.txt";
        fl.exists();
        Utils fw = new Utils(fileN);
    }
}
