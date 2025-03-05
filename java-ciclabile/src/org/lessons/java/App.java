package org.lessons.java;

public class App {
    public static void main(String[] args) {

        // creo un array di interi
        int[] numeriInteri = { 1, 2, 3, 4, 5 };

        ClasseCiclabile cicloNumeri = new ClasseCiclabile(numeriInteri);

        // aggiungo un nuovo intero a cicloNumeri
        cicloNumeri.addElemento(6);

        // testo il codice

        while (cicloNumeri.hasAncoraElementi()) {
            System.out.println(cicloNumeri.getElementoSuccessivo());
        }

        System.out.println(cicloNumeri.hasAncoraElementi());

        // creo un nuovo array utilizzando il costruttore bonus
        ClasseCiclabile numeriBonus = new ClasseCiclabile();

        numeriBonus.addElemento(123);
        numeriBonus.addElemento(12);
        numeriBonus.addElemento(1);
        numeriBonus.addElemento(23);
        numeriBonus.addElemento(13);

        while (numeriBonus.hasAncoraElementi()) {
            System.out.println(numeriBonus.getElementoSuccessivo());
        }

    }
}
