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

        if (!hasAncoraElementi()) {
            System.out.println("L'array non ha più elementi");
        }

        return numeri[indiceCorrente++];
    }

    public boolean hasAncoraElementi() {
        return indiceCorrente < numeri.length;
    }

}
