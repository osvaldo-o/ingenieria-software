/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fes.aragon;

/**
 *
 * @author Usuario
 */
public class Sistema {
    
    private String nombre;
    private int version;

    public Sistema() {
    }

    public Sistema(String nombre, int version) {
        this.nombre = nombre;
        this.version = version;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Sistema{" + "nombre=" + nombre + ", version=" + version + '}';
    }

}
