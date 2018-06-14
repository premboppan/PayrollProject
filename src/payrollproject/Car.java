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
public class Car extends Vehicle implements IPrintable{

    public Car(int maxSpeed, String Color) {
        super(maxSpeed, Color);
    }

    @Override
    public void printMyData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    }
    
