package com.imejpul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void visualizarTablero(int matriz[][]){

        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.format("%d ", matriz[i][j]);
            }
            System.out.println();
        }
    }


    public static int comprobarGanador(int tablero[][], int jugadas){

        int tresRayaUno = 0;
        int tresRayaDos = 0;
        int ganador = 0;

        if (jugadas == 4){
            System.out.println("¡EMPATE!");
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = 0;
            }
        }

        return 0;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int fila;
        int columna;
        int ganador = 0;
        int contadorJugadas = 0;

        System.out.println("---Tres en raya---");

        int[][] tablero = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = 0;
            }
        }
        visualizarTablero(tablero);

        do {
            System.out.println("\n(---jugador 1---)\n");
            System.out.println("Introduzca casilla (fila/columna) para la tirada actual");

            do {
                System.out.print("fila: ");
                fila = Integer.parseInt(br.readLine());
            } while (fila < 0 || fila > 2);

            do {
                System.out.print("columna: ");
                columna = Integer.parseInt(br.readLine());
            } while (columna < 0 || columna > 2);

            tablero[fila][columna] = 1;
            contadorJugadas++;
            visualizarTablero(tablero);
            ganador = comprobarGanador(tablero, contadorJugadas);
            if (ganador == 1 || contadorJugadas == 4) {
                break;
            }

            System.out.println("\n(---jugador 2---)" + "\n");
            System.out.println("Introduzca casilla (fila/columna) para la tirada actual");

            do {
                System.out.print("fila: ");
                fila = Integer.parseInt(br.readLine());
            } while (fila < 0 || fila > 2);

            do {
                System.out.print("columna: ");
                columna = Integer.parseInt(br.readLine());
            } while (columna < 0 || columna > 2);

            tablero[fila][columna] = 2;
            visualizarTablero(tablero);
            ganador = comprobarGanador(tablero, contadorJugadas);
        } while (ganador == 0);
    }
}
