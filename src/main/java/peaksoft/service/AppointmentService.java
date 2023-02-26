package peaksoft.service;

import peaksoft.entities.Appointment;

import java.util.List;

public interface AppointmentService {
    List<Appointment> getAppointments();
    void save (Appointment appointment);
    void remove(Long id);
    Appointment update (Long id, Appointment appointment);
    Appointment show_appointment(Long id);

}
