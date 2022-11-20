/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica9;

/**
 *
 * @author Dell
 */
public class Staff extends Person {
    public Staff() {
        
    }
    public Staff(String name, String address, String school, double pay) {
        this.school = school;
        this.pay = pay;
    }
    public String getSchool() {
        return school;
    }
    public void setSchool(String school) {
        this.school = school;
    }
    public double getPay() {
        return pay;
    }
    public void setPay(double pay) {
        this.pay = pay;
    }
    private String school;
    private double pay;
    @Override
    public String toString() {
        return "\nPerson: " + super.getName() + ", " + super.getAddress() + ", " + school + ", " + pay + "\n";
    }
}
