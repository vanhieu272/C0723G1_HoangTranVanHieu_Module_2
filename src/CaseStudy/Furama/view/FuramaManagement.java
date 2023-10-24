package CaseStudy.Furama.view;

import CaseStudy.Furama.controller.CustomerController;
import CaseStudy.Furama.controller.EmployeeController;
import CaseStudy.Furama.controller.FacilityController;
import CaseStudy.Furama.model.Facility.Facility;
import CaseStudy.Furama.model.Facility.Villa;
import CaseStudy.Furama.model.Person.Customer;
import CaseStudy.Furama.model.Person.Employee;
import CaseStudy.Furama.utils.Regex;


import java.util.List;
import java.util.Scanner;

public class FuramaManagement {

    private final EmployeeController employeeController = new EmployeeController();
    private final CustomerController customerController = new CustomerController();
    private final FacilityController facilityController = new FacilityController();
    private final Scanner scanner = new Scanner(System.in);

    public void manage() {
        while (true) {
            showMainMenu();
            int choice = choiceOption(1, 6);
            switch (choice) {
                case 1:
                    manageEmployee();
                    break;
                case 2:
                    manageCustomer();
                    break;
                case 3:
                    int choice3;
                    do {
                        showFacilityMenu();
                        choice3 = choiceOption(1,5);
                        switch (choice3){
                            case 1:
                                System.out.println(facilityController.display());;
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                        }
                    }while (choice3 != 5);
                    break;
                case 4:
                    showBookingMenu();
                    break;
                case 5:
                    showPromotionMenu();
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        }
    }

    private void manageEmployee() {
        int choice1;
        do {
            showEmployeeMenu();
            choice1 = choiceOption(1, 6);
            switch (choice1) {
                case 1:
                    displayEmployee();
                    break;
                case 2:
                    Employee newEmployee = addNewEmployee();
                    if (newEmployee != null) {
                        employeeController.add(newEmployee);
                    } else {
                        System.out.println("This ID is exist!");
                    }
                    break;
                case 3:
                    Employee editedEmployee = editEmployee();
                    if (editedEmployee != null) {
                        employeeController.edit(editedEmployee);
                    } else {
                        System.out.println("Nothing change!!");
                    }
                    break;
                case 4:
                    employeeController.delete(deleteEmployee());
                    break;
                case 5:
                    String name = inputNameToSearch();
                    if(name.equals("")){
                        System.out.println("Name can't be null!!");
                    }else {
                        List<Employee> result = employeeController.searchByName(name);
                        if (result.isEmpty()) {
                            System.out.println("Name not found!!");
                        } else {
                            System.out.println(result);
                        }
                    }
                    break;
            }
        } while (choice1 != 6);
    }

    private void manageCustomer() {
        int choice2;
        do {
            showCustomerMenu();
            choice2 = choiceOption(1,6);
            switch (choice2){
                case 1:
                    displayCustomer();
                    break;
                case 2:
                    Customer newCustomer = addNewCustomer();
                    if (newCustomer != null) {
                        customerController.add(newCustomer);
                    } else {
                        System.out.println("This ID is exist!");
                    }
                    break;
                case 3:
                    Customer editedCustomer = editCustomer();
                    if (editedCustomer != null) {
                        customerController.edit(editedCustomer);
                    } else {
                        System.out.println("Nothing change!!");
                    }
                    break;
                case 4:
                    customerController.delete(deleteCustomer());
                    break;
                case 5:
                    String name = inputNameToSearch();
                    if(name.equals("")){
                        System.out.println("Name can't be null!!");
                    }else {
                        List<Customer> result = customerController.searchByName(name);
                        if (result.isEmpty()) {
                            System.out.println("Name not found!!");
                        } else {
                            System.out.println(result);
                        }
                    }
                    break;
            }
        }while (choice2 != 6);
    }

    private void showMainMenu() {
        System.out.println("►►►►► FURAMA MANAGEMENT ◄◄◄◄◄\n" +
                "1.\tEmployee Management\n" +
                "2.\tCustomer Management\n" +
                "3.\tFacility Management \n" +
                "4.\tBooking Management\n" +
                "5.\tPromotion Management\n" +
                "6.\tExit\n");
    }

    private void showEmployeeMenu() {
        System.out.println("►►►►► EMPLOYEE MANAGEMENT ◄◄◄◄◄\n" +
                "1\tDisplay list employees\n" +
                "2\tAdd new employee\n" +
                "3\tEdit employee\n" +
                "4\tDelete employee\n" +
                "5\tSearch by name employee\n" +
                "6\tReturn main menu\n"
        );
    }

    private void showCustomerMenu() {
        System.out.println("►►►►► CUSTOMER MANAGEMENT ◄◄◄◄◄\n" +
                "1.\tDisplay list customers\n" +
                "2.\tAdd new customer\n" +
                "3.\tEdit customer\n" +
                "4.\tDelete customer\n" +
                "5.\tSearch by name customer\n" +
                "6.\tReturn main menu\n");
    }

    private void showFacilityMenu() {
        System.out.println("►►►►► FACILITY MANAGEMENT ◄◄◄◄◄\n" +
                "1\tDisplay list facility\n" +
                "2\tAdd new facility\n" +
                "3\tDisplay list facility maintenance\n" +
                "4\tDelete facility\n" +
                "5\tReturn main menu\n");
    }

    private void showBookingMenu() {
        System.out.println("►►►►► BOOKING MANAGEMENT ◄◄◄◄◄\n" +
                "1.\tAdd new booking\n" +
                "2.\tDisplay list booking\n" +
                "3.\tCreate new contracts\n" +
                "4.\tDisplay list contracts\n" +
                "5.\tEdit contracts\n" +
                "6.\tReturn main menu\n");
    }

    private void showPromotionMenu() {
        System.out.println("►►►►► PROMOTION MANAGEMENT ◄◄◄◄◄\n" +
                "1.\tDisplay list customers use service\n" +
                "2.\tDisplay list customers get voucher\n" +
                "3.\tReturn main menu\n");
    }

    private void menuFacility(){
        System.out.println("Choose Facility:");
        System.out.println("1. Villa");
        System.out.println("2. House");
        System.out.println("3. Room");
        System.out.println("4. Return Facility Manu");
    }

    /*===================================================================================================*/
    private int choiceOption(int low, int high) {
        int choice = 0;
        do {
            try {
                System.out.println("Enter your choice: ");
                choice = Integer.parseInt(scanner.nextLine());
                if (choice < low || choice > high) {
                    System.out.println("Invalid. Please enter again!!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid !!");
            }
        } while (choice < low || choice > high);
        return choice;
    }

    private String inputName() {
        String name;
        do {
            System.out.println("Enter name: ");
            name = scanner.nextLine();
            if (Regex.validateName(name))
                return name;
        } while (true);
    }

    private String inputDateOfBirth() {
        String dOB;
        do {
            System.out.println("Enter date of birth (dd/mm/yyyy)");
            dOB = scanner.nextLine();
            if (Regex.validateDayOfBirth(dOB)) {
                return dOB;
            }
        } while (true);
    }

    private String inputGender() {
        int choice;
        do {
            System.out.println("Enter gender: ");
            System.out.println("1. Male");
            System.out.println("2. Female");
            choice = choiceOption(1, 2);
            switch (choice) {
                case 1:
                    return "Male";
                case 2:
                    return "Female";
            }
        } while (true);
    }

    private String inputCitizenId() {
        String id;
        do {
            System.out.println("Enter Citizen ID: ");
            id = scanner.nextLine();
            if (Regex.validateCitizenID(id)) {
                return id;
            }
        } while (true);
    }

    private String inputPhoneNumber() {
        String phoneNumber;
        do {
            System.out.println("Enter phone number: ");
            phoneNumber = scanner.nextLine();
            if (Regex.validatePhoneNumber(phoneNumber)) {
                return phoneNumber;
            }
        } while (true);
    }

    private String inputEmail() {
        String email;
        do {
            System.out.println("Enter email: ");
            email = scanner.nextLine();
            if (Regex.validateEmail(email)) {
                return email;
            }
        } while (true);
    }

    private String inputNameToSearch() {
        String name;
        System.out.println("Enter name which you want to find: ");
        name = scanner.nextLine();
        return name;
    }

    /* =======================================EMPLOYEE===================================================*/
    private String inputEmployeeID() {
        String employeeId;
        do {
            System.out.println("Enter employee Id (NV-XXXX) : ");
            employeeId = scanner.nextLine();
            if (Regex.validateEmployeeId(employeeId)) {
                return employeeId;
            }
        } while (true);
    }

    private float inputSalary() {
        float salary;
        do {
            try {
                System.out.println("Enter salary: ");
                salary = Float.parseFloat(scanner.nextLine());
                if (salary > 0) {
                    return salary;
                }
            } catch (NumberFormatException e) {
                System.out.println("Salary must be a number and > 0");
            }
        } while (true);
    }

    private String inputLevel() {

        int choice;
        do {
            System.out.println("Choose level education: ");
            System.out.println("1. Intermediate Degree ");
            System.out.println("2. College Degree ");
            System.out.println("3. Bachelor's Degree");
            System.out.println("4. Postgraduate Degree");
            choice = choiceOption(1, 4);
            switch (choice) {
                case 1:
                    return "Intermediate Degree";
                case 2:
                    return "College Degree";
                case 3:
                    return "Bachelor's Degree";
                case 4:
                    return "Postgraduate Degree";
            }
        } while (true);
    }

    private String inputPosition() {
        int choice;
        do {
            System.out.println("Choose position: ");
            System.out.println("1. Receptionist");
            System.out.println("2. Waiter");
            System.out.println("3. Specialist");
            System.out.println("4. Supervisor");
            System.out.println("5. Manager");
            System.out.println("6. Director");
            choice = choiceOption(1, 6);
            switch (choice) {
                case 1:
                    return "Receptionist";
                case 2:
                    return "Waiter";
                case 3:
                    return "Specialist";
                case 4:
                    return "Supervisor";
                case 5:
                    return "Manager";
                case 6:
                    return "Director";
            }
        } while (true);
    }

    private Employee inputEmployeeInfor(String employeeID) {
        return new Employee(inputName(), inputDateOfBirth(), inputGender(), inputEmployeeID(), inputPhoneNumber(), inputEmail(), employeeID, inputLevel(), inputPosition(), inputSalary());
    }

    private boolean checkEmployeeID(String employeeID) {
        List<Employee> employees = employeeController.display();
        for (Employee employee : employees) {
            if (employee.getEmployeeID().equals(employeeID)) {
                return true;
            }
        }
        return false;
    }

    private void displayEmployee() {
        List<Employee> employees = employeeController.display();
        if (employees.isEmpty()) {
            System.out.println("List employee is empty!!");
        } else {
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }
    }

    private Employee addNewEmployee() {
        String employeeID;
        employeeID = inputEmployeeID();
        if (!checkEmployeeID(employeeID)) {
            return inputEmployeeInfor(employeeID);
        }
        return null;
    }

    private Employee editEmployee() {
        String employeeID = inputEmployeeID();
        if (!checkEmployeeID(employeeID)) {
            System.out.println("ID not found!!");
            return null;
        } else {
            int choice;
            List<Employee> employees = employeeController.display();
            for (Employee employee : employees) {
                if (employee.getEmployeeID().equals(employeeID)) {
                    do {
                        System.out.println("Enter which infomation do you want to edit: ");
                        System.out.println("1. Name. ");
                        System.out.println("2. Date of birth ");
                        System.out.println("3. Gender");
                        System.out.println("4. Citizen ID");
                        System.out.println("5. Phone number");
                        System.out.println("6. Email");
                        System.out.println("7. Education Level");
                        System.out.println("8. Position");
                        System.out.println("9. Salary");
                        System.out.println("10. Confirm");
                        System.out.println("11. Return Employee Menu");
                        choice = choiceOption(1, 11);
                        switch (choice) {
                            case 1:
                                employee.setName(inputName());
                                break;
                            case 2:
                                employee.setDateOfBirth(inputDateOfBirth());
                                break;
                            case 3:
                                employee.setGender(inputGender());
                                break;
                            case 4:
                                employee.setId(inputCitizenId());
                                break;
                            case 5:
                                employee.setPhoneNumber(inputPhoneNumber());
                                break;
                            case 6:
                                employee.setEmail(inputEmail());
                                break;
                            case 7:
                                employee.setLevel(inputLevel());
                                break;
                            case 8:
                                employee.setPosition(inputPosition());
                                break;
                            case 9:
                                employee.setSalary(inputSalary());
                                break;
                            case 10:
                                System.out.println("Edit successful!!");
                                return employee;
                            case 11:
                                return null;
                        }
                    } while (true);
                }
            }
        }
        return null;
    }

    private String deleteEmployee() {
        String employeeID = inputEmployeeID();
        if (!checkEmployeeID(employeeID)) {
            System.out.println("ID not found!!");
            return null;
        } else {
            System.out.println("Are you sure delete employee with ID " + employeeID + " ?" +
                    "\n1. Yes" +
                    "\n2. No");
            int choice = choiceOption(1, 2);
            switch (choice) {
                case 1:
                    System.out.println("Delete successful!!");
                    return employeeID;
                case 2:
                    return null;
            }
        }
        return null;
    }


    /*======================================================================================================*/
    /*=========================================CUSTOMER=====================================================*/
    private String inputCustomerID() {
        String customerID;
        do {
            System.out.println("Enter employee Id (KH-XXXX) : ");
            customerID = scanner.nextLine();
            if (Regex.validateCustomerId(customerID)) {
                return customerID;
            }
        } while (true);
    }

    private String inputTypeOfCustomer(){
        int choice;
        do {
            System.out.println("Enter type of customer: ");
            System.out.println("1. Diamond");
            System.out.println("2. Platinum");
            System.out.println("3. Gold");
            System.out.println("4. Silver");
            System.out.println("5. Member");
            choice = choiceOption(1, 5);
            switch (choice) {
                case 1:
                    return "Diamand";
                case 2:
                    return "Platinum";
                case 3:
                    return "Gold";
                case 4:
                    return "Silver";
                case 5:
                    return "Member";
            }
        }while (true);
    }

    private String inputCustomerAddress(){
        String address;
        do {
            System.out.println("Enter address: ");
            address = scanner.nextLine();
            if (address.equals("")) {
                System.out.println("Address can't be null");
            }else {
                return address;
            }
        }while (true);
    }

    private Customer inputCustomerInfor(String customerID) {
        String name;
        String dateOfBirth;
        String gender;
        String id;
        String phoneNumber;
        String email;
        String typeOfCustomer;
        String address;


        name = inputName();
        dateOfBirth = inputDateOfBirth();
        gender = inputGender();
        id = inputCitizenId();
        phoneNumber = inputPhoneNumber();
        email = inputEmail();
        typeOfCustomer = inputTypeOfCustomer();
        address = inputCustomerAddress();
        System.out.println("Successful!!");
        return new Customer(name, dateOfBirth, gender, id, phoneNumber, email, customerID, typeOfCustomer, address);
    }

    private boolean checkCustomerID(String customerID) {
        List<Customer> customers = customerController.display();
        for (Customer customer : customers) {
            if (customer.getCustomerID().equals(customerID)) {
                return true;
            }
        }
        return false;
    }

    private void displayCustomer() {
        List<Customer> customers = customerController.display();
        if (customers.isEmpty()) {
            System.out.println("List customer is empty!!");
        } else {
            for (Customer customer : customers) {
                System.out.println(customer);
            }
        }
    }

    private Customer addNewCustomer() {
        String customerID;
        customerID = inputCustomerID();
        if (!checkCustomerID(customerID)) {
            return inputCustomerInfor(customerID);
        }
        return null;
    }

    private Customer editCustomer() {
        String customerID = inputCustomerID();
        if (!checkCustomerID(customerID)) {
            System.out.println("ID not found!!");
            return null;
        } else {
            int choice;
            List<Customer> customers = customerController.display();
            for (Customer customer : customers) {
                if (customer.getCustomerID().equals(customerID)) {
                    do {
                        System.out.println("Enter which infomation do you want to edit: ");
                        System.out.println("1. Name. ");
                        System.out.println("2. Date of birth ");
                        System.out.println("3. Gender");
                        System.out.println("4. Citizen ID");
                        System.out.println("5. Phone number");
                        System.out.println("6. Email");
                        System.out.println("7. Type of customer");
                        System.out.println("8. Address");
                        System.out.println("9. Confirm");
                        System.out.println("10. Return Customer Menu");
                        choice = choiceOption(1, 10);
                        switch (choice) {
                            case 1:
                                customer.setName(inputName());
                                break;
                            case 2:
                                customer.setDateOfBirth(inputDateOfBirth());
                                break;
                            case 3:
                                customer.setGender(inputGender());
                                break;
                            case 4:
                                customer.setId(inputCitizenId());
                                break;
                            case 5:
                                customer.setPhoneNumber(inputPhoneNumber());
                                break;
                            case 6:
                                customer.setEmail(inputEmail());
                                break;
                            case 7:
                                customer.setType(inputTypeOfCustomer());
                                break;
                            case 8:
                                customer.setAddress(inputCustomerAddress());
                                break;
                            case 9:
                                System.out.println("Edit successful!!");
                                return customer;
                            case 10:
                                return null;
                        }
                    } while (true);
                }
            }
        }
        return null;
    }

    private String deleteCustomer() {
        String customerID = inputCustomerID();
        if (!checkCustomerID(customerID)) {
            System.out.println("ID not found!!");
            return null;
        } else {
            System.out.println("Are you sure delete employee with ID " + customerID + " ?" +
                    "\n1. Yes" +
                    "\n2. No");
            int choice = choiceOption(1, 2);
            switch (choice) {
                case 1:
                    System.out.println("Delete successful!!");
                    return customerID;
                case 2:
                    return null;
            }
        }
        return null;
    }

    /*==========================================FACILITY====================================================*/
    private boolean isExisted(String id) {
        List<Facility> facilities = facilityController.display();
        for (Facility facility : facilities) {
            if (facility.getFacilityID().equals(id)) {
                return true;
            }
        }
        return false;
    }


    public Facility inputVilla() {
        String id;
        do {
            System.out.println("Enter Villa Id (VL-YYYY): ");
            do {
                id = scanner.nextLine();
                if (isExisted(id)) {
                    System.out.println("Villa's Id is existed!");
                    System.out.println("Please enter again: ");
                }
            } while (isExisted(id));
        } while (!Regex.validateVilla(id));

        String serviceName;
        do {
            System.out.println("Enter service name: ");
            serviceName = scanner.nextLine();
        } while (!Regex.validateName(serviceName));

        float area;
        do {
            System.out.println("Enter area of villa (m2):");
            area = Float.parseFloat(scanner.nextLine());
            if (area <= 30) {
                System.out.println("Area must be greater than 30m2!");
            }
        } while (area <= 30);

        float rental;
        do {
            System.out.println("Enter rental ($):");
            rental = Float.parseFloat(scanner.nextLine());
            if (rental <= 0) {
                System.out.println("Rental must be a positive number!");
            }
        } while (rental <= 0);

        int capacity;
        do {
            System.out.println("Enter capacity of villa: ");
            capacity = Integer.parseInt(scanner.nextLine());
            if (capacity <= 0 || capacity >= 20) {
                System.out.println("Capacity of villa must be at least 1 person and at most 19 people. ");
            }
        } while (capacity <= 0 || capacity >= 20);

        String rentPeriod;
        do {
            System.out.println("Enter rent period (Hour/ Day/ Month/ Year)");
            rentPeriod = scanner.nextLine();
        } while (!Regex.validateName(rentPeriod));

        String roomStandard;
        do {
            System.out.println("Enter room standard: ");
            roomStandard = scanner.nextLine();
        } while (!Regex.validateName(roomStandard));

        float areaOfPool;
        do {
            System.out.println("Enter area of pool: ");
            areaOfPool = Float.parseFloat(scanner.nextLine());
            if (areaOfPool <= 30) {
                System.out.println("Area of pool must be greater than 30m2! ");
            }
        } while (areaOfPool <= 30);

        int floors;
        do {
            System.out.println("Enter number of floor: ");
            floors = Integer.parseInt(scanner.nextLine());
            if (floors <= 0) {
                System.out.println("Number of floor must be a positive number!");
            }
        } while (floors <= 0);
        return new Villa(id, serviceName, area, rental, capacity, rentPeriod, roomStandard, areaOfPool, floors);
    }
}

