
package MVC.MovieTicket.service;

import MVC.MovieTicket.model.MovieTicket;

import java.util.List;

public interface IMovieTicketsService {
    void create(MovieTicket movieTicket);

    List<MovieTicket> getAll();

    void remove(String ticketID);

    void update(MovieTicket movieTicket);

    List<MovieTicket> sortByPrice();
}
