package peaksoft.service;

import peaksoft.entities.Doctor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DoctorService {
    List<Doctor> getDoctors();
    void save (Doctor doctor);
    void remove(Long id);
    Doctor update (Long id,Doctor doctor);
    Doctor show_doctor(Long id);

}
