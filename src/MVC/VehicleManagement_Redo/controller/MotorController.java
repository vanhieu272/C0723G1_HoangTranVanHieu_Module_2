package MVC.VehicleManagement_Redo.controller;

import MVC.VehicleManagement_Redo.model.Manufacturer;
import MVC.VehicleManagement_Redo.model.Motor;
import MVC.VehicleManagement_Redo.service.impl.MotorServiceImpl;

import java.util.List;

public class MotorController {
    private final MotorServiceImpl motorService = new MotorServiceImpl();

    public void add(Motor motor){
        motorService.add(motor);
    }

    public List<Motor> display(){
        return motorService.display();
    }

    public void remove(Motor motor){
        motorService.remove(motor);
    }

    public Motor find(Motor motor){
        return motorService.find(motor);
    }

    public List<Manufacturer> displayManufacturerList(){
        return motorService.displayManufacturerList();
    }

    public void addManufacturer(Manufacturer manufacturer){
        motorService.addManufacturer(manufacturer);
    }
}
