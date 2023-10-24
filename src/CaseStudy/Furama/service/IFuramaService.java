package CaseStudy.Furama.service;

import java.util.List;

public interface IFuramaService<O> {

    List<O> display();

    void add(O o);

    void delete(String id);
}
