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
	static double ear;

    public FixedBasedPartTime(){
    
    }
	
        public double calcEarnings() {
		ear = this.getRate()*this.getHoursworked();
		double com =fixedAmount;
		return ear+com;
	}

	public void setFixedAmount(double fixedAmount) {
		this.fixedAmount = fixedAmount;
	}
        
        public double getFixedAmount() {
		return fixedAmount;
	}


	@Override
	public void printMyData() {
	System.out.println("Name : "+this.getName()+"\nYear of Birth : "+this.calcBrithYear()+"\nEmployee has a MotorCycle\n\tMake : "
	+getVehicle().getMake()+"\n\tLicense Plate : "+getVehicle().getPlate()+"\n\tMaxSpeed : "+getVehicle().getMaxSpeed()+"\n\tColour : "+getVehicle().getColor()
	+"\nEmployee is PartTime / Fixed Amt\n\t Rate : "+this.getRate()+"\n\tHours Worked : "+this.getHoursworked()
	+"\n\tFixed Amount : "+this.fixedAmount+"\n\tEarnings : "+this.calcEarnings()+"("+FixedBasedPartTime.ear+" + "+this.fixedAmount+")");	
	}

    private String calcBrithYear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
	
}
