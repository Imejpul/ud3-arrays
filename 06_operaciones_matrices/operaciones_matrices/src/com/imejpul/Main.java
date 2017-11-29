package com.imejpul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    final static int MATRIZ_LINE_SIZE = 2;
    final static int MATRIZ_ROW_SIZE = 2;

    public static void visualizarMatriz(int matriz[][]) {

        for (int i = 0; i < MATRIZ_LINE_SIZE; i++) {
            for (int j = 0; j < MATRIZ_ROW_SIZE; j++) {
                System.out.format("%d ", matriz[i][j]);
            }
            System.out.println("\n");
        }
    }

    public static void sumaMatrices(int matrizUno[][], int matrizDos[][]) {

        int[][] sumaMatrices = new int[MATRIZ_LINE_SIZE][MATRIZ_ROW_SIZE];
        for (int i = 0; i < MATRIZ_LINE_SIZE; i++) {
            for (int j = 0; j < MATRIZ_ROW_SIZE; j++) {
                sumaMatrices[i][j] = 0;
            }
        }

        for (int i = 0; i < MATRIZ_LINE_SIZE; i++) {
            for (int j = 0; j < MATRIZ_ROW_SIZE; j++) {
                sumaMatrices[i][j] = matrizUno[i][j] + matrizDos[i][j];
            }
        }

        visualizarMatriz(sumaMatrices);
    }

    public static void producto_escalar(int matriz[][], int valorEscalar) {

        int[][] matrizProductoEscalar = new int[MATRIZ_LINE_SIZE][MATRIZ_ROW_SIZE];
        for (int i = 0; i < MATRIZ_LINE_SIZE; i++) {
            for (int j = 0; j < MATRIZ_ROW_SIZE; j++) {
                matrizProductoEscalar[i][j] = 0;
            }
        }

        for (int i = 0; i < MATRIZ_LINE_SIZE; i++) {
            for (int j = 0; j < MATRIZ_ROW_SIZE; j++) {
                matrizProductoEscalar[i][j] = matriz[i][j] * valorEscalar;
            }
        }

        visualizarMatriz(matrizProductoEscalar);
    }

    public static void productoMatrices(int matrizUno[][], int matrizDos[][]) {

        int[][] productoMatrices = new int[MATRIZ_LINE_SIZE][MATRIZ_ROW_SIZE];
        for (int i = 0; i < MATRIZ_LINE_SIZE; i++) {
            for (int j = 0; j < MATRIZ_ROW_SIZE; j++) {
                productoMatrices[i][j] = 0;
            }
        }

        for (int i = 0; i < MATRIZ_LINE_SIZE; i++) {
            for (int j = 0; j < MATRIZ_ROW_SIZE; j++) {
                for (int k = 0; k < MATRIZ_ROW_SIZE; k++) {
                    productoMatrices[i][j] += matrizUno[i][j] * matrizDos[k][j];
                }
            }
        }

        visualizarMatriz(productoMatrices);
    }

    public static void traspuesta(int matriz[][]) {

        int[][] matrizTraspuesta = new int[MATRIZ_LINE_SIZE][MATRIZ_ROW_SIZE];
        for (int i = 0; i < MATRIZ_LINE_SIZE; i++) {
            for (int j = 0; j < MATRIZ_ROW_SIZE; j++) {
                matrizTraspuesta[i][j] = 0;
            }
        }

        for (int i = 0; i < MATRIZ_LINE_SIZE; i++) {
            for (int j = 0; j < MATRIZ_ROW_SIZE; j++) {
                matrizTraspuesta[i][j] = matriz[j][i];
            }
        }

        visualizarMatriz(matrizTraspuesta);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Random r = new Random();

        int[][] matriz_numeros1 = new int[MATRIZ_LINE_SIZE][MATRIZ_ROW_SIZE];
        for (int i = 0; i < MATRIZ_LINE_SIZE; i++) {
            for (int j = 0; j < MATRIZ_ROW_SIZE; j++) {
                matriz_numeros1[i][j] = 0;
            }
        }

        for (int i = 0; i < MATRIZ_LINE_SIZE; i++) {
            for (int j = 0; j < MATRIZ_ROW_SIZE; j++) {
                matriz_numeros1[i][j] = r.nextInt(100);
                System.out.print(matriz_numeros1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        int[][] matriz_numeros2 = new int[MATRIZ_LINE_SIZE][MATRIZ_ROW_SIZE];
        for (int i = 0; i < MATRIZ_LINE_SIZE; i++) {
            for (int j = 0; j < MATRIZ_ROW_SIZE; j++) {
                matriz_numeros2[i][j] = 0;
            }
        }

        for (int i = 0; i < MATRIZ_LINE_SIZE; i++) {
            for (int j = 0; j < MATRIZ_ROW_SIZE; j++) {
                matriz_numeros2[i][j] = r.nextInt(100);
                System.out.print(matriz_numeros2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n Operaciones con matrices: ");

        System.out.println("Suma de dos matrices aleatorias: ");
        sumaMatrices(matriz_numeros1,matriz_numeros2);

        System.out.println("Producto de la primera matriz aleatoria por un escalar: ");
        System.out.print("Introduzca escalar: ");
        int escalar = Integer.parseInt(br.readLine());
        producto_escalar(matriz_numeros1, escalar);

        System.out.println("Producto de dos matrices aleatorias: ");
        productoMatrices(matriz_numeros1, matriz_numeros2);

        System.out.println("Matriz traspuesta de la segunda matriz aleatoria: ");
        traspuesta(matriz_numeros2);

    }
}
