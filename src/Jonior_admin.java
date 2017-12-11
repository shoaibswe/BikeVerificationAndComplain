
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
class Junior_admin extends Main_admin{
    Junior_admin(int id,String name,double salary){
super(id,name,salary);
}
    @Override
    public double cal_salary(){
return getSalary()*12;
}
    @Override
    void cal_bonus(int a){
    JOptionPane.showMessageDialog(null,a);
    }
    @Override
    void cal_bonus(double b){
    JOptionPane.showMessageDialog(null,b);
    }
}