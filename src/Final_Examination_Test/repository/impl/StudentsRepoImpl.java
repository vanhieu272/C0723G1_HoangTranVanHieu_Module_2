package Final_Examination_Test.repository.impl;

import Final_Examination_Test.model.Students;
import Final_Examination_Test.repository.IStudentRepo;
import Final_Examination_Test.utils.AbstractUtils;

import java.util.ArrayList;
import java.util.List;

public class StudentsRepoImpl extends AbstractUtils implements IStudentRepo {
    private final String LIST_STUDENTS_PATH = "D:\\Codegym\\module-2\\src\\Final_Examination_Test\\data\\list_students.csv";
    private final String COMMA = ",";

    @Override
    public void add(Students student) {
        boolean flag = false;
        List<Students> students = readStudentFromFile();
        for(Students students1 : students){
            if(students1.getStudentID().equals(student.getStudentID())){
                flag = true;
                break;
            }
        }
        if(!flag){
            students.add(student);
        }
        writeStudentsToFile(students);
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public List<Students> display() {
        return null;
    }

    @Override
    public List<Students> searchByName(String name) {
        return null;
    }

    public List<String> convertStudentToString(List<Students> students) {
        List<String> data = new ArrayList<>();
        for (Students students1 : students) {
            data.add(students1.getName()
                    + COMMA + students1.getDayOfBirth()
                    + COMMA + students1.getGender()
                    + COMMA + students1.getPhoneNumber()
                    + COMMA + students1.getStudentID());
        }
        return data;
    }

    public List<Students> convertStringToStudent(List<String> data) {
        List<Students> students = new ArrayList<>();
        for(String str : data){
            String [] splittedStr = str.split(COMMA);
            students.add(new Students(splittedStr[0], splittedStr[1], splittedStr[2],
                    splittedStr[3], splittedStr[4]));
        }
        return students;
    }

    public List<Students> readStudentFromFile(){
        List<String> data = readFile(LIST_STUDENTS_PATH);
        return convertStringToStudent(data);
    }

    public void writeStudentsToFile(List<Students> students){
        List<String> stringList = convertStudentToString(students);
        writeFile(LIST_STUDENTS_PATH, stringList);
    }
}
