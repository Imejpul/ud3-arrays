package com.imejpul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void visualizar_recuento(int recuento[], int cantLetras, int letra_ascii) {

        System.out.println("Cantidad de cada letra: ");

        for (int i = 0; i < cantLetras; i++, letra_ascii++) {
            char letra = (char) letra_ascii;

            if (recuento[i] > 0) {
                System.out.println("Letra " + letra + ": " + recuento[i]);
            }

        }

    }

    public static void contarLetras(String texto) {

        final int NUM = 26;
        final int INICIO_ABC = 97;

        char base = (char) INICIO_ABC;

        int[] recuentoLetra = new int[NUM];
        for (int i = 0; i < NUM; i++) {
            recuentoLetra[i] = 0;
        }

        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.toLowerCase().charAt(i);

            if (caracter != ' ') {
                recuentoLetra[caracter - base]++;
            }

        }
        visualizar_recuento(recuentoLetra, NUM, INICIO_ABC);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introduzca texto a procesar: ");
        String texto = br.readLine();

        contarLetras(texto);

    }
}
