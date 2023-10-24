package MVC.VehicleManagement_Redo.service;

import MVC.VehicleManagement_Redo.model.Manufacturer;

import java.util.List;

public interface IVehicleService<E> {
    void add(E e);

    List<E> display();

    void remove(E e);

    E find(E e);

    List<Manufacturer> displayManufacturerList();

    void addManufacturer(Manufacturer manufacturer);
}
