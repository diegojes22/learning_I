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
 * Fecha de elaboración: 22/09/2020
 * 
 * Problema:
 * Diseñe un programa que permita guardar en un arreglo de una dimensión las sumas de las filas
 * de una matriz. Esto es, la suma de los elementos de la primera fila deberá quedar guardada en la
 * primera posición del arreglo, la suma de los elementos de la segunda fila en la segunda posición, y
 * así sucesivamente para todas las filas de la matriz. La máxima dimensión de la matriz es 10x5 (10
 * filas y 5 columnas) y la del vector es 10. Por ejemplo, si el usuario ingresa la siguiente matriz de 3x5
 * (3 filas, 5 columnas).
 * 
 * [
 *   [10 20 30 40 10],
 *   [1  2  3  4  5 ],
 *   [10 20 1  2  3 ]
 * ]
 * El resultado sería el arreglo siguiente:
 * [110, 15, 36 ]
 */

public class Ejercicio4
{
    public static void main(String[] args) {
        // Variables
        Scanner input = new Scanner(System.in);
        int rows = 3, columns = 5;
        int i = 0, j = 0;

        int[][] matrix = new int[rows][columns];
        int[] array = new int[rows];

        // Pedir datos
        System.out.println("Ingresa los datos de la matriz");
        for(i = 0; i < rows; i++) {
            System.out.println("--------------------------------------------------------------\nIngresa los datos de la fila " + (i + 1) + "");

            for(j = 0; j < columns; j++) {
                System.out.print("\tIngresa el valor de la posición [" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }

        // Calcular el arreglo
        for(i = 0; i < rows; i++) {
            for(j = 0; j < columns; j++) {
                array[i] += matrix[i][j];
            }
        }

        // Mostrar el arreglo
        System.out.println("--------------------------------------------------------------");
        for(i = 0; i < rows; i++) {
            System.out.println("La suma de la fila " + (i + 1) + " es: " + array[i]);
        }
        System.out.println("--------------------------------------------------------------");

        input.close();
    }
}