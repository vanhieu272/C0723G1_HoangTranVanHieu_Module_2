package CaseStudy.Furama.controller;

import CaseStudy.Furama.model.Person.Employee;
import CaseStudy.Furama.service.IPersonService;
import CaseStudy.Furama.service.impl.EmployeeServiceImpl;
import java.util.List;

public class EmployeeController {

    private final IPersonService<Employee> employeeService = new EmployeeServiceImpl();

    public List<Employee> display() {
        return employeeService.display();
    }

    public void add(Employee employee) {
        employeeService.add(employee);
    }

    public void delete(String id) {
        employeeService.delete(id);
    }

    public void edit(Employee employee) {
        employeeService.edit(employee);
    }

    public List<Employee> searchByName(String name) {
        return employeeService.searchByName(name);
    }
}
