package ejercicios;

/*
 * @author: Jesús Gómez Romero
 * Equipo:
 *  - Jesús Gómez Romero
 *  - Diego Jesús Muñoz Andrade
 * 
 * 1-C Bis
 *  
 * Instituto Tecnológico de La Piedad
 * Fecha: 13/11/20203
 * 
 * Problema 7:
 *  Diseñe un programa que almacena en la memoria de la computadora una matriz
 *  de 30 x 30 con las siguientes características:
 *  
 *  a) los elementos de la diagonal principal tienen 1’s 
 *  b) los elementos de arriba de la diagonal principal tienen 0´s 
 *  c) los elementos de abajo de la diagonal principal tienen 2´s
 */

public class Ejercicio7 {
	public static void main(String []args) {
		int Matriz1[][] = new int[30][30];
		
		for(int r=0; r<30; r++) {
			for(int c=0; c<30; c++) {
				if(r==c) Matriz1[r][c] = 1;
				else Matriz1[r][c] = 0;
				if(r>c) Matriz1[r][c] = 2;
			}
		}
		
		for(int r=0; r<30; r++) {
			for(int c=0; c<30; c++) {
				System.out.print(Matriz1[r][c]+" | ");
			}
			System.out.println();
		}
	}

}