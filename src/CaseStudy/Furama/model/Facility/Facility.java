package CaseStudy.Furama.model.Facility;

public abstract class Facility {
    private String facilityID;
    private String serviceName;
    private float area;
    private float cost;
    private int capacity;
    private String rentalType;

    protected Facility() {
    }

    protected Facility(String facilityID, String serviceName, float area, float cost,
                       int capacity, String rentalType) {
        this.facilityID = facilityID;
        this.serviceName = serviceName;
        this.area = area;
        this.cost = cost;
        this.capacity = capacity;
        this.rentalType = rentalType;
    }

    public String getFacilityID() {
        return facilityID;
    }

    public void setFacilityID(String facilityID) {
        this.facilityID = facilityID;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "facility ID='" + facilityID + '\'' +
                ", facility Name='" + serviceName + '\'' +
                ", area = " + area +
                ", cost = " + cost +
                ", capacity = " + capacity +
                ", rentalType = '" + rentalType + '\'' +
                "}\n";
    }
}
