package peaksoft.repository;

import peaksoft.entities.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital,Long> {
    void deleteById(Long id);
    Hospital getHospitalById(Long id);
    Hospital findByName(String name);

}
