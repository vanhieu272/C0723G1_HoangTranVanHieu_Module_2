package CaseStudy.Furama.repository;

import java.util.List;

public interface IPersonRepo<O> extends IFuramaRepo<O> {


    void edit( O o);

    List<O> searchByName(String name);

}
