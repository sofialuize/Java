/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trebas;

/**
 *
 * @author sofia
 */
class Vehicle {
    double milesDriven;
    double gasUsed;

    public Vehicle(double milesDriven, double gasUsed) {
        this.milesDriven = milesDriven;
        this.gasUsed = gasUsed;
    }

    public double calculateMileage() {
        return milesDriven / gasUsed;
    }
}

class CarMileage extends Vehicle {
    
    public CarMileage(double milesDriven, double gasUsed) {
        super(milesDriven, gasUsed);
    }

}

public class Car {
    public static void main(String[] args) {
        CarMileage myCar = new CarMileage(200, 30);
        double mileage = myCar.calculateMileage();
        System.out.println("Your car's gas mileage is " + mileage + " miles per gallon.");
    }
}