package ico.fes.front.appPeliculaMVC.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Movie {
    private String title;
    private String gender;
    private String image;
    private int amount;
}
