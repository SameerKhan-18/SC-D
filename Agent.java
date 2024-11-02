public class Agent implements CommonFunctions {
    private int id;
    private String name;

    public Agent(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Implementing interface methods
    @Override
    public void searchTicket() {
        System.out.println("Agent searching for a ticket...");
    }

    @Override
    public void bookTicket() {
        System.out.println("Agent booking a ticket...");
    }

    @Override
    public void cancelTicket() {
        System.out.println("Agent canceling a ticket...");
    }

    @Override
    public void makePayment() {
        System.out.println("Agent making payment...");
    }

    @Override
    public void fillDetail() {
        System.out.println("Agent filling details...");
    }
    @Override
    public String toString() {
        return "Agent ID: " + id + ", Name: " + name;
    }
}