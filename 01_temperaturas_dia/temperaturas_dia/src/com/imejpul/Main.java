package com.imejpul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double media = 0;

        final int NUM = 24;

        double[] temperaturas = new double[24];
        for (int i = 0; i < NUM; i++) {
            temperaturas[i] = 0;
        }

        System.out.println("--Introduce los valores de temperatura--- ");

        for (int i = 0; i < NUM; i++) {
            System.out.print("Valor de la hora " + i + ": ");
            temperaturas[i] = Double.parseDouble(br.readLine());

            media = media + temperaturas[i];

            if (temperaturas[i] > max) {
                max = temperaturas[i];
            }

            if (temperaturas[i] < min) {
                min = temperaturas[i];
            }
        }

        System.out.println("");

        for (int i = 0; i < NUM; i++) {
            int barras = (int) temperaturas[i];

            for (int j = 0; j < barras; j++) {
                System.out.print("*");



            }
            System.out.print(" " + temperaturas[i]);
            if (temperaturas[i] == max){
                System.out.print("  -> MAX");
            }

            if(temperaturas[i] == min){
                System.out.print("  -> MIN");
            }

            System.out.println("");
        }
        System.out.println("\nMedia: " + (media / NUM));

    }
}
