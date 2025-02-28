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
        if (indiceCorrente <= numeri.length) {
            return numeri[indiceCorrente += 1];
        }
        indiceCorrente = 0;
        return numeri[indiceCorrente];
    }

    public boolean hasAncoraElementi() {
        if (indiceCorrente < numeri.length) {
            return true;
        }

        return false;
    }
}
