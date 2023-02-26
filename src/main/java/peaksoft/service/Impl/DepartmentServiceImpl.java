package peaksoft.service.Impl;

import peaksoft.entities.Department;
import peaksoft.exceptions.DepartmentNotException;
import peaksoft.repository.DepartmentRepository;
import peaksoft.service.DepartmentService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentRepository repository;

    public DepartmentServiceImpl(DepartmentRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Department> getDepartments() {
        return null;
    }

    @Override
    public void save(Department department) throws DepartmentNotException {
        Department department1 = repository.findByName(department.getName());
        if(department1!=null) throw new DepartmentNotException("department with this name not found");
        repository.save(department);
    }

    @Override
    public void remove(Long id) {
        repository.deleteById(id);


    }

    @Override
    public Department update(Long id,Department department) {
        Department department1=repository.findById(id).get();
        department1.setName(department.getName());
        department1.setHospital(department.getHospital());
        department1.setDoctors(department.getDoctors());
        department1.setHospital(department.getHospital());
        return repository.save(department1);
    }

    @Override
    public Department show_department(Long id) {
         return repository.getDepartmentById(id);

    }
}
