/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareaautomovil;

/**
 *
 * @author Usuario
 */
public class TareaAutomovil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Automovil audiA1 = new Automovil("Audi", 2020, 1400, "automatico");
        System.out.println(audiA1.toString());
        System.out.println(audiA1.avanzar(100));
        System.out.println(audiA1.frenar());
        System.out.println(audiA1.toString());
    }
    
}
