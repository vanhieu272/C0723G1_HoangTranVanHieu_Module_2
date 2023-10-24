package MVC.VehicleManagement_Redo.repository.impl;

import MVC.VehicleManagement.model.HangSanXuat;
import MVC.VehicleManagement_Redo.model.Car;
import MVC.VehicleManagement_Redo.model.Manufacturer;
import MVC.VehicleManagement_Redo.repository.IVehicleRepo;
import java.util.ArrayList;
import java.util.List;

public class CarRepoImpl implements IVehicleRepo<Car> {
    private final List<Car> carList = new ArrayList<>();
    private final List<Manufacturer> carManuafacturerList = new ArrayList<>();


    @Override
    public void add(Car car) {
       this.carList.add(car);
    }

    @Override
    public List<Car> display() {
        return this.carList;
    }

    @Override
    public void remove(Car car) {
        this.carList.remove(car);
    }

    @Override
    public Car find(Car car) {
        return car;
    }

    @Override
    public List<Manufacturer> displayManufacturerList() {
        return carManuafacturerList;
    }

    public void addManufacturer(Manufacturer manufacturer){
        carManuafacturerList.add(manufacturer);
    }
}
