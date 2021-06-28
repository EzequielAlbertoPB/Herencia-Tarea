package herencia;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pc
 */
public class Animal {
    private int NumeroPatas;
    private int Edad;
    private int Peso;
    private boolean Vacunado;

    public Animal() {
    }

    public Animal(int NumeroPatas, int Edad, int Peso, boolean Vacunado) {
        this.NumeroPatas = NumeroPatas;
        this.Edad = Edad;
        this.Peso = Peso;
        this.Vacunado = Vacunado;
    }

    public boolean isVacunado() {
        return Vacunado;
    }

    public void setVacunado(boolean Vacunado) {
        this.Vacunado = Vacunado;
    }

    public int getNumeroPatas() {
        return NumeroPatas;
    }

    public void setNumeroPatas(int NumeroPatas) {
        this.NumeroPatas = NumeroPatas;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int Peso) {
        this.Peso = Peso;
    }

    @Override
    public String toString() {
        return "Animal{" + "NumeroPatas=" + NumeroPatas + ", Edad=" + Edad + ", Peso=" + Peso + ", Vacunado=" + Vacunado + '}';
    }
    
    public void Sonido(){
        System.out.println("El animal emite el sonido:");
    }
}
