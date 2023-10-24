package CaseStudy.Furama.controller;

import CaseStudy.Furama.model.Person.Customer;
import CaseStudy.Furama.model.Person.Employee;
import CaseStudy.Furama.service.IPersonService;
import CaseStudy.Furama.service.impl.CustomerServiceImpl;

import java.util.List;

public class CustomerController {
    private final IPersonService<Customer> customerService = new CustomerServiceImpl();


    public List<Customer> display(){
        return customerService.display();
    }

    public void add(Customer customer){
        customerService.add(customer);
    }

    public void delete(String id){
        customerService.delete(id);
    }

    public void edit(Customer customer){
        customerService.edit(customer);
    }

    public List<Customer> searchByName(String name){
        return customerService.searchByName(name);
    }
}
