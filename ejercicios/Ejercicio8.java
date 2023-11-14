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
 * Fecha de elaboración: 12/09/2020
 * 
 * Problema:
 * Diseñe un programa con una matriz de 10x10, y lee valores de tipo flotante para guardar en la
 * matriz. Posteriormente determine cuál es el elemento mayor y en qué posición esta; y cuál es el
 * menor y en qué posición se encuentra. 
 */

public class Ejercicio8 
{
    /* Funciones */
    // Imprimir lineas para separar contenido
    public static void lines() {
        System.out.println("-------------------------------------------");
    }

    // Obtener el valor maximo de un arreglo
    public static int[] get_pos_max_array(float[][] array, int row, int column) {
        float max = array[0][0];
        int[] pos = {0, 0};
        
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                if(max < array[i][j]) {
                    pos[0] = i;
                    pos[1] = j;
                }
            }
        }
        
        return pos;
    }
    
    // Obtener el valor minimo de un arreglo
    public static int[] get_pos_min_array(float[][] array, int row, int column) {
        float min = array[0][0];
        int[] pos = {0, 0};
        
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                if(min > array[i][j]) {
                    pos[0] = i;
                    pos[1] = j;
                }
            }
        }
        
        return pos;
    }
    public static void main(String[] args) {
        // Variables
        Scanner input = new Scanner(System.in);
        final int n = 3;
        int i, j;

        float[][] matrix = new float[n][n];
        float min, max;

        // Pedir datos
        System.out.println("Ingresa los datos de la matriz");
        for(i = 0; i < n; i++) {
            System.out.println("--------------------------------------------------------------\nIngresa los datos de la fila " + (i + 1) + "");

            for(j = 0; j < n; j++) {
                System.out.print("\tIngresa el valor de la posición [" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextFloat();
            }
        }

        // Obtener el minimo y el maximo e imprimirlo 
        min = matrix[get_pos_min_array(matrix, n, n)[0]][get_pos_min_array(matrix, n, n)[1]];
        max = matrix[get_pos_max_array(matrix, n, n)[0]][get_pos_max_array(matrix, n, n)[1]];

        System.out.println("--------------------------------------------------------------");
        System.out.println("El valor máximo es: " + max);
        System.out.println("El valor minimo es: " + min);

        input.close();
    }    
}