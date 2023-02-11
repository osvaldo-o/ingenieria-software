/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaautomovil;

/**
 *
 * @author Usuario
 */
public class Automovil {
    private String marca;
    private int anio;
    private int km;
    private String transmision;

    public Automovil(String marca, int anio, int km, String transmision) {
        this.marca = marca;
        this.anio = anio;
        this.km = km;
        this.transmision = transmision;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    @Override
    public String toString() {
        return "marca: "+marca+ " - año: "+anio+ " - km: "+km+" - transmisión: "+transmision;
    }
    
    public String avanzar(int km){
        setKm(this.km+km);
        return "El automovil esta avanzando "+this.km+ " kilometros";
    }
    
    public String frenar(){
        return "El automovil esta frenando";
    }
}
