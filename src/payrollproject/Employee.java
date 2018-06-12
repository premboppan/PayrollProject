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
public abstract class Employee implements IPrintable{
    private String name;
    private int age;
    private double earnings;
    private Vehicle vehicle;

    public Employee(String name, int age, double earnings, Vehicle vehicle) {
        this.name = name;
        this.age = age;
        this.earnings = earnings;
        this.vehicle = vehicle;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getEarnings() {
        return earnings;
    }

    public void setEarnings(double earnings) {
        this.earnings = earnings;
    }

  public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

   
}
