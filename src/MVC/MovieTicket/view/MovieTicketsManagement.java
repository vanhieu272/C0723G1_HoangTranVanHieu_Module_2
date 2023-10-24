package MVC.MovieTicket.view;

import MVC.MovieTicket.controller.MovieTicketsController;
import MVC.MovieTicket.model.MovieTicket;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MovieTicketsManagement {
    private final MovieTicketsController movieTicketsController = new MovieTicketsController();
    private final String regexID = "^MV-[0-9]{4}";

    private final Scanner scanner = new Scanner(System.in);

    public boolean validate(String string, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }

    public void manage() {
        do {
            showMenu();
            int choice = choiceOption(1, 5);
            switch (choice) {
                case 1:
                    MovieTicket movieTicket = addTicket();
                    if (movieTicket != null) {
                        movieTicketsController.create(movieTicket);
                        System.out.println("Add successful !!");
                    }
                    break;
                case 2:
                    displayTicket();
                    break;
                case 3:
                    String ticketID = removeTicket();
                    if(ticketID != null){
                        movieTicketsController.remove(ticketID);
                        System.out.println("Delete successful!!");
                    }
                    break;
                case 4:
                    List<MovieTicket> movieTickets = movieTicketsController.sortByPrice();
                    if(movieTickets.isEmpty()){
                        System.out.println("List tickets is empty!!");
                    }else {
                        for(MovieTicket movieTicket1 : movieTickets){
                            System.out.println(movieTicket1);
                        }
                    }
                    break;
                case 5:
                    MovieTicket movieTicket1 = editTicket();
                    if (movieTicket1 != null) {
                        movieTicketsController.update(movieTicket1);
                    }
                    break;
            }
        } while (true);
    }


    private void showMenu() {
        System.out.println("====== Movie Ticket Management ======");
        System.out.println("1. Add new ticket");
        System.out.println("2. Display all tickets");
        System.out.println("3. Delete ticket");
        System.out.println("4. Sort ticket (by price)");
        System.out.println("5 .Edit ticket");
    }

    private String inputTicketID() {
        String ticketID;
        do {
            System.out.println("Please enter ticket ID: ");
            ticketID = scanner.nextLine();
            if (!validate(ticketID, regexID)) {
                System.out.println("Ticket ID format not true. Try again!!");
            } else {
                return ticketID;
            }
        } while (true);
    }

    private boolean checkTicketID(String ticketID) {
        List<MovieTicket> movieTickets = movieTicketsController.getAll();
        for (MovieTicket movieTicket : movieTickets) {
            if (movieTicket.getTicketID().equals(ticketID)) {
                return true;
            }
        }
        return false;
    }

    private int choiceOption(int low, int high) {
        int choice = 0;
        do {
            try {
                System.out.println("Enter your choice: ");
                choice = Integer.parseInt(scanner.nextLine());
                if (choice < low || choice > high) {
                    System.out.println("Invalid. Please enter again!!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid !!");
            }
        } while (choice < low || choice > high);
        return choice;
    }

    private String inputMovieName() {
        String movieName;
        do {
            try {
                System.out.println("Enter movie's name: ");
                movieName = scanner.nextLine();
                return movieName;
            } catch (NullPointerException e) {
                System.out.println("Name can't be null");
            }
        } while (true);
    }

    private String chooseTicketPrice() {
        while (true) {
            System.out.println("Choose type of ticket: ");
            System.out.println("1. VIP+COMBO FOOD: 400000");
            System.out.println("2. VIP: 200000");
            System.out.println("3. NORMAL+COMBO FOOD : 300000");
            System.out.println("4. NORMAL: 150000");
            int choice = choiceOption(1, 4);
            switch (choice) {
                case 1:
                    return "400000";
                case 2:
                    return "200000";
                case 3:
                    return "300000";
                case 4:
                    return "150000";
            }
        }
    }

    private String chooseShowing() {

        while (true) {
            System.out.println("Choose show: ");
            System.out.println("1. Show 1");
            System.out.println("2. Show 2");
            System.out.println("3. Show 3");
            System.out.println("4. Show 4");
            int choice = choiceOption(1, 4);
            switch (choice) {
                case 1:
                    return "1";
                case 2:
                    return "2";
                case 3:
                    return "3";
                case 4:
                    return "4";
            }
        }
    }

    private String chooseDate() {

        while (true) {
            System.out.println("Choose day: ");
            System.out.println("1. Sunday");
            System.out.println("2. Monday");
            System.out.println("3. Tuesday");
            System.out.println("4. Wednesday");
            System.out.println("5. Thursday");
            System.out.println("6. Friday");
            System.out.println("7. Saturday");
            int choice = choiceOption(1, 7);
            switch (choice) {
                case 1:
                    return "Sunday";
                case 2:
                    return "Monday";
                case 3:
                    return "Tuesday";
                case 4:
                    return "Wednesday";
                case 5:
                    return "Thursday";
                case 6:
                    return "Friday";
                case 7:
                    return "Saturday";
            }
        }
    }

    private MovieTicket addTicket() {
        String ticketID = inputTicketID();
        if (checkTicketID(ticketID)) {
            System.out.println("This ID is exist");
            return null;
        } else {
            return new MovieTicket(ticketID, inputMovieName(), Float.parseFloat(chooseTicketPrice()), chooseShowing(), chooseDate());
        }
    }

    private void displayTicket() {
        List<MovieTicket> movieTickets = movieTicketsController.getAll();
        if (movieTickets.isEmpty()) {
            System.out.println("List is empty!!");
        } else {
            for (MovieTicket movieTicket : movieTickets) {
                System.out.println(movieTicket);
            }
        }
    }

    private MovieTicket editTicket() {
        String ticketID = inputTicketID();
        List<MovieTicket> movieTickets = movieTicketsController.getAll();
        if (!checkTicketID(ticketID)) {
            System.out.println("ID not found!!");
            return null;
        } else {
            for (MovieTicket movieTicket : movieTickets) {
                if (movieTicket.getTicketID().equals(ticketID)) {
                    do {
                        System.out.println("Choose information you want to edit: ");
                        System.out.println("1. Name");
                        System.out.println("2. Price");
                        System.out.println("3. Showing");
                        System.out.println("4. Date");
                        System.out.println("5. Done");
                        System.out.println("6. Cancel");
                        int choice = choiceOption(1, 6);
                        switch (choice) {
                            case 1:
                                movieTicket.setMovieName(inputMovieName());
                                break;
                            case 2:
                                movieTicket.setPrice(Float.parseFloat(chooseTicketPrice()));
                                break;
                            case 3:
                                movieTicket.setShowing(chooseShowing());
                                break;
                            case 4:
                                movieTicket.setDate(chooseDate());
                                break;
                            case 5:
                                System.out.println("Edited successful!!");
                                return movieTicket;

                            case 6:
                                return null;
                        }
                    } while (true);
                }
            }
        }
        return null;
    }

    private String removeTicket() {
        String ticketID = inputTicketID();
        if (!checkTicketID(ticketID)) {
            System.out.println("ID not found!!");
            return null;
        } else {
                System.out.println("Found ID '" + ticketID + "'");
                System.out.println("Are you sure want to delete this ticket?"
                        + "\n1. Yes"
                        + "\n2. No");
                int choice = choiceOption(1, 2);
                switch (choice) {
                    case 1:
                        return ticketID;
                    case 2:
                        return null;
                }
        }
        return null;
    }
}
