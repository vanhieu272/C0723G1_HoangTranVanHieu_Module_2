package MVC.MovieTicket;

import MVC.MovieTicket.view.MovieTicketsManagement;

public class MainApp {
    private static final MovieTicketsManagement movieTicketsManagement = new MovieTicketsManagement();
    public static void main(String[] args) {
           movieTicketsManagement.manage();
    }
}
