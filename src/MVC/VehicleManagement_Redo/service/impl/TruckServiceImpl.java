package MVC.VehicleManagement_Redo.service.impl;

import MVC.VehicleManagement_Redo.model.Manufacturer;
import MVC.VehicleManagement_Redo.model.Truck;
import MVC.VehicleManagement_Redo.repository.impl.TruckRepoImpl;
import MVC.VehicleManagement_Redo.service.IVehicleService;

import java.util.List;

public class TruckServiceImpl implements IVehicleService<Truck> {
    private TruckRepoImpl truckRepo = new TruckRepoImpl();

    @Override
    public void add(Truck truck) {
        truckRepo.add(truck);
    }

    @Override
    public List<Truck> display() {
        return truckRepo.display();
    }

    @Override
    public void remove(Truck truck) {
        truckRepo.remove(truck);
    }

    @Override
    public Truck find(Truck truck) {
        return truck;
    }

    @Override
    public List<Manufacturer> displayManufacturerList() {
        return truckRepo.displayManufacturerList();
    }

    @Override
    public void addManufacturer(Manufacturer manufacturer) {
        truckRepo.addManufacturer(manufacturer);
    }
}
