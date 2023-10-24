package MVC.VehicleManagement_Redo.repository;

import MVC.VehicleManagement.model.HangSanXuat;
import MVC.VehicleManagement_Redo.model.Manufacturer;
import MVC.VehicleManagement_Redo.model.Vehicle;

import java.util.List;

public interface IVehicleRepo<E> {
    void add(E e);

    List<E> display();

    void remove(E e);

    E find(E e);

    List<Manufacturer> displayManufacturerList();

    void addManufacturer(Manufacturer manufacturer);
}
