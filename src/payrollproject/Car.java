/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrollproject;


 

public class Car extends Vehicle implements IPrintable {
	
	private String maxSpeed;
	private String color;

    public Car(){

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
		
        }

    void setMaxspeed(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
    }
        

}
	
	