package peaksoft.service.Impl;

import peaksoft.entities.Appointment;
import peaksoft.repository.AppointmentRepository;
import peaksoft.service.AppointmentService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AppointmentServiceImpl  implements AppointmentService {
    private final AppointmentRepository repository;

    public AppointmentServiceImpl(AppointmentRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Appointment> getAppointments() {
       return repository.findByOOrderByDateDesc();
    }

    @Override
    public void save(Appointment appointment) {
        repository.save(appointment);
    }

    @Override
    public void remove(Long id) {
        repository.deleteById(id);

    }

    @Override
    public Appointment update( Long id, Appointment appointment) {
        Appointment appointment1 = repository.findById(id).get();
        appointment1.setDoctor(appointment.getDoctor());
        appointment1.setDepartment(appointment.getDepartment());
        appointment1.setPatient(appointment.getPatient());
        return repository.save(appointment1);
    }

    @Override
    public Appointment show_appointment(Long id) {
        return repository.getAppointmentById(id);
    }
}
