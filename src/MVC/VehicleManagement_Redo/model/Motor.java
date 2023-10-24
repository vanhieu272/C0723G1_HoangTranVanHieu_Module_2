package MVC.VehicleManagement_Redo.model;

public class Motor extends Vehicle {
    private int wattage;

    public Motor(String licensePlate, Manufacturer manufacturer, int manufactureYear, String owner, int wattage) {
        super(licensePlate, manufacturer, manufactureYear, owner);
        this.wattage = wattage;
    }

    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    public String toString() {
        return "Xe máy" + super.toString()
                + ", công suất: " + getWattage();
    }
}
