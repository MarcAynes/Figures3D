package com.company;

public class Punt {
    private float x, y;

    public Punt() {
        this.x = 0;
        this.y = 0;
    }

    public Punt(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void traslladaX (float incrX) {
        this.x += incrX;
    }

    public void traslladaY (float incrY) {
        this.y += incrY;
    }

    public void traslladaXY (float incrX, float incrY) {
        this.x += incrX;
        this.y += incrY;
    }

    public void copia (Punt p) {
        p.x = this.x;
        p.y = this.y;
    }

    public boolean iguals (Punt p) {
        return p.x == this.x && p.y == this.y;
    }
}
