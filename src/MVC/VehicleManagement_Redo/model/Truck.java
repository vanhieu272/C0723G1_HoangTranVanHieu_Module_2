package MVC.VehicleManagement_Redo.model;

public class Truck extends Vehicle{
    private int tonnage;

    public Truck(String licensePlate, Manufacturer manufacturer, int manufactureYear, String owner, int tonnage) {
        super(licensePlate, manufacturer, manufactureYear, owner);
        this.tonnage = tonnage;
    }

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public String toString() {
        return "Xe tải" + super.toString()
                +", trọng tải: " + getTonnage();
    }
}
