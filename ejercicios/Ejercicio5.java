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
 * Fecha de elaboración: 09/11/2020
 * 
 * Problema:
 * La abarrotera "La Surtidora" cuenta con 7 sucursales distribuidas en todo el estado; y nesesitan analizar
 * datos de sus ventas y en los primeros seis meses del año. Considere que las ventas por cada sucursal se
 * leen y guardan en una matriz (Los renglones representan las sucursales y las columnas los meses).
 *    a) Total de ventas por cada sucursal
 *    b) Total de ventas por mes
 *    c) Sucursal que obtuvo el máximo de ventas
 *    d) Sucursal que obtuvo el mínimo de ventas
 *    e) Mes en que se vendió más
 *    f) Mes en que se vendió menos
 *    g) Qué sucursales tienen ventas mayores que el promedio
 *    h) Qué sucursales tienen ventas menores que el promedio 
 * 
 * El manejo de los datos sera de la siguiente forma:
 * |tiendas | Enero | Febrero | Marzo | Abril | Mayo | Junio|
 * |--------|-------|---------|-------|-------|------|------|
 * |Tienda 1|       |         |       |       |      |      |
 */

public class Ejercicio5 {
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
    
    // Obtener el valor maximo de un arreglo
    public static float get_pos_max_array(float[] array) {
        float max = array[0];
        
        for(int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        
        return max;
    }
    
    // Obtener el valor minimo de un arreglo
    public static float get_pos_min_array(float[] array) {
        float min = array[0];
        
        for(int i = 0; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
        
        return min;
    }
    
    public static void main(String[] args) {
        /* Variables */
        Scanner in = new Scanner(System.in);
        int cols = 7, rows = 6;
        float[][] table = new float[cols][rows];
        
        float sum = 0; 
        
        // datos a calcular
        float promedio_general = 0;
        float[] total_ventas_sucursal = new float[cols];
        float[] total_ventas_mes = new float[rows];
        
        // Ingresar las ganancias
        lines();
        System.out.println("\tCapturar Ventas");
        
        for(int i = 0; i < cols; i++) {
            lines();
            System.out.println("SUCURSAL "+(i+1));
            for(int j = 0; j < rows; j++) {
                System.out.print("\tMes "+(j+1)+": ");
                table[i][j] = in.nextFloat();
            }
        }
        
        /* Realizar calculos solicitados */
        for(int i = 0; i < cols; i++) {   // calcular el total de ventas por sucursal
            sum = 0;
            
            for(int j = 0; j < rows; j++) {
                sum += table[i][j];
            }
            total_ventas_sucursal[i] = sum;
        }
        
        for(int i = 0; i < cols; i++) {    // pormedio general
            promedio_general += (total_ventas_sucursal[i] / rows);
        }
        promedio_general /= cols;
        
        for(int i = 0; i < rows; i++) {   // promedio por mes
            sum = 0;
            for(int j = 0; j < cols; j++) {
                sum += table[j][i];
            }
            total_ventas_mes[i] = sum;
        }
        
        /* Mostrar datos */
        // Mostrar tabla
        System.out.println("Sucursal  |\tMes 1\t|\tMes 2\t|\tMes 3\t|\tMes 4\t|\tMes 5\t|\tMes 6\t|");
        for(int i = 0; i < cols; i++) {
            System.out.print("SUCURSAL "+(i+1)+"|\t");
            for(int j = 0; j < rows; j++) {
                System.out.print(table[i][j]+"\t|\t");
            }
            System.out.print("\n");
        }
        System.out.println("\n\n");
        
        System.out.print("Total de ventas pos sucursal: "); print_array(total_ventas_sucursal);
        System.out.print("Total de ventas pos mes.....: "); print_array(total_ventas_mes);
        System.out.println("Promedio general de ventas....:"+promedio_general);
        System.out.println("Tienda que vendio mas.......:"+get_pos_max_array(total_ventas_sucursal));
        System.out.println("Tienda que vendio menos.....:"+get_pos_min_array(total_ventas_sucursal));
        System.out.println("Mes de mayor ganancia.......:"+get_pos_max_array(total_ventas_mes));
        System.out.println("Mes de menor ganancia.......:"+get_pos_min_array(total_ventas_mes));
        System.out.println("Tiendas con ventas mayores al promedio:");
        for(int i = 0; i < cols; i++) {
            if (total_ventas_sucursal[i] > promedio_general) {
                System.out.println("\tSucursal "+(i+1));
            }
        }
        System.out.println("Tiendas con ventas menores al promedio:");
        for(int i = 0; i < cols; i++) {
            if (total_ventas_sucursal[i] < promedio_general) {
                System.out.println("\tSucursal "+(i+1));
            }
        }

        in.close();
    }
}
