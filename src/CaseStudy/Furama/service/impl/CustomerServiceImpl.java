package CaseStudy.Furama.service.impl;

import CaseStudy.Furama.model.Person.Customer;
import CaseStudy.Furama.repository.IPersonRepo;
import CaseStudy.Furama.repository.impl.CustomerRepoImpl;
import CaseStudy.Furama.service.IPersonService;

import java.util.List;

public class CustomerServiceImpl implements IPersonService<Customer> {
    private final IPersonRepo<Customer> customerRepo = new CustomerRepoImpl();
    @Override
    public List<Customer> display() {
        return customerRepo.display();
    }

    @Override
    public void add(Customer customer) {
        customerRepo.add(customer);
    }

    @Override
    public void delete(String id) {
        customerRepo.delete(id);
    }

    @Override
    public void edit(Customer customer) {
        customerRepo.edit(customer);
    }

    @Override
    public List<Customer> searchByName(String name) {
        return customerRepo.searchByName(name);
    }
}
