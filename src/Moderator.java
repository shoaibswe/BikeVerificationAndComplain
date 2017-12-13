
import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shoaib
 */
class Moderator extends Admin{
int id;
String detail;
String complains;
String check_data(){
        try {
            File f=new File("Bike_information.txt");
            Scanner sc=new Scanner(f);
            
            while(sc.hasNext()){
                detail=sc.nextLine()+"\r\n";

                
            }            // TODO add your handling code here:
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SeniorAdminPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
return detail;
}

String allcomplain(){
try {
            File f2=new File("Complain.txt");
            Scanner sc1=new Scanner(f2);
            
            while(sc1.hasNext()){
                complains=sc1.nextLine()+"\r\n";

            }            // TODO add your handling code here:
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SeniorAdminPanel.class.getName()).log(Level.SEVERE, null, ex);
        } 
return complains;
}


    @Override
    int employee_id(int id) {
        
        id=103;
        this.id=id;
        return id;
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getSalary() {
        return super.getSalary(); //To change body of generated methods, choose Tools | Templates.
    }
}