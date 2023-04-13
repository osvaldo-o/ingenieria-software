package ico.fes.appPeliculas.model;

import lombok.*;

import java.util.ArrayList;
import java.util.HashMap;

@AllArgsConstructor
@Setter
@Getter
@ToString
public class Tienda {
    private HashMap<Integer,Pelicula> stock;
    private ArrayList<Reporte> reportes;

    public Tienda() {
        stock = new HashMap<>();
        reportes = new ArrayList<>();
        stock.put(1,new Pelicula("La La Land", "Musical", 128,6));
        stock.put(2,new Pelicula("Jurassic Park", "Ciencia ficción", 127,5));
        stock.put(3,new Pelicula("El Rey León", "Animación", 88,7));
        stock.put(4,new Pelicula("La Red Social", "Drama", 120,4));
        stock.put(5,new Pelicula("Star Wars: Episodio IV - Una Nueva Esperanza", "Ciencia ficción", 121,2));
    }

    public boolean rentar(int key){
        if (stock.containsKey(key)){
            return stock.get(key).rentar();
        }else{
            return false;
        }
    }

    public boolean regresar(int key){
        if (stock.containsKey(key)){
            return stock.get(key).regresar();
        }else{
            return false;
        }
    }

    public ArrayList<Boolean> cambiar(int keyA, int keyB) {
        if (stock.containsKey(keyA) && stock.containsKey(keyB)){
            ArrayList<Boolean> cambiar = new ArrayList<>();
            cambiar.add(stock.get(keyA).regresar());
            cambiar.add(stock.get(keyB).regresar());
            return cambiar;
        }else{
            return false;
        }
    }
}
