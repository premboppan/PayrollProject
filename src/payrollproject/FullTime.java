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

    public FullTime(String name, int age, double earnings, Vehicle vehicle) {
        super(name, age, earnings, vehicle);
    }

    public double calEarnings() {
		return salary + bonus;
	}
    
    public double getSalary() {
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
		System.out.println("Name : "+this.getName() +"\nYear of Birth : "+this.CalcBirthYear()
		+"\nEmployee has a Car \n\tMake : "+getVehicle().getMake()+"\n\tRegistration Number : "+getVehicle().getPlate()
		+"\n\tMaxSpeed : "+getVehicle().getMaxSpeed()+"\n\tColour : "+getVehicle().getColor()+"\nEmployee is FullTime\n\tSalary : "+this.salary
		+"\n\tBonus : "+this.bonus+"\n\tEarnings : "+this.calEarnings());
		
	}
    
}

    

