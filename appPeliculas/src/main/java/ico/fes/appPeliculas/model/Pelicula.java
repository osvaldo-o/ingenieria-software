package ico.fes.appPeliculas.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Pelicula {
    private String titulo;
    private String genero;
    private int duracion;
    private int cantidad;

    public boolean rentar() {
        if (cantidad >= 1){
            cantidad--;
            return true;
        }
        return false;
    }

    public boolean regresar() {
        cantidad++;
        return true;
    }
}
