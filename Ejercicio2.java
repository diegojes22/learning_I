/**
 * Problema:
 * Escriba un programa que llene la diagonal principal de la Matriz2 (20x20) con los números
 * 1,2,3,...N. La diagonal principal de una matriz está formada por las casillas en las cuales el índice de
 * fila y de columna son iguales. Las otras posiciones de la matriz ponerlas a 0´s.
 */

public class Ejercicio2 {
    public static void main(String[] args) {
        // Variables
        int n = 20;
        int[][] matrix = new int[20][20];

        // Llenar matriz
        for(int i = 0; i < n; i++) {
            matrix[i][i] = i + 1;
        }

        // Mostrar matriz
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}

