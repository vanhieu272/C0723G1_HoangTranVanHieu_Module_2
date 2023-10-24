package CaseStudy.Furama.repository;


import CaseStudy.Furama.model.Facility.Facility;


import java.util.List;
import java.util.Map;

public interface IFacilityRepo<E> extends IFuramaRepo<E> {


    List<Facility> displayFacilityListMaintenance();

    Map<Facility, Integer> showInfor(String id);


}
