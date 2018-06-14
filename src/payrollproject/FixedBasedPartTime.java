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
public class FixedBasedPartTime extends PartTime implements IPrintable{
	
	private double fixedAmount;

    public FixedBasedPartTime(String name, int age, double earnings, Vehicle vehicle) {
        super(name, age, earnings, vehicle);
    }
	
	public double calcEarnings() {
		
		double ear = super.getRate() * super.getHoursWorked();
		double com = ear*(fixedAmount/100);
		return ear+com;
	}

	

	public void setFixedAmount(double fixedAmount) {
		this.fixedAmount = fixedAmount;
	}



	@Override
	public void printMyData() {
		// TODO Auto-generated method stub
		
	}
	
	
}
