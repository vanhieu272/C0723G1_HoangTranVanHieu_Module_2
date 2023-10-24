package CaseStudy.Furama.model.Facility;

public class House extends Facility {
    private String standar;
    private int floorNumber;

    public House() {
    }

    public House(String facilityID, String serviceName, float area, float cost,
                 int capacity, String rentalType, String standar, int floorNumber) {
        super(facilityID, serviceName, area, cost, capacity, rentalType);
        this.standar = standar;
        this.floorNumber = floorNumber;
    }

    public String getStandar() {
        return standar;
    }

    public void setStandar(String standar) {
        this.standar = standar;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    @Override
    public String toString() {
        return "House{" +
                "standar='" + getStandar() + '\'' +
                ", floorNumber='" + getFloorNumber() + '\'' +
                ", facilityID='" + getFacilityID() + '\'' +
                ", facilityName='" + getServiceName() + '\'' +
                ", area=" + getArea() +
                ", cost=" + getCost() +
                ", capacity=" + getCapacity() +
                ", rentalType='" + getRentalType() + '\'' +
                "}\n";
    }
}
