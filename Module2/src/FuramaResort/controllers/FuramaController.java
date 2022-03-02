package FuramaResort.controllers;

import java.util.Scanner;

public class FuramaController {
    public void displayMainMenu() {
        Scanner sc1 = new Scanner(System.in);
        boolean stopMenu = true;
        do {
            System.out.println("" +
                    "1.Employee Management\n" +
                    "2.Customer Management\n" +
                    "3.Facility Management\n" +
                    "4.Booking Management\n" +
                    "5.Promotion Management\n" +
                    "6.Exit");
            int chooseMenu = Integer.parseInt(sc1.nextLine());
            switch (chooseMenu) {
                case 1:
                    System.out.println(
                            "1.Display list employees\n" +
                                    "2.Add new employee\n" +
                                    "3.Edit employee \n" +
                                    "4.Return main menu\n ");
                    break;
                case 2:
                    System.out.println(
                            "1.Display list customers\n" +
                                    "2.Add new customer\n" +
                                    "3.Edit customer\n" +
                                    "4.Return main menu\n"
                    );
                    break;
                case 3:
                    System.out.println("" +
                            "1.Display list facility\n" +
                            "2.Add new facility\n" +
                            "3.Display list facility maintenance\n" +
                            "4.Return main menu\n");
                    break;
                case 4:
                    System.out.println("" +
                            "1.Add new booking\n" +
                            "2.Display list booking\n" +
                            "3.Create new constracts\n" +
                            "4.Display list contracts\n" +
                            "5.Edit contracts\n" +
                            "6.Return main menu\n");
                    break;
                case 5:
                    System.out.println("" +
                            "1.Display list customers use service\n" +
                            "2.Display list customers get voucher\n" +
                            "3.Return main menu\n");
                    break;
                case 6:
                    System.exit(6);
                default:
                    stopMenu = false;
            }
        } while (stopMenu);
    }
        //main thử
    public static void main(String[] args) {
        FuramaController f1 = new FuramaController();
        f1.displayMainMenu();
    }
}
