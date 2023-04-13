package ico.fes.appPeliculas.controller;

import ico.fes.appPeliculas.model.Pelicula;
import ico.fes.appPeliculas.model.Reporte;
import ico.fes.appPeliculas.model.Tienda;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/get/reportes")
    public ResponseEntity<ArrayList<Reporte>> getReportes() {
        return new ResponseEntity<>(tienda.getReportes(), HttpStatus.OK);
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


}
