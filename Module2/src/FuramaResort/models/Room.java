package FuramaResort.models;

public class Room extends Facility{
    private String FreeService;

    public Room() {
    }

    public String getFreeService() {
        return FreeService;
    }

    public void setFreeService(String freeService) {
        FreeService = freeService;
    }
}
