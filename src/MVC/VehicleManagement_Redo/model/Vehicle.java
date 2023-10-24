package MVC.VehicleManagement_Redo.model;

public abstract class Vehicle {
    private String licensePlate;
    private Manufacturer manufacturer;
    private int manufactureYear;
    private String owner;

    public Vehicle(String licensePlate, Manufacturer manufacturer, int manufactureYear, String owner) {
        this.licensePlate = licensePlate;
        this.manufacturer = manufacturer;
        this.manufactureYear = manufactureYear;
        this.owner = owner;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return ", biển kiểm soát: " + getLicensePlate()
                + getManufacturer()
                +", năm sản xuất: " + getManufactureYear()
                +", chủ sở hữu: " + getOwner();
    }
}
