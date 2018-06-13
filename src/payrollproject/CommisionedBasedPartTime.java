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
public abstract class CommisionedBasedPartTime extends PartTime implements IPrintable{
    private int commisionpercent;

    public CommisionedBasedPartTime(String name, int age, double earnings, Vehicle vehicle) {
        super(name, age, earnings, vehicle);
    }
    public double calEarnings() {
		double ear;
        ear = super.getRate() * super.getHoursWorked();
        int commissionPercent = 0;
		double com = ear*(commissionPercent/100);
		return ear+com;
//		return (super.getRate() * super.getHoursWorked())  
	}

	@Override
	public void printMyData() {
		// TODO Auto-generated method stub
		
	}

}

    

