package FuramaResort.services.Impl;

import FuramaResort.models.Customer;
import FuramaResort.models.Employee;
import FuramaResort.services.CustomerService;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private static List<Customer> customerList = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Customer customer : customerList
        ) {
            System.out.println(customer.toString());
        }
    }

    @Override
    public void addNew() {
        System.out.println("Input id :  ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Input fullName :  ");
        String fullName = scanner.nextLine();
        System.out.println("Input dateOfBirth :  ");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Input gender :  ");
        String gender = scanner.nextLine();
        System.out.println("Input idCard :  ");
        double idCard = Double.parseDouble(scanner.nextLine());
        System.out.println("Input phoneNumber :  ");
        double phoneNumber = Double.parseDouble(scanner.nextLine());
        System.out.println("Input email :  ");
        String email = scanner.nextLine();
        System.out.println("Input customerType :  ");
        String customerType = scanner.nextLine();
        System.out.println("Input address :  ");
        String address = scanner.nextLine();
        Customer customer = new Customer(id, fullName, dateOfBirth, gender, idCard, phoneNumber, email, customerType, address);
        customerList.add(customer);
        System.out.println("......Đang thêm");
        System.out.println("....Đã thêm thành công!");
    }

    @Override
    public void edit() {
        display();
        System.out.println("Input id edit:  ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Input fullName :  ");
        String fullName = scanner.nextLine();
        System.out.println("Input dateOfBirth :  ");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Input gender :  ");
        String gender = scanner.nextLine();
        System.out.println("Input idCard :  ");
        double idCard = Double.parseDouble(scanner.nextLine());
        System.out.println("Input phoneNumber :  ");
        double phoneNumber = Double.parseDouble(scanner.nextLine());
        System.out.println("Input email :  ");
        String email = scanner.nextLine();
        System.out.println("Input customerType :  ");
        String customerType = scanner.nextLine();
        System.out.println("Input address :  ");
        String address = scanner.nextLine();
        Customer customer = new Customer(id, fullName, dateOfBirth, gender, idCard, phoneNumber, email, customerType, address);
        customerList.set((id - 1), customer); // chưa biết set theo id mong muốn
        System.out.println("......Đang chỉnh sửa");
        System.out.println("....Đã chỉnh sửa thành công!");
    }


    @Override
    public void delete() {
        int deleteNum = Integer.parseInt(scanner.nextLine());
        System.out.println("Input position Employee you want to delete :");
        customerList.remove(deleteNum - 1);// chưa biết delete theo id mong muốn
    }
}