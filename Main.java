import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("C001", "Alice", "123 Street", 1234567890, 30);
        Agent agent = new Agent(101, "Bob");
        BookingCounter bookingCounter = new BookingCounter();
        Ticket ticket = new Ticket("CityA", "CityB", new Date(), "10:00 AM", "Bus101", "A1");

        customer.searchTicket();
        agent.bookTicket();
        bookingCounter.requestTicket(customer, ticket); // Now prints customer details in a readable format

        Refund refund = new Refund(100.5f, customer.getCustomerId());
        refund.refundAmount();
    }
}
