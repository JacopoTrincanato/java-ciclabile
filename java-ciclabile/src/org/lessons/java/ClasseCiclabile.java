package org.lessons.java;

public class ClasseCiclabile {

    // attributi
    private int[] numeri;
    private int indiceCorrente = 0;

    // costruttore
    public ClasseCiclabile(int[] numeri) {
        this.numeri = numeri;
    }

    // costruttore bonus
    public ClasseCiclabile() {

    }

    // metodi

    public int getElementoSuccessivo() {
        return numeri[indiceCorrente++];
    }

    public boolean hasAncoraElementi() {
        return indiceCorrente < numeri.length;
    }

    public void addElemento(int nuovoNUmero) {
        int[] numeriAggiornati = new int[this.numeri.length + 1];

        for (int i = 0; i < this.numeri.length; i++) {
            numeriAggiornati[i] = this.numeri[i];
        }

        numeriAggiornati[numeriAggiornati.length - 1] = nuovoNUmero;

        this.numeri = numeriAggiornati;
    }

}
