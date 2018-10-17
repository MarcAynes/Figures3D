package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Figura3D> figuras = new ArrayList<>();

        Cubo c1 = new Cubo();
        Cubo c2 = new Cubo();

        PiramideBaseQ pq1 = new PiramideBaseQ(2,4);
        PiramideBaseQ pq2 = new PiramideBaseQ(5,2);

        PiramideBaseT pt1 = new PiramideBaseT(3,4,5);
        PiramideBaseT pt2 = new PiramideBaseT(2,7,3);

        figuras.add(c1); //Añadimos c1...
        figuras.add(c2);
        figuras.add(pq1);
        figuras.add(pq2);
        figuras.add(pt1);
        figuras.add(pt2);

       // figuras.sort(Comparator.comparing(Figura3D::calcularVolum));
        Collections.sort(figuras);
        System.out.println("Ordenat:" + figuras);

        for (int i=0; i < figuras.size(); i++) {
            System.out.println(figuras.get(i));
        }

    }
}
