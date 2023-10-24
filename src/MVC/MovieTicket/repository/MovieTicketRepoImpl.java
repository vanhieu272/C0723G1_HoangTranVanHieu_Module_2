package MVC.MovieTicket.repository;

import MVC.MovieTicket.model.MovieTicket;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MovieTicketRepoImpl implements IMovieTicketRepo {
    final String COMMA = ",";
    private final String LIST_TICKET_PATH = "D:\\Codegym\\module-2\\src\\MVC\\MovieTicket\\data\\list_tickets.csv";

    @Override
    public void create(MovieTicket movieTicket) {
        boolean flag = false;
        List<MovieTicket> movieTickets = readTicketsFromFile();
        for(MovieTicket movieTicket1 : movieTickets){
            if(movieTicket1.getTicketID().equals(movieTicket.getTicketID())){
                flag = true;
                break;
            }
        }
        if(!flag){
            movieTickets.add(movieTicket);
        }
        writeTicketsToFile(movieTickets);
    }

    @Override
    public List<MovieTicket> getAll() {
        return readTicketsFromFile();
    }

    @Override
    public void remove(String ticketID) {
        List<MovieTicket> movieTickets = readTicketsFromFile();
        for(MovieTicket movieTicket1 : movieTickets){
            if(movieTicket1.getTicketID().equals(ticketID)){
                movieTickets.remove(movieTicket1);
                break;
            }
        }
        writeTicketsToFile(movieTickets);
    }

    @Override
    public void update(MovieTicket movieTicket) {
        List<MovieTicket> movieTickets = readTicketsFromFile();
        for(MovieTicket movieTicket1 : movieTickets){
            if(movieTicket1.getTicketID().equals(movieTicket.getTicketID())){
                movieTicket1.setMovieName(movieTicket.getMovieName());
                movieTicket1.setPrice(movieTicket.getPrice());
                movieTicket1.setShowing(movieTicket.getShowing());
                movieTicket1.setDate(movieTicket.getDate());
                break;
            }
        }
        writeTicketsToFile(movieTickets);
    }

    @Override
    public List<MovieTicket> sortByPrice() {
        List<MovieTicket> movieTickets = readTicketsFromFile();
        List<MovieTicket> ascendingOrder = new ArrayList<>();
        movieTickets.sort((o1, o2) -> {
            if (o1.getPrice() < o2.getPrice()) {
                return -1;
            } else if (o1.getPrice() == o2.getPrice()) {
                return 0;
            } else {
                return 1;
            }
        });
        ascendingOrder.addAll(movieTickets);
        return ascendingOrder;
    }


    public List<String> readFile(String pathName) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            File file = new File(pathName);
            if (!file.exists()) {
                return new ArrayList<>();
            }
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            List<String> data = new ArrayList<>();
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                data.add(str);
            }
            return data;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void writeFile(String pathName, List<String> data) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            File file = new File(pathName);
            if (!file.exists()) {
                file.createNewFile();
            }
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String str : data) {
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


    public List<String> convertOBJToString(List<MovieTicket> movieTickets) {
        List<String> data = new ArrayList<>();
        for (MovieTicket movieTicket : movieTickets) {
            data.add(movieTicket.getTicketID()
                    + COMMA + movieTicket.getMovieName()
                    + COMMA + movieTicket.getPrice()
                    + COMMA + movieTicket.getShowing()
                    + COMMA + movieTicket.getDate());
        }
        return data;
    }

    public List<MovieTicket> convertStringToObj(List<String> data) {
        List<MovieTicket> tickets = new ArrayList<>();
        for (String str : data) {
            String[] splittedStr = str.split(COMMA);
            tickets.add(new MovieTicket(splittedStr[0], splittedStr[1], Float.parseFloat(splittedStr[2]),
                    splittedStr[3], splittedStr[4]));
        }
        return tickets;
    }

    public List<MovieTicket> readTicketsFromFile(){
        List<String> data = readFile(LIST_TICKET_PATH);
        return convertStringToObj(data);
    }

    public void writeTicketsToFile(List<MovieTicket> movieTickets){
        List<String> data = convertOBJToString(movieTickets);
        writeFile(LIST_TICKET_PATH,data);
    }
}

