/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrollproject;

/**
 *
 * @author macstudent
 */
public class FullTime extends Employee implements IPrintable{
    private double salary;
    private double bonus;
    
 public FullTime(double salary, double bonus, String name, int age, double earnings, Vehicle vehicle) {
        super(name, age, earnings, vehicle);
        this.salary = salary;
        this.bonus = bonus;
        
 }
    public double getSalary(){
         return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void printMyData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    }
    
    
    
    
    
}
