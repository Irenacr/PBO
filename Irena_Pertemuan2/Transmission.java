/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Irena_pertemuan2;

/**
 *
 * @author Ideapad slim 3
 */
public class Transmission {
    private String type;
    private int gears;

    public Transmission(String type, int gears) {
        this.type = type;
        this.gears = gears;
    }

    public String getType() {
        return type;
    }

    public int getGears() {
        return gears;
    }

    public void shiftGear(int gear) {
        if (gear > 0 && gear <= gears) {
            System.out.println("Shifting to gear: " + gear);
        } else {
            System.out.println("Invalid gear selection.");
        }
    }
}

    
