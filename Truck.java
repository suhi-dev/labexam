package com.klef.jfsd.exam;

import jakarta.persistence.Entity;

@Entity
public class Truck extends Vehicle {
    private double loadCapacity;

    public Truck() {}

    public Truck(String name, String type, int maxSpeed, String color, double loadCapacity) {
        super(name, type, maxSpeed, color);
        this.loadCapacity = loadCapacity;
    }

    // Getter and Setter
    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
