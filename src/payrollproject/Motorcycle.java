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
 public class Motorcycle extends Vehicle implements IPrintable {
	
	private String color;
	private String MaxSpeed;

    public Motorcycle(int maxSpeed, String Color, String make, String plate) {
        super(maxSpeed, Color, make, plate);
    }
	
	
	
	public String getColor() { 
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

   
    public String getmaxSpeed() {
		return MaxSpeed;
	}
	public void setMaxSpeed(String MaxSpeed) {
		this.MaxSpeed = MaxSpeed;
	}
	@Override
	public void printMyData() {
		
		
	}
	
	
}


    

