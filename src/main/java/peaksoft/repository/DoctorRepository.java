package peaksoft.repository;

import peaksoft.entities.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Long> {
    void deleteById(Long id);
    Doctor getDoctorById(Long id);
    Doctor findByName(String name);
}
