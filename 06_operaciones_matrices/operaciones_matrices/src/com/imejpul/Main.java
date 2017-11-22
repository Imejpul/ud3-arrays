package com.imejpul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    final static int MATRIZ_LINE_SIZE = 4;
    final static int MATRIZ_ROW_SIZE = 4;

    public static void visualizarMatriz(int matriz[][]) {

        for (int i = 0; i < MATRIZ_LINE_SIZE; i++) {
            for (int j = 0; j < MATRIZ_ROW_SIZE; j++) {
                System.out.format("%d ", matriz[i][j]);
            }
            System.out.println();
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
                for (int k = 0; k < MATRIZ_LINE_SIZE; k++) {
                    for (int l = 0; l < MATRIZ_ROW_SIZE; l++) {
                        sumaMatrices[i][j] = matrizUno[k][l] + matrizDos[k][l];
                    }
                }
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
                for (int k = 0; k < MATRIZ_LINE_SIZE; k++) {
                    for (int l = 0; l < MATRIZ_ROW_SIZE; l++) {
                        matrizProductoEscalar[i][j] = matriz[k][l] * valorEscalar;
                    }
                }
            }
        }

        visualizarMatriz(matrizProductoEscalar);
    }

    public static void productoMatrices(int matrizUno[][], int matrizDos[][]) {

        int[][] prodcutoMatrices = new int[MATRIZ_LINE_SIZE][MATRIZ_ROW_SIZE];
        for (int i = 0; i < MATRIZ_LINE_SIZE; i++) {
            for (int j = 0; j < MATRIZ_ROW_SIZE; j++) {
                prodcutoMatrices[i][j] = 0;
            }
        }

        for (int i = 0; i < MATRIZ_LINE_SIZE; i++) {
            for (int j = 0; j < MATRIZ_ROW_SIZE; j++) {
                for (int k = 0; k < MATRIZ_LINE_SIZE; k++) {
                    for (int l = 0; l < MATRIZ_ROW_SIZE; l++) {
                        prodcutoMatrices[i][j] = matrizUno[k][l] * matrizDos[k][l];
                    }
                }
            }
        }

        visualizarMatriz(prodcutoMatrices);
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
                for (int k = 0; k < MATRIZ_LINE_SIZE; k++) {
                    for (int l = 0; l < MATRIZ_ROW_SIZE; l++) {
                        matrizTraspuesta[i][j] = matriz[l][k];
                    }
                }
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
            }
        }

        int[][] matriz_numeros2 = new int[MATRIZ_LINE_SIZE][MATRIZ_ROW_SIZE];
        for (int i = 0; i < MATRIZ_LINE_SIZE; i++) {
            for (int j = 0; j < MATRIZ_ROW_SIZE; j++) {
                matriz_numeros2[i][j] = 0;
            }
        }

        for (int i = 0; i < MATRIZ_LINE_SIZE; i++) {
            for (int j = 0; j < MATRIZ_ROW_SIZE; j++) {
                matriz_numeros2[i][j] = r.nextInt(100);
            }
        }

        System.out.println("Operaciones con matrices: ");

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
