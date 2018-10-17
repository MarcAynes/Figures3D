package com.company;

public class Cubo extends Figura3D {
    private double costat;

    public Cubo () {
        this.costat = 1;
    }

    public Cubo (double costat) {
        this.costat = costat;
    }

    @Override
    public double calcularVolum() {
        return costat*costat*costat;
    }
}
