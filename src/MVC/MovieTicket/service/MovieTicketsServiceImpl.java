package MVC.MovieTicket.service;

import MVC.MovieTicket.model.MovieTicket;
import MVC.MovieTicket.repository.IMovieTicketRepo;
import MVC.MovieTicket.repository.MovieTicketRepoImpl;

import java.util.List;

public class MovieTicketsServiceImpl implements IMovieTicketsService{

    private final IMovieTicketRepo movieTicketRepo = new MovieTicketRepoImpl();
    @Override
    public void create(MovieTicket movieTicket) {
        movieTicketRepo.create(movieTicket);
    }

    @Override
    public List<MovieTicket> getAll() {
        return movieTicketRepo.getAll();
    }

    @Override
    public void remove(String ticketID) {
        movieTicketRepo.remove(ticketID);
    }

    @Override
    public void update(MovieTicket movieTicket) {
        movieTicketRepo.update(movieTicket);
    }

    @Override
    public List<MovieTicket> sortByPrice() {
        return movieTicketRepo.sortByPrice();
    }
}
