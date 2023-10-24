package CaseStudy.Furama.controller;

import CaseStudy.Furama.model.Facility.Facility;
import CaseStudy.Furama.service.IFacilityService;
import CaseStudy.Furama.service.impl.FacilityServiceImpl;

import java.util.List;
import java.util.Map;

public class FacilityController {
    private static final IFacilityService<Facility> facilityService = new FacilityServiceImpl();

    public List<Facility> displayFacilityListMaintenance() {
        return facilityService.displayFacilityListMaintenance();
    }


    public Map<Facility, Integer> showInfor(String id) {
        return facilityService.showInfor(id);
    }


    public List<Facility> display() {
        return facilityService.display();
    }


    public void add(Facility facility) {
        facilityService.add(facility);
    }


    public void delete(String id) {
        facilityService.delete(id);
    }
}
