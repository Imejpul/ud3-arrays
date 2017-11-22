package com.imejpul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int MATRIZ_LINE_SIZE = 2;
        final int MATRIZ_ROW_SIZE = 2;

        int[][] matriz_numeros = new int[MATRIZ_LINE_SIZE][MATRIZ_ROW_SIZE];
        for (int i = 0; i < MATRIZ_LINE_SIZE; i++) {
            for (int j = 0; j < MATRIZ_ROW_SIZE; j++) {
                matriz_numeros[i][j] = 0;
            }
        }

        System.out.println("Introduce valores para matriz: ");

        for (int i = 0; i < MATRIZ_LINE_SIZE; i++) {
            for (int j = 0; j < MATRIZ_ROW_SIZE; j++) {
                System.out.print("Valor para posición " + i + ", " + j + ": ");
                matriz_numeros[i][j] = Integer.parseInt(br.readLine());
            }
            System.out.println();
        }

        for (int i = 0; i < MATRIZ_LINE_SIZE; i++) {
            for (int j = 0; j < MATRIZ_ROW_SIZE; j++) {
                System.out.format("%d ", matriz_numeros[i][j]);
            }
            System.out.println();
        }
    }
}
