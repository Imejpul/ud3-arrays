package com.imejpul;

import java.util.Random;

public class Main {

    public static boolean comprobadorValores(String tablero[][], int valor){
        return false;
    }

    public static void generadorTablero(String tablero[][]){

        Random r = new Random();
        int aleatorio = r.nextInt(4)+1;

        //http://www.tututorial.com/2016/05/tutorial-como-generar-numeros-aleatorios-java-sin-repetir.html

    }

    public static void main(String[] args) {

        String[][] tablero = new String[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                tablero[i][j] = " ";
            }
        }

        System.out.println("---SUDOKU---");

    }
}
