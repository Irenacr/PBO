/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Irena_pertemuan2;

/**
 *
 * @author Ideapad slim 3
 */
public class Main_Car {
    public static void main(String[] args) {
        Engine engine = new Engine("V8", 400);
        Transmission transmission = new Transmission("Automatic", 6);
        Car car = new Car("Ford Mustang", engine, transmission);

        car.showDetails();
        car.startCar();
        car.drive(3);
    }
}

    
