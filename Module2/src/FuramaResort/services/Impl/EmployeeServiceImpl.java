package FuramaResort.services.Impl;

import FuramaResort.models.Employee;
import FuramaResort.services.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private static List<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
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
        System.out.println("Input qualification :  ");
        String qualification = scanner.nextLine();
        System.out.println("Input position :  ");
        String position = scanner.nextLine();
        System.out.println("Input salary :  ");
        double salary = Double.parseDouble(scanner.nextLine());
        Employee employee = new Employee(id, fullName, dateOfBirth, gender, idCard, phoneNumber, email, qualification, position, salary);
        employeeList.add(employee);
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
        System.out.println("Input qualification :  ");
        String qualification = scanner.nextLine();
        System.out.println("Input position :  ");
        String position = scanner.nextLine();
        System.out.println("Input salary :  ");
        double salary = Double.parseDouble(scanner.nextLine());
        Employee employee = new Employee(id, fullName, dateOfBirth, gender, idCard, phoneNumber, email, qualification, position, salary);
        employeeList.set((id - 1), employee); // chưa biết set theo id mong muốn
    }

    @Override
    public void delete() {
        int deleteNum = Integer.parseInt(scanner.nextLine());
        System.out.println("Input position Employee you want to delete :");
        employeeList.remove(deleteNum - 1);// chưa biết delete theo id mong muốn
    }
}
