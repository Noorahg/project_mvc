package peaksoft.repository;

import peaksoft.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
    void deleteById(Long id);
    Department getDepartmentById(Long id);
    Department findByName(String name);
}
