package peaksoft.service;

import peaksoft.entities.Department;
import peaksoft.exceptions.DepartmentNotException;

import java.util.List;


public interface DepartmentService {
    List<Department> getDepartments();
    void save (Department department) throws DepartmentNotException;
    void remove(Long id);
    Department update (Long id,Department department);
    Department show_department(Long id);

}
