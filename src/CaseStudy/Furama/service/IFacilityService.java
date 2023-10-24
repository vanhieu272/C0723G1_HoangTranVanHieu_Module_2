package CaseStudy.Furama.service;

import CaseStudy.Furama.model.Facility.Facility;

import java.util.List;
import java.util.Map;

public interface IFacilityService<E> extends IFuramaService<Facility> {

    List<Facility> displayFacilityListMaintenance();

    Map<Facility, Integer> showInfor(String id);
}
