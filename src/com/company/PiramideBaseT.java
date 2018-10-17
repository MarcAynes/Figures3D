package com.company;

public class PiramideBaseT extends Figura3D {
    private double baseT, alturaT, alturaP;

    public PiramideBaseT() {
        this.baseT = 1;
        this.alturaT = 1;
        this.alturaP = 1;
    }

    public PiramideBaseT(double baseT, double alturaT, double alturaP) {
        this.baseT = baseT;
        this.alturaT = alturaT;
        this.alturaP = alturaP;
    }


    @Override
    public double calcularVolum() {
        return ( (((baseT*alturaT)/2)*alturaP) / 3);
    }
}
