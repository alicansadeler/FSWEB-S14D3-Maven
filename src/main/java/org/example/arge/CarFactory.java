package org.example.arge;

public class CarFactory {
    public static void main(String[] args) {
        CarSkeleton electricCar = new ElectricCar("tesla", "testa test", 700 , 2000);



        CarSkeleton gasPowered = new GasPoweredCar("honda", "honda test", 120, 4);

        startEngine(electricCar);

        startEngine(gasPowered);
    }

    public static void startEngine(CarSkeleton carSkeleton) {
        System.out.println(carSkeleton.startEngine());
    }
}
