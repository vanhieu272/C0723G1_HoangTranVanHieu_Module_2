package MVC.VehicleManagement_Redo.controller;

import MVC.VehicleManagement_Redo.model.Manufacturer;
import MVC.VehicleManagement_Redo.model.Motor;
import MVC.VehicleManagement_Redo.model.Truck;
import MVC.VehicleManagement_Redo.service.impl.TruckServiceImpl;

import java.util.List;

public class TruckController {
    private final TruckServiceImpl truckService = new TruckServiceImpl();

    public void add(Truck truck){
        truckService.add(truck);
    }

    public List<Truck> display(){
        return truckService.display();
    }

    public void remove(Truck truck){
        truckService.remove(truck);
    }

    public Truck find(Truck truck){
        return truckService.find(truck);
    }

    public List<Manufacturer> displayManufacturerList(){
        return truckService.displayManufacturerList();
    }

    public void addManufacturer(Manufacturer manufacturer){
        truckService.addManufacturer(manufacturer);
    }
}
