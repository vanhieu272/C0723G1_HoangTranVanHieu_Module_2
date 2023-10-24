package Final_Examination_Test.repository;

import Final_Examination_Test.model.Students;

import java.util.List;

public interface IStudentRepo {

    void add(Students student);

    void delete(String id);

    List<Students> display();

    List<Students> searchByName(String name);
}
