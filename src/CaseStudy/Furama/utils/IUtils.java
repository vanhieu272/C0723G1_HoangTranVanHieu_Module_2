package CaseStudy.Furama.utils;

import java.util.List;

public interface IUtils<O> {
    List<String> readFile(String pathName);

    void writeFile(String pathName, List<String> data);


}
