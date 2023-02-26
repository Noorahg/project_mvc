package peaksoft.service;

import peaksoft.entities.Patient;

import java.util.List;

public interface PatientService {
    List<Patient> getPatients();
    void save (Patient patient);
    void remove(Long id);
    Patient update (Long id, Patient patient);
    Patient show_patient(Long id);

}
