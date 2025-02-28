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
        if (indiceCorrente == numeri.length - 1) {
            System.out.println("L'array non ha più elementi");
        } else if (indiceCorrente == 0) {
            System.out.println(numeri[indiceCorrente]);
        }
        return numeri[indiceCorrente += 1];
    }

    public boolean hasAncoraElementi() {
        if (indiceCorrente == numeri.length - 1) {
            return false;
        }

        return true;
    }
}
