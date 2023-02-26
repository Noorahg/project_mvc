package peaksoft.service.Impl;

import peaksoft.entities.Patient;
import peaksoft.repository.PatientRepository;
import peaksoft.service.PatientService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PatientServiceImpl  implements PatientService {
    private final PatientRepository repository;

    public PatientServiceImpl(PatientRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Patient> getPatients() {
        return null;
    }

    @Override
    public void save(Patient patient) {
        repository.save(patient);

    }

    @Override
    public void remove(Long id) {
        repository.deleteById(id);

    }

    @Override
    public Patient update(Long id, Patient patient) {
        Patient patient1=repository.findById(id).get();
        patient1.setFirstName(patient.getFirstName());
        patient1.setHospital(patient.getHospital());
        patient1.setGender(patient.getGender());
        patient1.setEmail(patient.getEmail());
        patient1.setLastName(patient.getLastName());
        return repository.save(patient1);
    }

    @Override
    public Patient show_patient(Long id) {
        return repository.getPatientById(id);
    }
}
