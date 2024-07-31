package org.example.company;

public class Car {

    private final boolean engine = true;
    private int cylinders;
    private String name;
    private final int wheels = 4;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
    }


    public int getCylinders() {
        return this.cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "Car -> " + getClass().getSimpleName() + " -> the car's engine is starting";
    }

    public String accelerate() {
        return "Car -> " + getClass().getSimpleName() + " -> the car is accelerating";
    }

    public String brake() {
        return "Car -> " + getClass().getSimpleName() + " -> the car is braking";
    }

    public int getWheels() {
        return wheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }

    @Override
    public boolean equals(Object car) {
       return  ((Car)car).name.equals(this.name) && (cylinders == this.cylinders);
    }
}
