package FuramaResort.models;

public class Villa extends Facility{
    private String RoomStandard;
    private double PoolArea;
    private double NumberOfFloors;

    public Villa() {
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
}
