package org.lessons.java;

public class App {
    public static void main(String[] args) {

        int[] numeriInteri = { 1, 2, 3, 4, 5 };

        ClasseCiclabile cicloNumeri = new ClasseCiclabile(numeriInteri);

        System.out.println(cicloNumeri.getElementoSuccessivo());
        System.out.println(cicloNumeri.getElementoSuccessivo());
        System.out.println(cicloNumeri.hasAncoraElementi());
        System.out.println(cicloNumeri.getElementoSuccessivo());
        System.out.println(cicloNumeri.getElementoSuccessivo());
        System.out.println(cicloNumeri.getElementoSuccessivo());
        System.out.println(cicloNumeri.hasAncoraElementi());

    }
}
