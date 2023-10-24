package CaseStudy.Furama.model.Facility;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String facilityID, String serviceName, float area, float cost,
                int capacity, String rentalType, String freeService) {
        super(facilityID, serviceName, area, cost, capacity, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeService='" + getFreeService() + '\'' +
                ", facilityID='" + getFacilityID() + '\'' +
                ", serviceName='" + getServiceName() + '\'' +
                ", area=" + getArea() +
                ", cost=" + getCost() +
                ", capacity=" + getCapacity() +
                ", rentalType='" + getRentalType() + '\'' +
                "}\n";
    }
}
