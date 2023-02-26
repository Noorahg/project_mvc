package peaksoft.service.Impl;

import peaksoft.entities.Doctor;
import peaksoft.repository.DoctorRepository;
import peaksoft.service.DoctorService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DoctorServiceImpl implements DoctorService {

    private final DoctorRepository repository;

    public DoctorServiceImpl(DoctorRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Doctor> getDoctors() {
        return null;
    }

    @Override
    public void save(Doctor doctor) {
        repository.save(doctor);


    }

    @Override
    public void remove(Long id) {
        repository.deleteById(id);

    }

    @Override
    public Doctor update(Long id,Doctor doctor) {
        Doctor doctor1=repository.findById(id).get();
        doctor1.setAppointment(doctor.getAppointment());
        doctor1.setDepartment(doctor.getDepartment());
        doctor1.setFirstName(doctor.getFirstName());
        doctor1.setEmail(doctor.getEmail());
        doctor1.setLastName(doctor.getLastName());
        return repository.save(doctor1);
    }

    @Override
    public Doctor show_doctor(Long id) {
        return repository.getDoctorById(id);
    }
}
