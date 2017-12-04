package com.imejpul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void preguntasRespuestas(String preguntas[][], String respuestas[][]){

        //Geografía
        preguntas[0][0] = "¿Capital de Zimbabwe?";
        respuestas[0][0] = "Harare";

        preguntas[1][0] = "¿Altitud exacta monte Kilimanjaro?";
        respuestas[1][0] = "5891.8 metros";

        //Arte y Literatura
        preguntas[0][1] = "¿Autor de \"el arbol de la ciencia\"?";
        respuestas[0][1] = "Pío Baroja";

        preguntas[1][1] = "¿Obra cumbre de Ayn Rand?";
        respuestas[1][1] = "\"La Rebelión de Atlas\"";

        //Historia
        preguntas[0][2] = "¿Año de inicio de \"La Gran Guerra\"?";
        respuestas[0][2] = "1914";

        preguntas[1][2] = "¿Lugar de nacimiento de Napoleon Bonaparte?";
        respuestas[1][2] = "Ajaccio, Córcega, Francia";

        //Entretenimiento
        preguntas[2][0] = "¿Segundo apellido de Belén Esteban?";
        respuestas[2][0] = "Menéndez";

        //Ciencias y Naturaleza
        preguntas[2][1] = "¿Elemento más común en la corteza terrestre";
        respuestas[2][1] = "Oxígeno";

        //Deportes y Pasatiempos
        preguntas[2][2] = "¿Año de retiro de Niki Lauda";
        respuestas[2][2] = "1985";

    }


    public static void main(String[] args) throws IOException {

        String[][] preguntas = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                preguntas[i][j] = " ";
            }
        }

        String[][] respuestas = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                respuestas[i][j] = " ";
            }
        }

        preguntasRespuestas(preguntas, respuestas);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Random r = new Random();
        String confirmacion;
        System.out.println("---TRIVIAL---");

        do {
            System.out.println("Pregunta: ");

            int row = r.nextInt(2);
            int line = r.nextInt(2);
            System.out.println(preguntas[line][row]);

            int acierto_uno = 0;
            int fallo_uno = 0;

            do {
                System.out.print("Tiene la respuesta (SI/NO): ");
                confirmacion = br.readLine();
            } while (confirmacion.equalsIgnoreCase("NO"));

            do {
                System.out.println("Era esta su respuesta (SI/NO): " + respuestas[line][row]);
                confirmacion = br.readLine();
            } while (!confirmacion.equalsIgnoreCase("si") && !confirmacion.equalsIgnoreCase("no"));

            if (confirmacion.equalsIgnoreCase("si")){
                acierto_uno++;
            }else {
                fallo_uno++;
            }
            System.out.println("Aciertos: " + acierto_uno + " Fallos: " + fallo_uno);
            System.out.println("Desea continuar (SI/NO): ");
            confirmacion = br.readLine();
        } while (confirmacion.equalsIgnoreCase("si"));
    }
}
