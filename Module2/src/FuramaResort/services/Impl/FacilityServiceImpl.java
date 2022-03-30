package FuramaResort.services.Impl;

import FuramaResort.models.Facility;
import FuramaResort.models.House;
import FuramaResort.models.Room;
import FuramaResort.models.Villa;
import FuramaResort.services.FacilityService;
import FuramaResort.services.Service;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class FacilityServiceImpl implements FacilityService {
    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> element : facilityIntegerMap.entrySet()) {
            System.out.println("Service" + element.getKey() + "number of times rented " + element.getValue());
        }
    }


    @Override
    public void displayMaintain() {
        for (Map.Entry<Facility, Integer> element : facilityIntegerMap.entrySet()) {
            System.out.println("Service" + element.getKey() + "number of times rented " + element.getValue());
        }
    }

    @Override
    public void addNewVilla() {
        System.out.println("Input  idFacility:  ");
        String idFacility = scanner.nextLine();
        System.out.println("Input serviceName :  ");
        String serviceName = scanner.nextLine();
        System.out.println("Input usableArea :  ");
        double usableArea = Double.parseDouble(scanner.nextLine());
        System.out.println("Input rentalCost :  ");
        double rentalCost = Double.parseDouble(scanner.nextLine());
        System.out.println("Input maximumNumberOfPeople :  ");
        double maximumNumberOfPeople = Double.parseDouble(scanner.nextLine());
        System.out.println("Input rentalType :  ");
        String rentalType = scanner.nextLine();
        System.out.println("Input roomStandard :  ");
        String roomStandard = scanner.nextLine();
        System.out.println("Input poolArea :  ");
        double poolArea = Double.parseDouble(scanner.nextLine());
        System.out.println("Input numberOfFloors :  ");
        double numberOfFloors = Double.parseDouble(scanner.nextLine());

        Villa villa = new Villa(idFacility, serviceName, usableArea, rentalCost, maximumNumberOfPeople, rentalType, roomStandard, poolArea, numberOfFloors);
        facilityIntegerMap.put(villa, 0);
        System.out.println("......Đang thêm villa ");
        System.out.println("....Đã thêm thành công!");
    }

    @Override
    public void addNewHouse() {
        System.out.println("Input  idFacility:  ");
        String idFacility = scanner.nextLine();
        System.out.println("Input serviceName :  ");
        String serviceName = scanner.nextLine();
        System.out.println("Input usableArea :  ");
        double usableArea = Double.parseDouble(scanner.nextLine());
        System.out.println("Input rentalCost :  ");
        double rentalCost = Double.parseDouble(scanner.nextLine());
        System.out.println("Input maximumNumberOfPeople :  ");
        double maximumNumberOfPeople = Double.parseDouble(scanner.nextLine());
        System.out.println("Input rentalType :  ");
        String rentalType = scanner.nextLine();
        System.out.println("Input roomStandard :  ");
        String roomStandard = scanner.nextLine();
        System.out.println("Input numberOfFloors :  ");
        double numberOfFloors = Double.parseDouble(scanner.nextLine());


        House house = new House(idFacility, serviceName, usableArea, rentalCost, maximumNumberOfPeople, rentalType, roomStandard, numberOfFloors);
        facilityIntegerMap.put(house, 0);
        System.out.println("......Đang thêm house ");
        System.out.println("....Đã thêm thành công!");
    }

    @Override
    public void addNewRoom() {
        System.out.println("Input  idFacility:  ");
        String idFacility = scanner.nextLine();
        System.out.println("Input serviceName :  ");
        String serviceName = scanner.nextLine();
        System.out.println("Input usableArea :  ");
        double usableArea = Double.parseDouble(scanner.nextLine());
        System.out.println("Input rentalCost :  ");
        double rentalCost = Double.parseDouble(scanner.nextLine());
        System.out.println("Input maximumNumberOfPeople :  ");
        double maximumNumberOfPeople = Double.parseDouble(scanner.nextLine());
        System.out.println("Input rentalType :  ");
        String rentalType = scanner.nextLine();
        System.out.println("Input freeService :  ");
        String freeService = scanner.nextLine();


        Room room = new Room(idFacility, serviceName, usableArea, rentalCost, maximumNumberOfPeople, rentalType, freeService);
        facilityIntegerMap.put(room, 0);
        System.out.println("......Đang thêm room ");
        System.out.println("....Đã thêm thành công!");
    }
}
