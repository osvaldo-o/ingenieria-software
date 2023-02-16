/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fes.aragon;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<SmartTV> listaSmartTV = new ArrayList<>();
        listaSmartTV.add(new SmartTV("Sony",55, "1600p", "Led", new Sistema("Android TV", 11)));
        listaSmartTV.add(new SmartTV("LG",65, "4K UHD", "Oled", new Sistema("Tizen", 8)));
        listaSmartTV.add(new SmartTV("Shart",45, "1440p", "Led", new Sistema("Roku TV", 4)));
        for (SmartTV tv : listaSmartTV){
            System.out.println(tv.toString());
        }
    }
    
}
