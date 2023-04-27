package ico.fes.front.appPeliculaMVC.controller;

import ico.fes.front.appPeliculaMVC.model.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class MovieController {

    private ArrayList<Movie> movies;
    public MovieController() {
        movies = new ArrayList<>();
        movies.add(new Movie("Mario Bros","Un fontanero llamado Mario viaja por un laberinto subterráneo con su hermano, Luigi, intentando salvar a una princesa capturada.","https://static.cinepolis.com/resources/mx/movies/posters/414x603/41041-248676-20230404050924.jpg",10));
        movies.add(new Movie("El Exorcista del Papa","El Exorcista del Papa sigue a Amorth mientras investiga la terrorífica posesión de un niño que termina descubriendo una conspiración que hace siglos fue encubierta de manera desesperada por el Vaticano.","https://static.cinepolis.com/resources/mx/movies/posters/414x603/41961-584178-20230310125105.jpg",12));
        movies.add(new Movie("Avatar 2","Jake Sully y Ney'tiri han formado una familia y hacen todo lo posible por permanecer juntos. Sin embargo, deben abandonar su hogar y explorar las regiones de Pandora cuando una antigua amenaza reaparece.","https://streamradioytv.buap.mx/images/mv5byjhinjblodcty2zioc00yjvllwflnzatntvhnzm1yji1nzmxxkeyxkfqcgdeqxvymjqxnte1mda-v1-fmjpg-ux1000-1674662913233.jpg",8));
    }
    @GetMapping("/movie/")
    public String getMovie(Model model) {
        model.addAttribute("movie",movies.get(0));
        return "index";
    }

    @GetMapping("/movies/")
    public String getAllMovies(Model model){
        model.addAttribute("movies",movies);
        return "catalogo";
    }
}
