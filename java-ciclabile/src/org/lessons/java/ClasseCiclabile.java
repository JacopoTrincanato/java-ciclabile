package org.lessons.java;

public class ClasseCiclabile {

    // attributi
    private int[] numeri;
    private int indiceCorrente = 0;

    // costruttore
    public ClasseCiclabile(int[] numeri) {
        this.numeri = numeri;
    }

    // metodi

    public int getElementoSuccessivo() {
        return numeri[indiceCorrente++];
    }

    public boolean hasAncoraElementi() {
        return indiceCorrente < numeri.length;
    }

}
