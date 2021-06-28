/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.awt.Color;

/**
 *
 * @author Pc
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gato Garfield = new Gato("Albino", Color.WHITE);
        Garfield.setNumeroPatas(4);
        Garfield.setEdad(10);
        Garfield.setPeso(6);
        System.out.println(Garfield);
        Garfield.Sonido();
        Garfield.EmiteSonido();
        
        System.out.println("");
        
        Perro Milaneso = new Perro("Pastor Aleman", false, Color.BLACK);
        Milaneso.setNumeroPatas(4);
        Milaneso.setEdad(14);
        Milaneso.setPeso(7);
        Milaneso.setVacunado(true);
        System.out.println(Milaneso);
        Milaneso.Sonido();
        Milaneso.EmiteSonido();
    }
    
}
