package com.imejpul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static boolean tableroCompleto(int tablero[][]) {

        //tablero completo

        int comprobacion = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                comprobacion = comprobacion + tablero[i][j];
            }
        }
        if (comprobacion == 405) {

            System.out.println("Tablero completo, Fin del juego");
            return true;

        } else {
            return false;
        }

    }

    public static boolean comprobadorValores(int tablero[][], int fila, int columna, int valor) {

        //campo sin valores
        int valor_campo = tablero[fila][columna];

        if (valor_campo == -1) {

            //valor en fila correcta
            for (int i = 0; i < 9; i++) {
                if (tablero[fila][i] == valor) {
                    return false;
                }
            }

            //valor en columna correcto
            for (int i = 0; i < 9; i++) {
                if (tablero[i][columna] == valor) {
                    return false;
                }
            }

            //valor en cuadrícula 3x3 correcto

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (tablero[i + ((fila / 3) * 3)][j + ((columna / 3) * 3)] == valor) {
                        return false;
                    }
                }
            }

        } else {
            System.out.println("¡Error!\nCampo con valor ya establecido");
            return false;
        }

        return true;
    }

    public static void generadorTablero(int tablero[][]) {
        Random r = new Random();

        for (int i = 0; i < 9; i++) {
            int valores_por_linea = r.nextInt(4);
            for (int j = 0; j < 9; j++) {

                int decision = r.nextInt(1);

                if (decision == 1 && valores_por_linea > 0) {
                    int posible_valor = r.nextInt(9) + 1;
                    boolean valor_valido = comprobadorValores(tablero, i, j, posible_valor);

                    if (valor_valido) {
                        tablero[i][j] = posible_valor;
                        valores_por_linea--;
                    }
                }
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void visualizarTablero(int tablero[][]) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (tablero[i][j] == -1) {
                    System.out.print(" , ");
                } else {
                    System.out.print(tablero[i][j] + ", ");
                }

            }
            System.out.println();
        }

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] tablero = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                tablero[i][j] = -1;
            }
        }

        System.out.println("---SUDOKU---");

        // se genera tablero de juego y se visualiza
        generadorTablero(tablero);
        //visualizarTablero(tablero);

        //pedimos valor de fila y columna a usuario
        System.out.print("Introduzca fila: ");
        int fila = Integer.parseInt(br.readLine());

        System.out.print("Introduzca columna: ");
        int columna = Integer.parseInt(br.readLine());

        //pedimos valor a introducir
        System.out.print("Introduzca valor: ");
        int valor = Integer.parseInt(br.readLine());

        //comprobamos el valor en la fila y columna introducidas
        comprobadorValores(tablero, fila, columna, valor);

        //comprobamos si tablero completo
        tableroCompleto(tablero);

    }
}
