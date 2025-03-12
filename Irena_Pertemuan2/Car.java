/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Irena_pertemuan2;

/**
 *
 * @author Ideapad slim 3
 */
public class Car {
    private String brand;
    private Engine engine; // Komposisi
    private Transmission transmission; // Komposisi

    public Car(String brand, Engine engine, Transmission transmission) {
        this.brand = brand;
        this.engine = engine;
        this.transmission = transmission;
    }

    public void startCar() {
        System.out.println(brand + " is starting...");
        engine.start();
    }

    public void drive(int gear) {
        System.out.println(brand + " is driving...");
        transmission.shiftGear(gear);
    }

    public void showDetails() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Engine Type: " + engine.getType() + ", Horsepower: " + engine.getHorsepower());
        System.out.println("Transmission Type: " + transmission.getType() + ", Gears: " + transmission.getGears());
    }
}

    
