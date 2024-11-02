public class BookingCounter {
    public void requestTicket(Customer customer, Ticket ticket) {
        System.out.println("Processing ticket request for customer: " + customer);
    }

    public void requestTicket(Agent agent, Ticket ticket) {
        System.out.println("Processing ticket request for agent: " + agent);
    }
}
