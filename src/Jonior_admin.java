
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author shoaib
 */
class Junior_admin extends Admin implements iBonus{
double bonus;
int id;
    @Override
    int employee_id(int id) {
    id=101;
    this.id=id;
    return id;
    }

    

    @Override
    public double getSalary() {
        return super.getSalary(); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public double calculateBonus(double salary) {
    bonus=salary*.10;
        return bonus;
        
    }  }

