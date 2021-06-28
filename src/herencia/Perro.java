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
public class Perro extends Animal {
    private String Raza;
    private boolean Pedigree;
    private Color Color;

    public Perro() {
    }

    public Perro(String Raza, boolean Pedigree, Color Color) {
        this.Raza = Raza;
        this.Pedigree = Pedigree;
        this.Color = Color;
    }

    public Perro(String Raza, boolean Pedigree, Color Color, int NumeroPatas, int Edad, int Peso, boolean Vacunado) {
        super(NumeroPatas, Edad, Peso, Vacunado);
        this.Raza = Raza;
        this.Pedigree = Pedigree;
        this.Color = Color;
    }

    public Color getColor() {
        return Color;
    }

    public void setColor(Color Color) {
        this.Color = Color;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public boolean isPedigree() {
        return Pedigree;
    }

    public void setPedigree(boolean Pedigree) {
        this.Pedigree = Pedigree;
    }

    @Override
    public String toString() {
        return super.toString() + "Perro{" + "Raza=" + Raza + ", Pedigree=" + Pedigree + ", Color=" + Color + '}';
    }
    
    public void EmiteSonido(){
        System.out.println(".-.-.-.-.-Guaf-.-.-.-.-.");
    }
}
