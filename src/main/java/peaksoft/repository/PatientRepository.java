package peaksoft.repository;

import peaksoft.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Long> {
    void deleteById(Long id);
    Patient getPatientById(Long id);
    Patient findByName(String name);
}
