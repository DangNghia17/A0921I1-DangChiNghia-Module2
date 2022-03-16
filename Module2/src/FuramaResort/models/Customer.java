package FuramaResort.models;

public class Customer extends Person {
    private String CustomerType;
    private String address;

    public Customer() {
    }

    public String getCustomerType() {
        return CustomerType;
    }

    public void setCustomerType(String customerType) {
        CustomerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
