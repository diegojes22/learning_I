package ejercicios;

import java.util.Scanner;

/**
 * @author: Diego Jesus Muñoz Andrade
 * Equipo:
 *  - Diego Jesus Muñoz Andrade
 *  - Jesus Gomez Romero
 * 
 * 1-C Bis
 * 
 * Instituto Tecnológico de La Piedad
 * Ingeniería en Sistemas Computacionales
 * 
 * Fecha de elaboración: 13/11/2020
 * 
 * Problema:
 * Diseñe un programa con una matriz de 10x5 la cual contiene la información de cinco unidades
 * de la materia de fundamentos de programación para 10 alumnos; leer los valores del teclado. 
 * Calcule e imprima:
 *    a) cantidad de alumnos que aprobaron la materia
 *    b) número de alumno(s) que tiene que presentar segundas oportunidades y cuántas
 *    c) cantidad de alumnos que tienen que presentar segundas oportunidades
 *    d) promedio de cada uno de los alumnos que ya aprobaron la materia (indicar su número) y
 *       que número de alumno tiene el mayor promedio.
 * 
 *  | Alumnos | Unidad 1 | Unidad 2 | Unidad 3 | Unidad 4 | Unidad 5 |
 *  |---------|----------|----------|----------|----------|----------|
 *  | Diego   |    100   |    99    |     98   |   100    |   100    |
 *  | ...     |    75    |    45    |     85   |   69     |   67     |
 */

public class Ejercicio10 {
    /* Funciones */
    // Imprimir lineas para separar contenido
    public static void lines() {
        System.out.println("-------------------------------------------");
    }

    // Imprimir un arreglo
    public static void print_array(float[] array) {
        System.out.print("[");
        for(float n : array) {
            System.out.print(n+", ");
        }
        System.out.print("]\n");
    }

    // Imprimir una matriz
    public static void print_matrix(float[][] matrix) {
        System.out.println("[");
        for(float[] row : matrix) {
            System.out.print("\t");
            print_array(row);
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        // Variables
        Scanner input = new Scanner(System.in);
        int rows = 3, cols = 3;
        int i, j;

        int alumnos_aprobados = 0, alumnos_reprobados = 0, segundas = 0;
        float promedio;
        float[] promedios = new float[rows];

        float[][] calificaciones = new float[rows][cols];

        // Leer calificaciones
        for(i = 0; i < rows; i++) {
            lines();
            System.out.println("Alumno " + (i + 1));

            for(j = 0; j < cols; j++) {
                System.out.print("\tCalificación " + (j + 1) + ": ");
                calificaciones[i][j] = input.nextFloat();
            }
        }
        lines();

        // Obtener datos solicitados
        for(i = 0; i < rows; i++) {
            promedio = 0;

            // Obtener promedio inividual
            for(j = 0; j < cols; j++) {
                promedio += calificaciones[i][j];
            }
            promedio /= cols;
            promedios[i] = promedio;

            // Contar aprobados y reprobados
            if(promedio >= 70) {
                alumnos_aprobados++;
            } else {
                alumnos_reprobados++;
            }
        }

        // Mostrar datos solicitados
        print_matrix(calificaciones);
        lines();

        System.out.println("Promedios: ");
        for(i = 0; i < rows; i++) {
            System.out.println("\tAlumno " + (i + 1) + ": " + promedios[i]);
        }

        System.out.println("Alumnos aprobados: " + alumnos_aprobados);
        System.out.println("Alumnos reprobados: " + alumnos_reprobados);
        
        System.out.println("\nAlumnos que tienen que presentar segunda oportunidad: ");
        for(i = 0; i < rows; i++) {
            if(promedios[i] < 70) {
                System.out.print("\tAlumno " + (i + 1) + ": ");

                // calcular el total de segundas
                segundas = 0;
                for(j = 0; j < cols; j++) {
                    if(calificaciones[i][j] < 70) {
                        segundas++;
                    }
                }

                System.out.println(segundas+" segundas oportunidades");
            }
        }
        input.close();
    }
}
