package Final_Examination_Test.model;

public class Students extends AbstractPerson {
    private String studentID;

    public Students(String name, String dayOfBirth, String gender, String phoneNumber, String studentID) {
        super(name, dayOfBirth, gender, phoneNumber);
        this.studentID = studentID;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "Students{" +
                "studentID='" + studentID + '\'' +
                "} " + super.toString();
    }
}
