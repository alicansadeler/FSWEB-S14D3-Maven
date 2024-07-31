package org.example.company;

public class Mitsubishi extends Car{

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        System.out.println("Class Name " + getClass().getSimpleName());
        return getName() + " engine is starting!";
    }

    @Override
    public String accelerate() {
        System.out.println("Class Name " + getClass().getSimpleName());
        return getName() + " is accelerating!";
    }

    @Override
    public String brake() {
        System.out.println("Class Name " + getClass().getSimpleName());
        return getName() + " is braking!";
    }
}
