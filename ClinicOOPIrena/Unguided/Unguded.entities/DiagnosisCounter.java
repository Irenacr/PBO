/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided.entities;

/**
 *
 * @author Ideapad slim 3
 */
import java.util.HashMap;
import java.util.Map;

public class DiagnosisCounter {
    private final Map<Doctor, Integer> diagnosisMap;

    public DiagnosisCounter() {
        this.diagnosisMap = new HashMap<>();
    }

    public void addDiagnosis(Doctor doctor) {
        diagnosisMap.put(doctor, diagnosisMap.getOrDefault(doctor, 0) + 1);
    }

    public int getDiagnosisCount(Doctor doctor) {
        return diagnosisMap.getOrDefault(doctor, 0);
    }

    public void printAllDiagnosisCounts() {
        System.out.println("Diagnosis Count per Doctor:");
        for (Map.Entry<Doctor, Integer> entry : diagnosisMap.entrySet()) {
            System.out.println(entry.getKey().getName() + " has made " + entry.getValue() + " diagnoses.");
        }
    }
}


