/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrollproject;

public class CommisionedBasedPartTime extends PartTime implements IPrintable{
	
	private double commissionPercent;
	static double ear;
	static double comm;

    public CommisionedBasedPartTime(String name, int age, double earnings, Vehicle vehicle) {
        super(name, age, earnings, vehicle);
    }
	
	public double getCommissionPercent() {
		return commissionPercent;
	}

	public void setCommissionPercent(int commissionPercent) {
		this.commissionPercent = commissionPercent;
	}

	public double calEarnings() {
		ear = this.getRate()*this.getHoursWorked();
		comm = (commissionPercent/100)*ear;
		return ear+comm;  
	}

	@Override
	public void printMyData() {
            System.out.println("Name : "+this.getName()+"\nYear of Birth : "+this.calcBrithYear()+"\nEmployee has a Car\n\tMaker : "+getVehicle().getMaker()+"\n\tRegistration Number : "+this.getName()+"\nYear of Birth : "+this.calcBrithYear()+"\nEmployee has a Car\n\tMaker : "+getVehicle().getRegPlate()+"\n\tType of Transmission : "+getVehicle().getTypeOfTransmission()+"\n\tColour : "+getVehicle().getColor()+
                    "\nEmployee is a PartTime / Commissioned\n\tRate : "+this.getRate()+"\n\tHours Worked : "+this.getHoursWorked()+
                    "\n\tCommission : "+this.getCommissionPercent()+"%"+"\n\tEarnings : "+this.calEarnings()+"("+CommisionedBasedPartTime.ear+" + "+this.getCommissionPercent()+"%"+" of "+CommisionedBasedPartTime.ear+")");
		
	}

    private String calcBrithYear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

