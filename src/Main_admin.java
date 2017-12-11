
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NCT
 */
abstract class Main_admin{

private int id;
    private String name;
private double salary;
    public  Main_admin(int id, String name,double salary) {
        this.id = id;
        this.name = name;
        this.salary=salary;
    }

    public double getSalary() {
        return salary;
    }
    abstract double cal_salary();
    void cal_bonus(int a){
        JOptionPane.showMessageDialog(null,"monthly salary is 10000");
      }
    void cal_bonus(double b){
      JOptionPane.showMessageDialog(null,"monthly salary is 30000");
    }
}
