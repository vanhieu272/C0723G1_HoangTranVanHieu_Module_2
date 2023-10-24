package CaseStudy.Furama.model.Person;

public class Customer extends AbstractPerson {
    private String customerID;
    private String type;
    private String address;

    public Customer() {
    }

    public Customer(String name, String dateOfBirth, String gender, String id, String phoneNumber,
                    String email, String customerID, String type, String address) {
        super(name, dateOfBirth, gender, id, phoneNumber, email);
        this.customerID = customerID;
        this.type = type;
        this.address = address;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{ Name = " + getName()
                + "| date of birth = " + getDateOfBirth()
                + "| gender " + getGender()
                + "| citizen id = " + getId()
                + "| phone number = " + getPhoneNumber()
                + "| email = " + getEmail()
                + "| customer id = " + getCustomerID()
                + "| type of customer = " + getType()
                + "| address = " + getAddress()
                + "}\n";
    }
}
