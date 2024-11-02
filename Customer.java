public class Customer implements CommonFunctions {
    private String custId;
    private String name;
    private String address;
    private int phNo;
    private int age;

    public Customer(String custId, String name, String address, int phNo, int age) {
        this.custId = custId;
        this.name = name;
        this.address = address;
        this.phNo = phNo;
        this.age = age;
    }

    public void addDetails(String address, int phNo) {
        this.address = address;
        this.phNo = phNo;
    }

    public void modifyDetails(String address, int phNo) {
        this.address = address;
        this.phNo = phNo;
    }

    // Getter for custId
    public String getCustomerId() {
        return custId;
    }

    // Implementing interface methods
    @Override
    public void searchTicket() {
        System.out.println("Searching for a ticket...");
    }

    @Override
    public void bookTicket() {
        System.out.println("Booking a ticket...");
    }

    @Override
    public void cancelTicket() {
        System.out.println("Canceling a ticket...");
    }

    @Override
    public void makePayment() {
        System.out.println("Making payment...");
    }

    @Override
    public void fillDetail() {
        System.out.println("Filling details...");
    }
    @Override
    public String toString() {
        return "Customer ID: " + custId + ", Name: " + name + ", Address: " + address + ", Phone: " + phNo + ", Age: " + age;
    }

}
