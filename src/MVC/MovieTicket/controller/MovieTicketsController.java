package MVC.MovieTicket.controller;

import MVC.MovieTicket.model.MovieTicket;
import MVC.MovieTicket.service.IMovieTicketsService;
import MVC.MovieTicket.service.MovieTicketsServiceImpl;

import java.util.List;

public class MovieTicketsController {
    private final IMovieTicketsService movieTicketsService = new MovieTicketsServiceImpl();

    public void create(MovieTicket movieTicket){
        movieTicketsService.create(movieTicket);
    }

    public List<MovieTicket> getAll(){
       return movieTicketsService.getAll();
    }

    public void remove(String ticketID){
        movieTicketsService.remove(ticketID);
    }

    public void update(MovieTicket movieTicket){
        movieTicketsService.update(movieTicket);
    }

    public List<MovieTicket> sortByPrice(){
        return movieTicketsService.sortByPrice();
    }
}
