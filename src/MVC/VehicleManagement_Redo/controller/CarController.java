package MVC.VehicleManagement_Redo.controller;

import MVC.VehicleManagement_Redo.model.Manufacturer;
import MVC.VehicleManagement_Redo.service.impl.CarServiceImpl;
import MVC.VehicleManagement_Redo.model.Car;

import java.util.List;

public class CarController {
   private final CarServiceImpl carService = new CarServiceImpl();

    public void add(Car car){
        carService.add(car);
    }

    public List<Car> display(){
        return carService.display();
    }

    public void remove(Car car){
        carService.remove(car);
    }

    public Car find(Car car){
        return carService.find(car);
    }

    public List<Manufacturer> displayManufacturerList(){
       return carService.displayManufacturerList();
    }

    public void addManufacturer(Manufacturer manufacturer){
        carService.addManufacturer(manufacturer);
    }
}
