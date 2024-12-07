package com.klef.jfsd.exam;

import jakarta.persistence.Entity;

@Entity
public class Car extends Vehicle {
    private int numberOfDoors;

    public Car() {}

    public Car(String name, String type, int maxSpeed, String color, int numberOfDoors) {
        super(name, type, maxSpeed, color);
        this.numberOfDoors = numberOfDoors;
    }

    // Getter and Setter
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
