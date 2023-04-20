package ico.fes.appPeliculas.controller;

import ico.fes.appPeliculas.model.Pelicula;
import ico.fes.appPeliculas.model.Reporte;
import ico.fes.appPeliculas.model.Tienda;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

@RestController
public class TiendaController {

    Tienda tienda;

    public TiendaController(){
        tienda = new Tienda();
    }

    @GetMapping("/get")
    public ResponseEntity<HashMap<Integer, Pelicula>> getStock() {
        return new ResponseEntity<>(tienda.getStock(), HttpStatus.OK);
    }

    @GetMapping("/get/{key}")
    public ResponseEntity<Pelicula> getPeliculaById(@PathVariable(required = true) int key) {
        return new ResponseEntity<>(tienda.getStock().get(key),HttpStatus.OK);
    }

    @GetMapping("/reportes")
    public ResponseEntity<ArrayList<Reporte>> getReportes() {
        return new ResponseEntity<>(tienda.getReportes(), HttpStatus.OK);
    }

    @GetMapping("/ganancia")
    public ResponseEntity<Integer> getGanancia() {
        return new ResponseEntity<>(tienda.getGanancia(), HttpStatus.OK);
    }

    @GetMapping("/rentar/{key}")
    public ResponseEntity<Boolean> rentar(@PathVariable(required = true) int key) {
        tienda.getReportes().add(new Reporte(new Date(),"RENTA",tienda.getStock().get(key)));
        return new ResponseEntity<>(tienda.rentar(key),HttpStatus.OK);
    }

    @GetMapping("/regresar/{key}")
    public ResponseEntity<Boolean> regresar(@PathVariable(required = true) int key) {
        tienda.getReportes().add(new Reporte(new Date(),"REGRESAR",tienda.getStock().get(key)));
        return new ResponseEntity<>(tienda.regresar(key),HttpStatus.OK);
    }

    @PatchMapping("/cambiar/{key}")
    public ResponseEntity<Boolean> cambiar(@PathVariable(required = true) int key, @RequestBody Pelicula pelicula) {
        return new ResponseEntity<>(tienda.cambiar(key, pelicula),HttpStatus.OK);
    }
}
