package peaksoft.service.Impl;

import peaksoft.entities.Hospital;
import peaksoft.repository.HospitalRepository;
import peaksoft.service.HospitalService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HospitalServiceImpl  implements HospitalService {
    private final HospitalRepository repository;

    public HospitalServiceImpl(HospitalRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Hospital> getHospitals() {
        return null;
    }

    @Override
    public void save(Hospital hospital) {
        hospital.setAddress(hospital.getAddress());
        hospital.setName(hospital.getName());
        repository.save(hospital);
    }

    @Override
    public void remove(Long id) {
        repository.deleteById(id);

    }

    @Override
    public Hospital update(Long id, Hospital hospital) {
        Hospital hospital1=repository.findById(id).get();
        hospital1.setAppointment(hospital.getAppointment());


        return repository.save(hospital1);
    }

    @Override
    public Hospital show_hospital(Long id) {
        return repository.getHospitalById(id);
    }

    @Override
    public Integer countDoctors() {

        return null;
    }
}
