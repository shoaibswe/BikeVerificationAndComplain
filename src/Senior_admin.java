/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shoaib
 */

class Senior_admin extends Main_admin{
Senior_admin(int id,String name,double salary){
super(id,name,salary);
}
@Override
public double cal_salary(){
return getSalary()*12;
}}