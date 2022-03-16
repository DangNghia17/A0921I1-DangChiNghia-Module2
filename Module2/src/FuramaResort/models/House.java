package FuramaResort.models;

public class House extends Facility{
    private String RoomStandard;
    private double NumberOfFloors;

    public House() {
    }

    public String getRoomStandard() {
        return RoomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        RoomStandard = roomStandard;
    }

    public double getNumberOfFloors() {
        return NumberOfFloors;
    }

    public void setNumberOfFloors(double numberOfFloors) {
        NumberOfFloors = numberOfFloors;
    }
}
