package CaseStudy.Furama.model.Facility;

public class Villa extends Facility {
    private String standard;
    private float poolArea;
    private int floorNumber;

    public Villa() {
    }

    public Villa(String facilityID, String serviceName, float area, float cost, int capacity,
                 String rentalType, String standard, float poolArea, int floorNumber) {
        super(facilityID, serviceName, area, cost, capacity, rentalType);
        this.standard = standard;
        this.poolArea = poolArea;
        this.floorNumber = floorNumber;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public float getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(float poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "standard='" + getStandard() + '\'' +
                ", poolArea=" + getPoolArea() +
                ", floorNumber=" + getFloorNumber() +
                ", facilityID='" + getFacilityID() + '\'' +
                ", serviceName='" + getServiceName() + '\'' +
                ", area=" + getArea() +
                ", cost=" + getCost() +
                ", capacity=" + getCapacity() +
                ", rentalType='" + getRentalType() + '\'' +
                "}\n";
    }
}
