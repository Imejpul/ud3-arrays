package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final int NUM = 3;




        String[] nombre_alumnos = new String[NUM];
        for (int i = 0; i < NUM; i++) {
            nombre_alumnos[i] = " ";
        }

        System.out.println("----Introduce nombre y apellidos de alumnos----");

        for (int i = 0; i <NUM ; i++) {
            System.out.print("Introduzca datos alumno nº " + (i+1) + ": ");
            nombre_alumnos[i] = br.readLine();

        }


        String letra = "";

        do{
            System.out.println("Introduce una letra: ");
            letra = br.readLine().toLowerCase();

            char caracter = letra.charAt(0);

            char letraAlumno;

            for (int i = 0; i < NUM; i++) {
                letraAlumno = nombre_alumnos[i].charAt(0);

                if (letraAlumno == caracter){
                    System.out.println(nombre_alumnos[i]);
                }
            }


        } while (!letra.equalsIgnoreCase("fin")); }
}
