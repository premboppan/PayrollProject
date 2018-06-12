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

public class Car extends Vehicle implements IPrintable {
	
	private String maxSpeed;
	private String color;

    public Car(int maxSpeed, String Color, String make, String plate) {
        super(maxSpeed, Color, make, plate);
    }
	
	
	
	public String getmaxspeed() {
		return maxSpeed;
	}
	public void setmaxSpeed(String maxSpeed) {
		this.maxSpeed= maxSpeed;
	}
	public String getcolor() {
		return color;
	}
	public void setcolor(String color) {
		this.color = color;
	}
	@Override
	public void printMyData() {
		// TODO Auto-generated method stub
		System.out.println(this.maxSpeed + "\n" + this.color);
	}
	
	
}
