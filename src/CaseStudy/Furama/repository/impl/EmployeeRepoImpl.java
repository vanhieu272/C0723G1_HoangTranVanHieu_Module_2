package CaseStudy.Furama.repository.impl;

import CaseStudy.Furama.model.Person.Employee;
import CaseStudy.Furama.repository.IPersonRepo;
import CaseStudy.Furama.utils.AbstractUtils;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepoImpl extends AbstractUtils<Employee> implements IPersonRepo<Employee> {
    private static final String LIST_EMPLOYEE_PATH = "D:\\Codegym\\module-2\\src\\CaseStudy\\Furama\\data\\list_employee.csv";

    @Override
    public void add(Employee employee) {
        boolean flag = false;
        List<Employee> employeeList = readEmployeeFromFile();
        for (Employee employee1 : employeeList) {
            if (employee1.getEmployeeID().equals(employee.getEmployeeID())) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            employeeList.add(employee);
        }
        writeEmployeeToFile(employeeList);
    }

    @Override
    public List<Employee> display() {
        return readEmployeeFromFile();
    }

    @Override
    public void delete(String employeeID) {
        List<Employee> employeeList = display();
        for (Employee employee1 : employeeList) {
            if (employee1.getEmployeeID().equals(employeeID)) {
                employeeList.remove(employee1);
                break;
            }
        }
        writeEmployeeToFile(employeeList);
    }

    @Override
    public void edit(Employee employee) {
        List<Employee> employees = display();
        for (Employee employee1 : employees) {
            if (employee1.getEmployeeID().equals(employee.getEmployeeID())) {
                employee1.setName(employee.getName());
                employee1.setDateOfBirth(employee.getDateOfBirth());
                employee1.setGender(employee.getGender());
                employee1.setId(employee.getId());
                employee1.setPhoneNumber(employee.getPhoneNumber());
                employee1.setEmail(employee.getEmail());
                employee1.setLevel(employee.getLevel());
                employee1.setPosition(employee.getPosition());
                employee1.setSalary(employee.getSalary());
                break;
            }
        }
        writeEmployeeToFile(employees);
    }

    @Override
    public List<Employee> searchByName(String name) {
        List<Employee> employees = display();
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getName().contains(name)) {
                result.add(employee);
            }
        }
        return result;
    }

    private List<String> convertEmployeeToString(List<Employee> employees) {
        List<String> stringList = new ArrayList<>();
        for (Employee employee : employees) {
            stringList.add(employee.getName()
                    + COMMA + employee.getDateOfBirth()
                    + COMMA + employee.getGender()
                    + COMMA + employee.getId()
                    + COMMA + employee.getPhoneNumber()
                    + COMMA + employee.getEmail()
                    + COMMA + employee.getEmployeeID()
                    + COMMA + employee.getLevel()
                    + COMMA + employee.getPosition()
                    + COMMA + employee.getSalary()
            );
        }
        return stringList;
    }

    private List<Employee> convertStringToEmployee(List<String> data) {
        List<Employee> employeeList = new ArrayList<>();
        for (String str : data) {
            String[] splittedStr = str.split(COMMA);
            employeeList.add(new Employee(splittedStr[0], splittedStr[1], splittedStr[2], splittedStr[3],
                    splittedStr[4], splittedStr[5], splittedStr[6], splittedStr[7], splittedStr[8],
                    Float.parseFloat(splittedStr[9])
            ));
        }
        return employeeList;
    }

    private List<Employee> readEmployeeFromFile() {
        List<String> data = readFile(LIST_EMPLOYEE_PATH);
        return convertStringToEmployee(data);
    }

    private void writeEmployeeToFile(List<Employee> employees) {
        List<String> stringList = convertEmployeeToString(employees);
        writeFile(LIST_EMPLOYEE_PATH, stringList);
    }
}