package MVC.VehicleManagement_Redo.service.impl;

import MVC.VehicleManagement_Redo.model.Manufacturer;
import MVC.VehicleManagement_Redo.model.Motor;
import MVC.VehicleManagement_Redo.repository.impl.MotorRepoImpl;
import MVC.VehicleManagement_Redo.service.IVehicleService;

import java.util.List;

public class MotorServiceImpl implements IVehicleService<Motor> {
    private MotorRepoImpl motorRepo = new MotorRepoImpl();
    @Override
    public void add(Motor motor) {
        motorRepo.add(motor);
    }

    @Override
    public List<Motor> display() {
        return motorRepo.display();
    }

    @Override
    public void remove(Motor motor) {
        motorRepo.remove(motor);
    }

    @Override
    public Motor find(Motor motor) {
        return motorRepo.find(motor);
    }

    @Override
    public List<Manufacturer> displayManufacturerList() {
        return motorRepo.displayManufacturerList();
    }

    @Override
    public void addManufacturer(Manufacturer manufacturer) {
        motorRepo.addManufacturer(manufacturer);
    }
}
