package CaseStudy.Furama.repository.impl;

import CaseStudy.Furama.model.Person.Customer;
import CaseStudy.Furama.repository.IPersonRepo;
import CaseStudy.Furama.utils.AbstractUtils;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepoImpl extends AbstractUtils<Customer> implements IPersonRepo<Customer> {
    private static final String LIST_CUSTOMER_PATH = "D:\\Codegym\\module-2\\src\\CaseStudy\\Furama\\data\\list_customer.csv";

    @Override
    public List<Customer> display() {
        return readCustomerFromFile();
    }

    @Override
    public void add(Customer customer) {
        boolean flag = false;
        List<Customer> customers = readCustomerFromFile();
        for (Customer customer1 : customers) {
            if (customer1.getCustomerID().equals(customer.getCustomerID())) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            customers.add(customer);
        }
        writeCustomerToFile(customers);
    }

    @Override
    public void delete(String id) {
        List<Customer> customers = readCustomerFromFile();
        for (Customer customer : customers) {
            if (customer.getCustomerID().equals(id)) {
                customers.remove(customer);
                break;
            }
        }
        writeCustomerToFile(customers);
    }

    @Override
    public void edit(Customer customer) {
        List<Customer> customers = readCustomerFromFile();
        for (Customer customer1 : customers) {
            if (customer1.getCustomerID().equals(customer.getCustomerID())) {
                customer1.setName(customer.getName());
                customer1.setDateOfBirth(customer.getDateOfBirth());
                customer1.setGender(customer.getGender());
                customer1.setId(customer.getId());
                customer1.setPhoneNumber(customer.getPhoneNumber());
                customer1.setEmail(customer.getEmail());
                customer1.setType(customer.getType());
                customer1.setAddress(customer.getAddress());
                break;
            }
        }
        writeCustomerToFile(customers);
    }

    @Override
    public List<Customer> searchByName(String name) {
        List<Customer> customers = readCustomerFromFile();
        List<Customer> result = new ArrayList<>();
        for (Customer customer : customers) {
            if (customer.getName().contains(name)) {
                result.add(customer);
            }
        }
        return result;
    }

    private List<String> convertCustomerToString(List<Customer> customers) {
        List<String> stringList = new ArrayList<>();
        for (Customer customer : customers) {
            stringList.add(customer.getName()
                    + COMMA + customer.getDateOfBirth()
                    + COMMA + customer.getGender()
                    + COMMA + customer.getId()
                    + COMMA + customer.getPhoneNumber()
                    + COMMA + customer.getEmail()
                    + COMMA + customer.getCustomerID()
                    + COMMA + customer.getType()
                    + COMMA + customer.getAddress()
            );
        }
        return stringList;
    }

    private List<Customer> convertStringToCustomer(List<String> data) {
        List<Customer> customers = new ArrayList<>();
        for (String str : data) {
            String[] stringSplitted = str.split(COMMA);
            customers.add(new Customer(stringSplitted[0],
                    stringSplitted[1],
                    stringSplitted[2],
                    stringSplitted[3],
                    stringSplitted[4],
                    stringSplitted[5],
                    stringSplitted[6],
                    stringSplitted[7],
                    stringSplitted[8]
            ));
        }
        return customers;
    }

    private List<Customer> readCustomerFromFile() {
        List<String> data = readFile(LIST_CUSTOMER_PATH);
        return convertStringToCustomer(data);
    }

    private void writeCustomerToFile(List<Customer> customers) {
        List<String> data = convertCustomerToString(customers);
        writeFile(LIST_CUSTOMER_PATH, data);
    }
}
