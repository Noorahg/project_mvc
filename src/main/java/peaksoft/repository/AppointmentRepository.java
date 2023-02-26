package peaksoft.repository;

import peaksoft.entities.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment,Long> {
    void deleteById(Long id);
    Appointment getAppointmentById(Long id);
    List<Appointment> findByOOrderByDateDesc();

}
