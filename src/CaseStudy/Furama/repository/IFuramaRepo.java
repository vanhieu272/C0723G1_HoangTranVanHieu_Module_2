package CaseStudy.Furama.repository;

import java.util.List;

public interface IFuramaRepo<O> {
    List<O> display();

    void add(O o);

    void delete(String id);
}
