package ico.fes.front.appPeliculaMVC.controller;

import ico.fes.front.appPeliculaMVC.model.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MovieController {

    @GetMapping("/movie/")
    public String getMovie(Model model) {
        Movie movie = new Movie("Mario Bros","Caritura","https://static.cinepolis.com/resources/mx/movies/posters/414x603/41041-248676-20230404050924.jpg",34);
        model.addAttribute("movie",movie);
        return "index";
    }
}
