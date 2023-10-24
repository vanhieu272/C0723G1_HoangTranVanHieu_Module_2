package CaseStudy.Furama.service;

import java.util.List;

public interface IPersonService<O> extends IFuramaService<O> {



    void edit( O o);

    List<O> searchByName(String name);
}
