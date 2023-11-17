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
 * Fecha de elaboración: 14/11/2020
 * 
 * Problema:
 * El dueño de un restaurante entrevista a 10 clientes de su negocio y les pide que califiquen de 1 a
 * 10 los siguientes aspectos: (1 es pésimo y 10 es excelente o inmejorable)
 *    - Atención de parte de los empleados
 *    - Calidad de la comida
 *    - Precio justo (¿el precio que pagó le parece justo?)
 *    - Ambiente (¿muebles cómodos?, ¿música adecuada?, iluminación suficiente?, decoración,
 *      etc.)
 * 
 * Escriba un programa que pida las calificaciones de los cinco clientes a cada uno de estos aspectos,
 * y luego almacene en un vector el promedio obtenido en cada uno de ellos. La matriz debe ser de 10
 * x 4 y el vector será de 4 posiciones. Imprimir cual es el aspecto mejor calificado. 
 */
public class Ejercicio6 
{
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
    public static void print_array(int[] array) {
        System.out.print("[");
        for(int n : array) {
            System.out.print(n+", ");
        }
        System.out.print("]\n");
    }
    
    public static void print_matrix(int[][] matrix) {
        System.out.println("[");
        for(int[] row : matrix) {
            System.out.print("\t");
            print_array(row);
        }
        System.out.println("]");
    }
    
    public static int get_pos_max_array(float[] array) {
        float max = array[0];
        int pos = 0;
        
        for(int i = 0; i < array.length; i++) {
            if(max < array[i]) {
                pos = i;
            }
        }
        
        return pos;
    }
    
    public static int get_pos_min_array(float[] array) {
        float min = array[0];
        int pos = 0;
        
        for(int i = 0; i < array.length; i++) {
            if(min > array[i]) {
                pos = i;
            }
        }
        
        return pos;
    }
    
    public static void main(String[] args) {
        // Variables
        Scanner in = new Scanner(System.in);
        int num_clients = 10, cols = 4;
        int[][] calificaciones = new int[num_clients][cols];
        float[] promedios = new float[cols];
        
        int suma, min, max;
        
        String[] clientes = {"Toño", "Luis", "Juan", " Jesus", "Diego", "Ana", "Luisa", "Ceci", "Lalito", "Beto"};
        String[] aspectos = {"Atencion", "Calidad", "Precio", "Ambiente"};
        
        // Leer calificaciones
        for(int i = 0; i < num_clients; i++) {
            lines();
            for(int j = 0; j < cols; j++) {
                do {
                    System.out.print(clientes[i]+" dame la calificacion del aspecto de "+aspectos[j]+" >_ ");
                    calificaciones[i][j] = in.nextInt();
                } while(calificaciones[i][j] < 0 || calificaciones[i][j] > 10);
            }
        }
        
        // Calcular el promedio de cada uno de los aspectos
        for(int j = 0; j < cols; j++) {
            suma = 0;
            
            for(int i = 0; i < num_clients; i++) {
                suma += calificaciones[i][j];
            }
            
            promedios[j] = suma / num_clients;
        }
        
        max = get_pos_max_array(promedios);
        min = get_pos_min_array(promedios);
        
        // Mostrar datos
        lines();
        System.out.println("Ciente \tAten.\tCalidad\tPrecio\tAmbiente");
        for(int i = 0; i < num_clients; i++) {
            System.out.print(clientes[i]+'\t');
            
            for(int j = 0; j < cols; j++) {
                System.out.print(calificaciones[i][j]+",\t"
                        + "");
            }
            System.out.println("");
        }
        
        lines();
        System.out.println("Aspectos:");
        for(int i = 0; i < cols; i++) {
            System.out.println("\t"+aspectos[i]+": "+promedios[i]);
        }
        
        lines();
        System.out.println("El aspecto mejor calificado es "+aspectos[max]+" con un promedio de "+promedios[max]);
        System.out.println("El aspecto peor calificado es "+aspectos[min]+" con un promedio de "+promedios[min]);
        
        lines();
        in.close();
    }
}
