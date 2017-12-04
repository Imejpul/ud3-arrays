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


    public static int comprobarGanador(int tablero[][]){

        //Filas

        if(tablero[0][0] == 1 && tablero[0][1] == 1 && tablero[0][2] == 1){
            return 1;
        }
        if (tablero[0][0] == 2 && tablero[0][1] == 2 && tablero[0][2] == 2){
            return  2;
        }

        if(tablero[1][0] == 1 && tablero[1][1] == 1 && tablero[1][2] == 1){
            return 1;
        }
        if (tablero[1][0] == 2 && tablero[1][1] == 2 && tablero[1][2] == 2){
            return  2;
        }

        if(tablero[2][0] == 1 && tablero[2][1] == 1 && tablero[2][2] == 1){
            return 1;
        }
        if (tablero[2][0] == 2 && tablero[2][1] == 2 && tablero[2][2] == 2){
            return  2;
        }

        //Columnas

        if(tablero[0][0] == 1 && tablero[1][0] == 1 && tablero[2][0] == 1){
            return 1;
        }
        if (tablero[0][0] == 2 && tablero[1][0] == 2 && tablero[2][0] == 2){
            return  2;
        }

        if(tablero[0][1] == 1 && tablero[1][1] == 1 && tablero[2][1] == 1){
            return 1;
        }
        if (tablero[0][1] == 2 && tablero[1][1] == 2 && tablero[2][1] == 2){
            return  2;
        }

        if(tablero[0][2] == 1 && tablero[1][2] == 1 && tablero[2][2] == 1){
            return 1;
        }
        if (tablero[0][2] == 2 && tablero[1][2] == 2 && tablero[2][2] == 2){
            return  2;
        }

        //Diagonales

        if(tablero[0][0] == 1 && tablero[1][1] == 1 && tablero[2][2] == 1){
            return 1;
        }
        if (tablero[0][0] == 2 && tablero[1][1] == 2 && tablero[2][2] == 2){
            return  2;
        }

        if(tablero[0][2] == 1 && tablero[1][1] == 1 && tablero[2][0] == 1){
            return 1;
        }
        if (tablero[0][2] == 2 && tablero[1][1] == 2 && tablero[2][0] == 2){
            return  2;
        }

        return 0;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int fila;
        int columna;
        int ganador;
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
            ganador = comprobarGanador(tablero);
            if (ganador == 1){
                System.out.println("El ganador es el jugador 1");
                break;
            }

            if (contadorJugadas == 9){
                System.out.println("¡EMPATE!");
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
            contadorJugadas++;
            visualizarTablero(tablero);
            ganador = comprobarGanador(tablero);
            if(ganador == 2){
                System.out.println("El ganador es el jugador 2");
            }
        } while (ganador == 0);
    }
}
