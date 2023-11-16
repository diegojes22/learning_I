package ejercicios;

/**
 * @author: Jesus Gomez Romero
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
 *  Suponga que se ha definido una constante positiva entera N y una matriz "Matriz 1", 
 *  de dimensión N x N. Escriba un programa que ponga cero en ambas diagonales de 
 *  la matriz.
 */

public class Ejercicio1 {
	public static void main(String []args) {
		int Matriz1 [][] = new int[10][10];
		
		for(int r=0; r<10; r++) {
			for(int c=0; c<10; c++) {
				if(r==c) Matriz1[r][c] = 1;
				else Matriz1[r][c] = 0;
			}
		}
		
		for(int r=9; r>=0; r--) {
			Matriz1[r][(9-r)] = 1;
		}
		
		for(int r=0; r<10; r++) {
			for(int c=0; c<10; c++) {
				System.out.print(Matriz1[r][c]+" | ");
			}
			System.out.println();
		}
	}
}