package FuramaResort.models;

public class Employee extends Person {
    private String qualification;
    private String position;
    private double salary;

    public Employee() {
    }

    public Employee(String qualification, String position, double salary) {
        this.qualification = qualification;
        this.position = position;
        this.salary = salary;
    }

    public Employee(double id, String fullName, String dateOfBirth, String gender, double idCard, double phoneNumber, String email, String qualification, String position, double salary) {
        super(id, fullName, dateOfBirth, gender, idCard, phoneNumber, email);
        this.qualification = qualification;
        this.position = position;
        this.salary = salary;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() +
                "qualification='" + qualification + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
