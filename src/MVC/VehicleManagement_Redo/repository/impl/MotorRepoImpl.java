package MVC.VehicleManagement_Redo.repository.impl;

import MVC.VehicleManagement_Redo.model.Car;
import MVC.VehicleManagement_Redo.model.Manufacturer;
import MVC.VehicleManagement_Redo.model.Motor;
import MVC.VehicleManagement_Redo.repository.IVehicleRepo;

import java.util.ArrayList;
import java.util.List;

public class MotorRepoImpl implements IVehicleRepo<Motor> {
    private final List<Motor> motorList = new ArrayList<>();
    private final List<Manufacturer> motorManuafacturerList = new ArrayList<>();


    @Override
    public void add(Motor motor) {
        this.motorList.add(motor);
    }

    @Override
    public List<Motor> display() {
        return this.motorList;
    }

    @Override
    public void remove(Motor motor) {
        this.motorList.remove(motor);
    }

    @Override
    public Motor find(Motor motor) {
        return motor;
    }

    @Override
    public List<Manufacturer> displayManufacturerList() {
        return motorManuafacturerList;
    }

    public void addManufacturer(Manufacturer manufacturer) {
        motorManuafacturerList.add(manufacturer);
    }

}
