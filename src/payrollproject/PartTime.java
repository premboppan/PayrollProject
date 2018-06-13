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
public abstract class PartTime extends Employee implements IPrintable{
    
    private double rate;
    private int hoursworked;
    PartTime p;

    public PartTime(String name, int age, double earnings, Vehicle vehicle) {
        super(name, age, earnings, vehicle);
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getHoursworked() {
        return hoursworked;
    }

    public void setHoursworked(int hoursworked) {
        this.hoursworked = hoursworked;
    }

    public void settype()
    {
    }

    double getHoursWorked() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   }
    
    
    
    
    
    
    
    
    

