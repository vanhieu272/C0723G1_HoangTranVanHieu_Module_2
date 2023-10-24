package CaseStudy.Furama.service.impl;

import CaseStudy.Furama.model.Facility.Facility;
import CaseStudy.Furama.repository.IFacilityRepo;
import CaseStudy.Furama.repository.impl.FacilityRepoImpl;
import CaseStudy.Furama.service.IFacilityService;

import java.util.List;
import java.util.Map;

public class FacilityServiceImpl implements IFacilityService<Facility> {

    private static final IFacilityRepo<Facility> facilityRepo = new FacilityRepoImpl();

    @Override
    public List<Facility> displayFacilityListMaintenance() {
        return facilityRepo.displayFacilityListMaintenance();
    }

    @Override
    public Map<Facility, Integer> showInfor(String id) {
        return facilityRepo.showInfor(id);
    }

    @Override
    public List<Facility> display() {
        return facilityRepo.display();
    }

    @Override
    public void add(Facility facility) {
        facilityRepo.add(facility);
    }

    @Override
    public void delete(String id) {
        facilityRepo.delete(id);
    }
}
