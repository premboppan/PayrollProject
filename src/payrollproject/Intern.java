/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrollproject;


public class Intern extends Employee implements IPrintable{
    private String schoolName;

    public Intern(String name, int age, double earnings, Vehicle vehicle) {
        super(name, age, earnings, vehicle);
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
    
    @Override
	public void printMyData() {
		System.out.println("Name : " + this.getName()+"\nYear of Birth :" + this.CalcBrithYear() + "\nEmployee ha no Vehicle\nEmployee is Intern\n\tSchool :"
		+this.schoolName+"\n\tEarnings :"+this.getEarnings());
		
	}

    private String CalcBrithYear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

