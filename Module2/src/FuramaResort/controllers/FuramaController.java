package FuramaResort.controllers;

import java.util.Scanner;

public class FuramaController {
    /**
     * Test main
     **/
    public static void main(String[] args) {
        displayMainMenu();
    }

    /**
     * ---------------------------
     **/
    public static void displayMainMenu() {
        boolean check = true;

        while (check) {
            System.out.println("" +
                    "1.Employee Management\n" +
                    "2.Customer Management\n" +
                    "3.Facility Management\n" +
                    "4.Booking Management\n" +
                    "5.Promotion Management\n" +
                    "6.Exit");
            Scanner sc1 = new Scanner(System.in);
            int chooseMenu = sc1.nextInt();
            switch (chooseMenu) {
                case 1:
                    displayEmployeeManagement();
                    break;
                case 2:
                    displayCustomerManagement();
                    break;
                case 3:
                    displayFacilityManagement();
                    break;
                case 4:
                    displayBookingManagement();
                    break;
                case 5:
                    displayPromotionManagement();
                    break;
                case 6:
                    System.exit(6);
                default:
                    check = false;
            }
        }
    }

    public static void displayEmployeeManagement() {
        boolean check = true;
        while (check) {
            System.out.println(
                    "1.Display list employees\n" +
                            "2.Add new employee\n" +
                            "3.Edit employee \n" +
                            "4.Return main menu\n ");
            Scanner sc1 = new Scanner(System.in);
            int chooseMenu = sc1.nextInt();
            switch (chooseMenu) {
                case 1:
            }

        }
    }

    public static void displayCustomerManagement() {
        boolean check = true;
        while (check) {
            System.out.println(
                    "1.Display list customers\n" +
                            "2.Add new customer\n" +
                            "3.Edit customer\n" +
                            "4.Return main menu\n");
            break;

        }
    }

    public static void displayFacilityManagement() {
        boolean check = true;
        while (check) {
            System.out.println("" +
                    "1.Display list facility\n" +
                    "2.Add new facility\n" +
                    "3.Display list facility maintenance\n" +
                    "4.Return main menu\n");
            break;
        }

    }

    public static void displayBookingManagement() {
        boolean check = true;
        while (check) {
            System.out.println("" +
                    "1.Add new booking\n" +
                    "2.Display list booking\n" +
                    "3.Create new constracts\n" +
                    "4.Display list contracts\n" +
                    "5.Edit contracts\n" +
                    "6.Return main menu\n");
            break;
        }
    }

    public static void displayPromotionManagement() {
        boolean check = true;
        while (check) {
            System.out.println("" +
                    "1.Display list customers use service\n" +
                    "2.Display list customers get voucher\n" +
                    "3.Return main menu\n");
            break;
        }
    }
}
