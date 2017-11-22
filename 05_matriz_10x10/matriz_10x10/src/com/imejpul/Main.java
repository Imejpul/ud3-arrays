package com.imejpul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int MATRIZ_LINE_SIZE = 2;
        final int MATRIZ_ROW_SIZE = 2;

        Random r = new Random();

        int[][] matriz_numeros = new int[5][5];
        for (int i = 0; i < MATRIZ_LINE_SIZE; i++) {
            for (int j = 0; j < MATRIZ_ROW_SIZE; j++) {
                matriz_numeros[i][j] = 0;
            }
        }

        for (int i = 0; i < MATRIZ_LINE_SIZE; i++) {
            for (int j = 0; j < MATRIZ_ROW_SIZE; j++) {
                matriz_numeros[i][j] = r.nextInt(100);
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
