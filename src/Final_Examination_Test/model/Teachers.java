package Final_Examination_Test.model;

public class Teachers extends AbstractPerson{
    String teacherID;

    public Teachers(String name, String dayOfBirth, String gender, String phoneNumber, String teacherID) {
        super(name, dayOfBirth, gender, phoneNumber);
        this.teacherID = teacherID;
    }

    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    @Override
    public String toString() {
        return "Teachers{" +
                "teacherID='" + teacherID + '\'' +
                "} " + super.toString();
    }

}
