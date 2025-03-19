/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided.entities;

/**
 *
 * @author Ideapad slim 3
 */

import java.time.LocalDateTime;

public class Appointment {
    private final Doctor doctor;
    private final Patient patient;
    private final LocalDateTime appointmentTime;

    public Appointment(Doctor doctor, Patient patient, LocalDateTime appointmentTime) {
        this.doctor = doctor;
        this.patient = patient;
        this.appointmentTime = appointmentTime;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public LocalDateTime getAppointmentTime() {
        return appointmentTime;
    }

    @Override
    public String toString() {
        return "Appointment: " + patient.getName() + " with " + doctor.getName() + " at " + appointmentTime;
    }
}


