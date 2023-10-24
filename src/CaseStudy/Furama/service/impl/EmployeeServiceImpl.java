package CaseStudy.Furama.service.impl;

import CaseStudy.Furama.model.Person.Employee;
import CaseStudy.Furama.repository.IPersonRepo;
import CaseStudy.Furama.repository.impl.EmployeeRepoImpl;
import CaseStudy.Furama.service.IPersonService;

import java.util.List;

public class EmployeeServiceImpl implements IPersonService<Employee> {

   private final IPersonRepo<Employee> employeeRepo = new EmployeeRepoImpl();


    @Override
    public List<Employee> display() {
        return employeeRepo.display();
    }

    @Override
    public void add(Employee employee) {
        employeeRepo.add(employee);
    }

    @Override
    public void delete(String id) {
        employeeRepo.delete(id);
    }

    @Override
    public void edit(Employee employee) {
        employeeRepo.edit(employee);
    }

    @Override
    public List<Employee> searchByName(String name) {
        return employeeRepo.searchByName(name);
    }
}
