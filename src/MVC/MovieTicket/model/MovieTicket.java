package MVC.MovieTicket.model;

public class MovieTicket {
    private String ticketID;
    private String movieName;
    private float price;
    private String showing;
    private String date;

    public MovieTicket(String ticketID, String movieName, float price, String showing, String date) {
        this.ticketID = ticketID;
        this.movieName = movieName;
        this.price = price;
        this.showing = showing;
        this.date = date;
    }

    public String getTicketID() {
        return ticketID;
    }

    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getShowing() {
        return showing;
    }

    public void setShowing(String showing) {
        this.showing = showing;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "MovieTicket{" +
                "ticketID='" + ticketID + '\'' +
                ", movieName='" + movieName + '\'' +
                ", price=" + price +
                ", showing='" + showing + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
