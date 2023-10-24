package CaseStudy.Furama.repository.impl;

import CaseStudy.Furama.model.Facility.Facility;
import CaseStudy.Furama.model.Facility.House;
import CaseStudy.Furama.model.Facility.Room;
import CaseStudy.Furama.model.Facility.Villa;
import CaseStudy.Furama.repository.IFacilityRepo;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FacilityRepoImpl implements IFacilityRepo<Facility> {
    private static final Map<Facility, Integer> facilityList = new LinkedHashMap<>();

    static {
        facilityList.put(new Villa("VL-0001", "Villa", 50, 500, 10, "2 days", "double room", 32, 3), 2);
        facilityList.put(new House("HO-0002", "House", 40, 250, 5, "a month", "standard room", 4), 5);
        facilityList.put(new Room("RO-0003", "Room", 30, 150, 2, "years", "free laundry"), 6);
    }


    @Override
    public List<Facility> display() {
        List<Facility> facilities = new ArrayList<>();
        for (Map.Entry<Facility, Integer> facility : facilityList.entrySet()) {
            facilities.add(facility.getKey());
        }
        return facilities;
    }

    @Override
    public List<Facility> displayFacilityListMaintenance() {
        List<Facility> facilities = new ArrayList<>();
        for (Map.Entry<Facility, Integer> facility : facilityList.entrySet()) {
            if (facility.getValue() >= 5) {
                facilities.add(facility.getKey());
            } else {
                System.out.println("");
            }
        }
        return facilities;
    }

    @Override
    public Map<Facility, Integer> showInfor(String id) {
        Map<Facility, Integer> showInformation = new LinkedHashMap<>();
        for (Map.Entry<Facility, Integer> facility : facilityList.entrySet()) {
            if (facility.getKey().getFacilityID().equals(id)) {
                showInformation.put(facility.getKey(), facility.getValue());
            }
        }
        return showInformation;
    }

    @Override
    public void add(Facility facility) {
        for (Facility f : facilityList.keySet()) {
            if (f.getFacilityID().equals(facility.getFacilityID())) {
                return;
            }
        }
        facilityList.put(facility, 0);
    }

    @Override
    public void delete(String id) {
        for (Map.Entry<Facility, Integer> facility : facilityList.entrySet()) {
            if (facility.getKey().getFacilityID().equals(id)) {
                facilityList.remove(facility.getKey());
                return;
            }
        }
    }
}
