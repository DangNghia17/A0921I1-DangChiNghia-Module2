package FuramaResort.models;

public abstract class Facility {
    private String ServiceName;
    private double UsableArea;
    private double RentalCost;
    private double MaximumNumberOfPeople;
    private String RentalType;

    public Facility() {
    }

    public double getUsableArea() {
        return UsableArea;
    }

    public void setUsableArea(double usableArea) {
        UsableArea = usableArea;
    }

    public double getRentalCost() {
        return RentalCost;
    }

    public void setRentalCost(double rentalCost) {
        RentalCost = rentalCost;
    }

    public double getMaximumNumberOfPeople() {
        return MaximumNumberOfPeople;
    }

    public void setMaximumNumberOfPeople(double maximumNumberOfPeople) {
        MaximumNumberOfPeople = maximumNumberOfPeople;
    }

    public String getRentalType() {
        return RentalType;
    }

    public void setRentalType(String rentalType) {
        RentalType = rentalType;
    }

    public String getServiceName() {
        return ServiceName;
    }

    public void setServiceName(String serviceName) {
        ServiceName = serviceName;
    }
}
