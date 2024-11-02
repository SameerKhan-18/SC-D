import java.util.Date;

public class Ticket {
    private String source;
    private String destination;
    private Date dateOfJourney;
    private String time;
    private String busNo;
    private String seatNo;

    public Ticket(String source, String destination, Date dateOfJourney, String time, String busNo, String seatNo) {
        this.source = source;
        this.destination = destination;
        this.dateOfJourney = dateOfJourney;
        this.time = time;
        this.busNo = busNo;
        this.seatNo = seatNo;
    }

    // Getters and Setters
    public String getSource() { return source; }
    public String getDestination() { return destination; }
    public Date getDateOfJourney() { return dateOfJourney; }
    public String getTime() { return time; }
    public String getBusNo() { return busNo; }
    public String getSeatNo() { return seatNo; }
}
