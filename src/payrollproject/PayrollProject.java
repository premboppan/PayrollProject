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
public class PayrollProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Intern rf = new Intern();
		rf.setAge(21);rf.setName("Ragina");rf.setSchoolName("seneca");rf.setEarnings(2000);
		
		rf.printMyData();
		System.out.println("=========================================");
                
                
        FullTime Rs = new FullTime();
		Car vp = new Car();
		Rs.setName("Mike");Rs.setAge(40);Rs.setVehicle(vp);Rs.setSalary(5000.00);Rs.setBonus(50.00);
		vp.setMake("RAM");vp.setPlate("AP16 BM 007");vp.setMaxSpeed(300);
		vp.setColor("Black");
                
                
         Rs.printMyData();
		System.out.println("=========================================");
		CommisionedBasedPartTime cpt1 = new CommisionedBasedPartTime();
		Car vp2 = new Car();
		cpt1.setName("Chris");cpt1.setAge(24);cpt1.setVehicle(vp2);cpt1.setRate(25);cpt1.setHoursworked(15);cpt1.setCommissionPercent(12);
		vp2.setMake("Ford");vp2.setPlate("PB 11 B 567");vp2.setMaxspeed(400);vp2.setColor("Gold");
		cpt1.printMyData();

System.out.println("=========================================");
		
		FixedBasedPartTime fbt1 = new FixedBasedPartTime();
		Motorcycle mc1 = new Motorcycle();
		fbt1.setName("Charlie");fbt1.setAge(35);fbt1.setVehicle(mc1);mc1.setMake("Triumph");mc1.setPlate("RJ 010");mc1.setMaxspeed(150);
		mc1.setColor("white");fbt1.setRate(12);fbt1.setHoursworked(18);fbt1.setFixedAmount(90);
		fbt1.printMyData();
    }
    
}
