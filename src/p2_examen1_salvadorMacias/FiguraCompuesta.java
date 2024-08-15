/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p2_examen1_salvadorMacias;

import java.util.ArrayList;

/**
 *
 * @author claudiacortes
 */
class FiguraCompuesta extends Figura {

    private ArrayList<Figura> figuras = new ArrayList<>();

    double calcularArea() {
        for (int i = 0; i < figuras.size(); i++) {
            double suma;
            figuras.get(i).calcularArea();
            suma = +figuras.get(i).calcularArea();
            return suma;
        }
        return 0;
    }
}
