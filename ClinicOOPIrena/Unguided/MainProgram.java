/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided;

/**
 *
 * @author Ideapad slim 3
 */
import Unguided.entities.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MainProgram {
    public static void main(String[] args) {
        // Buat daftar dokter dan pasien
        List<Doctor> doctors = new ArrayList<>();
        List<Patient> patients = new ArrayList<>();

        Doctor doctor1 = new Doctor(1, "Smith", "Cardiology");
        Doctor doctor2 = new Doctor(2, "Johnson", "Dermatology");
        doctors.add(doctor1);
        doctors.add(doctor2);

        Patient patient1 = new Patient(101, "Alice", 25);
        Patient patient2 = new Patient(102, "Bob", 30);
        patients.add(patient1);
        patients.add(patient2);

        // Periksa ketersediaan dokter dan pasien
        System.out.println("Is Dr. Smith available? " + DataChecker.isDoctorAvailable(doctors, 1));
        System.out.println("Is Bob registered? " + DataChecker.isPatientRegistered(patients, 102));

        // Buat janji temu
        Appointment appointment1 = new Appointment(doctor1, patient1, LocalDateTime.of(2025, 3, 20, 10, 30));
        Appointment appointment2 = new Appointment(doctor2, patient2, LocalDateTime.of(2025, 3, 21, 11, 15));

        System.out.println(appointment1);
        System.out.println(appointment2);

        // Hitung diagnosis yang diberikan oleh dokter
        DiagnosisCounter counter = new DiagnosisCounter();
        counter.addDiagnosis(doctor1);
        counter.addDiagnosis(doctor1);
        counter.addDiagnosis(doctor2);

        counter.printAllDiagnosisCounts();
    }
}

    

