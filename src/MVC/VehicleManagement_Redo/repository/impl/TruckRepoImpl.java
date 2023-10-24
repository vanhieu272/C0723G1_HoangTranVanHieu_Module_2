package MVC.VehicleManagement_Redo.repository.impl;

import MVC.VehicleManagement_Redo.model.Manufacturer;
import MVC.VehicleManagement_Redo.model.Truck;
import MVC.VehicleManagement_Redo.repository.IVehicleRepo;

import java.util.ArrayList;
import java.util.List;

public class TruckRepoImpl implements IVehicleRepo<Truck> {
    private final List<Truck> truckList = new ArrayList<>();
    private final List<Manufacturer> truckManufacturerList = new ArrayList<>();

    @Override
    public void add(Truck truck) {
        truckList.add(truck);
    }

    @Override
    public List<Truck> display() {
        return truckList;
    }

    @Override
    public void remove(Truck truck) {
        truckList.remove(truck);
    }

    @Override
    public Truck find(Truck truck) {
        return truck;
    }

    @Override
    public List<Manufacturer> displayManufacturerList() {
        return truckManufacturerList;
    }

    @Override
    public void addManufacturer(Manufacturer manufacturer) {
        truckManufacturerList.add(manufacturer);
    }
}
