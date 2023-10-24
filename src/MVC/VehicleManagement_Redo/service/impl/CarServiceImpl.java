package MVC.VehicleManagement_Redo.service.impl;

import MVC.VehicleManagement_Redo.model.Car;
import MVC.VehicleManagement_Redo.model.Manufacturer;
import MVC.VehicleManagement_Redo.repository.IVehicleRepo;
import MVC.VehicleManagement_Redo.repository.impl.CarRepoImpl;
import MVC.VehicleManagement_Redo.service.IVehicleService;

import java.util.List;

public class CarServiceImpl implements IVehicleService<Car> {
      private final CarRepoImpl carRepo = new CarRepoImpl();

    @Override
    public void add(Car car) {
        carRepo.add(car);
    }

    @Override
    public List<Car> display() {
        return carRepo.display();
    }

    @Override
    public void remove(Car car) {
        carRepo.remove(car);
    }

    @Override
    public Car find(Car car) {
        return carRepo.find(car);
    }

    @Override
    public List<Manufacturer> displayManufacturerList() {
        return carRepo.displayManufacturerList();
    }
    @Override
    public void addManufacturer(Manufacturer manufacturer) {
        carRepo.addManufacturer(manufacturer);
    }
}
