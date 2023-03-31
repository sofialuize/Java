/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trebas;

/**
 *
 * @author sofia
 */
import java.util.Scanner;

class Distance {
    double value;

    public Distance(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}

class Trajectory {
    Distance homeToGym;
    Distance homeToCollege;
    Distance gymToCollege;

    public Trajectory(Distance homeToGym, Distance homeToCollege) {
        this.homeToGym = homeToGym;
        this.homeToCollege = homeToCollege;
        this.gymToCollege = new Distance(Math.sqrt(Math.pow(homeToCollege.getValue(), 2) + Math.pow(homeToGym.getValue(), 2)));
    }

    public Distance getTotalDistance() {
        return new Distance(homeToGym.getValue() + gymToCollege.getValue());
    }
}

class TravelTime {
    Trajectory trajectory;
    double speed;

    public TravelTime(Trajectory trajectory, double speed) {
        this.trajectory = trajectory;
        this.speed = speed;
    }

    public double getTime() {
        return trajectory.getTotalDistance().getValue() / speed;
    }
}

public class Travel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your speed in meters per minute: ");
        double speed = input.nextDouble();

        Distance homeToGym = new Distance(72);
        Distance homeToCollege = new Distance(97);
        Trajectory trajectory = new Trajectory(homeToGym, homeToCollege);
        TravelTime travelTime = new TravelTime(trajectory, speed);

        System.out.println("It will take you " + travelTime.getTime() + " minutes to travel from home to college.");
    }
}