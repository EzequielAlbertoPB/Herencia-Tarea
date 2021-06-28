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
public class Gato extends Animal {
    private String Raza;
    private Color Color;

    public Gato() {
    }

    public Gato(String Raza, Color Color, int NumeroPatas, int Edad, int Peso, boolean Vacunado) {
        super(NumeroPatas, Edad, Peso, Vacunado);
        this.Raza = Raza;
        this.Color = Color;
    }

    public Gato(String Raza, Color Color) {
        this.Raza = Raza;
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

    @Override
    public String toString() {
        return super.toString() + "Gato{" + "Raza=" + Raza + ", Color=" + Color + '}';
    }

    void getNumeroPatas(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void EmiteSonido(){
        System.out.println(".-.-.-.-.-Miau.-.-.-.-.-.");
    }
    
}
