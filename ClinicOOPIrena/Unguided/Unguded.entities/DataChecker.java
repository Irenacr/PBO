/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided.entities;

/**
 *
 * @author Ideapad slim 3
 */

import java.util.List;

public class DataChecker {
    public static boolean isDoctorAvailable(List<Doctor> doctors, int doctorId) {
        return doctors.stream().anyMatch(doc -> doc.getId() == doctorId);
    }

    public static boolean isPatientRegistered(List<Patient> patients, int patientId) {
        return patients.stream().anyMatch(patient -> patient.getId() == patientId);
    }
}


    
