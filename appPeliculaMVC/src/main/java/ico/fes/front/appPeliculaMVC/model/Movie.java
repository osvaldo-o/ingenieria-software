package ico.fes.front.appPeliculaMVC.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Movie {
    private String title;
    private String description;
    private String image;
    private int cantidad;
}
