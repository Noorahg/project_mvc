package peaksoft.service;

import peaksoft.entities.Hospital;

import java.util.List;

public interface HospitalService {
    List<Hospital> getHospitals();
    void save (Hospital hospital);
    void remove(Long id);
    Hospital update (Long id,Hospital  hospital);
    Hospital show_hospital(Long id);

    Integer countDoctors();

}
