package com.company;

public class PiramideBaseQ extends Figura3D{
    private double costat, altura;

    public PiramideBaseQ () {
        this.costat = 1;
        this.altura = 1;
    }

    public PiramideBaseQ(double costat, double altura) {
        this.costat = costat;
        this.altura = altura;
    }


    @Override
    public double calcularVolum() {
        return ( (costat*costat*costat*altura) / 3);
    }
}
