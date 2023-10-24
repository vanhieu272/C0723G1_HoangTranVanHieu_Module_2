package CaseStudy.Furama.model.Person;

public class Employee extends AbstractPerson {
    private String employeeID;
    private String level;
    private String position;
    private float salary;

    public Employee() {
    }

    public Employee(String name, String dateOfBirth, String gender, String id, String phoneNumber,
                    String email, String employeeID, String level, String position, float salary) {
        super(name, dateOfBirth, gender, id, phoneNumber, email);
        this.employeeID = employeeID;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee {" + " Name= '" + getName() + '\'' +
                ", date of birth = '" + getDateOfBirth() + '\'' +
                ", gender = '" + getGender() + '\'' +
                ", citizen id = '" + getId() + '\'' +
                ", phone number = '" + getPhoneNumber() + '\'' +
                ", email = '" + getEmail() + '\'' +
                ", employee ID = '" + getEmployeeID() + '\'' +
                ", education level = '" + getLevel() + '\'' +
                ", position='" + getPosition() + '\'' +
                ", salary=" + getSalary() + "'}\n";
    }
}
