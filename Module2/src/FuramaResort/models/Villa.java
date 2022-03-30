package FuramaResort.models;

public class Villa extends Facility{
    private String RoomStandard;
    private double PoolArea;
    private double NumberOfFloors;

    public Villa() {
    }

    public Villa(String roomStandard, double poolArea, double numberOfFloors) {
        RoomStandard = roomStandard;
        PoolArea = poolArea;
        NumberOfFloors = numberOfFloors;
    }

    public Villa(String idFacility, String serviceName, double usableArea, double rentalCost, double maximumNumberOfPeople, String rentalType, String roomStandard, double poolArea, double numberOfFloors) {
        super(idFacility, serviceName, usableArea, rentalCost, maximumNumberOfPeople, rentalType);
        RoomStandard = roomStandard;
        PoolArea = poolArea;
        NumberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return RoomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        RoomStandard = roomStandard;
    }

    public double getPoolArea() {
        return PoolArea;
    }

    public void setPoolArea(double poolArea) {
        PoolArea = poolArea;
    }

    public double getNumberOfFloors() {
        return NumberOfFloors;
    }

    public void setNumberOfFloors(double numberOfFloors) {
        NumberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "Villa{" + super.toString() +
                "RoomStandard='" + RoomStandard + '\'' +
                ", PoolArea=" + PoolArea +
                ", NumberOfFloors=" + NumberOfFloors +
                '}';
    }
}
