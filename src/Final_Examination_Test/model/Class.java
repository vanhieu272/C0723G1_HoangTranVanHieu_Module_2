package Final_Examination_Test.model;

public class Class {
    String classID;
    String classRoomName;
    String teacherID;

    public Class(String classID, String classRoomName, String teacherID) {
        this.classID = classID;
        this.classRoomName = classRoomName;
        this.teacherID = teacherID;
    }

    public String getClassID() {
        return classID;
    }

    public void setClassID(String classID) {
        this.classID = classID;
    }

    public String getClassRoomName() {
        return classRoomName;
    }

    public void setClassRoomName(String classRoomName) {
        this.classRoomName = classRoomName;
    }

    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    @Override
    public String toString() {
        return "Class{" +
                "classID='" + classID + '\'' +
                ", classRoomName='" + classRoomName + '\'' +
                ", teacherID='" + teacherID + '\'' +
                '}';
    }
}
