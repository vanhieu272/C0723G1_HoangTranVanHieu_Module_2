package MVC.VehicleManagement_Redo.model;

public class Car extends Vehicle{
    private Integer seats;
    private String typeOfCar;

    public Car(String licensePlate, Manufacturer manufacturerName, int manufacturerYear, String owner, int seats, String typeOfCar) {
        super(licensePlate, manufacturerName, manufacturerYear, owner);
        this.seats = seats;
        this.typeOfCar = typeOfCar;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getTypeOfCar() {
        return typeOfCar;
    }

    public void setTypeOfCar(String typeOfCar) {
        this.typeOfCar = typeOfCar;
    }

    @Override
    public String toString() {
        return "Xe ôtô" + super.toString()
                + ", số chỗ ngồi: " +getSeats()
                + ", kiểu xe: " + getTypeOfCar();
    }
}
