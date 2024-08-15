/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p2_examen1_salvadorMacias;

/**
 *
 * @author Apple
 */
 class Circulo extends Figura{
    private double radio;
    
    public Circulo(double radio) {
        this.radio = radio;
    }

    //@override
    double calcularArea() {
        double radio_cuadrado=radio*radio;
        return radio_cuadrado * 3.1416;
    }
    
}
