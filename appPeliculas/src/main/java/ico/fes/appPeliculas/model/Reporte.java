package ico.fes.appPeliculas.model;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Reporte {
    private Date fecha;
    private String accion;
    private Pelicula pelicula;
}
