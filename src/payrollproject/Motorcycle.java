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
public class Motorcycle extends Vehicle implements IPrintable{

    public Motorcycle(int maxSpeed, String Color) {
        super(maxSpeed, Color);
    }
    private String make;
    private String plate;

    public Motorcycle(int maxSpeed, String Color, String make, String plate) {
        super(maxSpeed, Color, make, plate);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }
    @Override
    public void printMyData() {
}
}

    }
}
