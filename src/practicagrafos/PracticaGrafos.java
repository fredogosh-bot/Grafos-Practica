package practicagrafos;

import java.util.Scanner;
import Implementacion.*;
        
public class PracticaGrafos {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int vertice;
        
        GrafoMatriz matriz1 = new GrafoMatriz(7);
        GrafoMatriz matriz2 = new GrafoMatriz(9);
        GrafoMatriz matriz3 = new GrafoMatriz(11);
        
        matriz1.nuevoArco(1, 2);
        matriz1.nuevoArco(1, 4);
        matriz1.nuevoArco(1, 7);
        matriz1.nuevoArco(2, 5);
        matriz1.nuevoArco(2, 6);
        matriz1.nuevoArco(3, 6);
        matriz1.nuevoArco(4, 6);
        matriz1.nuevoArco(5, 7);
        
        matriz2.nuevoArco(1, 2);
        matriz2.nuevoArco(1, 4);
        matriz2.nuevoArco(1, 5);
        matriz2.nuevoArco(2, 3);
        matriz2.nuevoArco(2, 5);
        matriz2.nuevoArco(3, 6);
        matriz2.nuevoArco(4, 7);
        matriz2.nuevoArco(5, 7);
        matriz2.nuevoArco(7, 8);
        matriz2.nuevoArco(8, 9);
        
        matriz3.nuevoArco(1, 2);
        matriz3.nuevoArco(1, 3);
        matriz3.nuevoArco(1, 4);
        matriz3.nuevoArco(2, 5);
        matriz3.nuevoArco(3, 7);
        matriz3.nuevoArco(4, 8);        
        matriz3.nuevoArco(5, 9);
        matriz3.nuevoArco(6, 9);
        matriz3.nuevoArco(7, 10);
        matriz3.nuevoArco(8, 11);
        matriz3.nuevoArco(10, 11);
        
        
        System.out.println("Dame un vertice para recorrer por profundidad");
        vertice = in.nextInt();
        
        System.out.println("Recorrido del primer grafo");
        matriz1.recProfundo(vertice);
        
        System.out.println("Recorrido del segundo grafo");
        matriz2.recProfundo(vertice);
        
        System.out.println("Recorrido del tercer grafo");
        matriz3.recProfundo(vertice);

        in.close();
    
    
    
    }
    
}
