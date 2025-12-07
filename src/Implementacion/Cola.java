package Implementacion;

public class Cola {
    
    private int[] espacioCola;
    private int frente;
    private int fin; // Cambié final0 por fin para ser más claro
    private int capacidad; // Para saber el tamaño máximo
    private int cantidadElementos; // Opcional, pero útil para saber cuántos hay

    // Constructor que permite definir el tamaño de la cola
    
    public Cola(){
        
    }
    
    public Cola(int tamaño) {
        this.capacidad = tamaño;
        this.espacioCola = new int[capacidad];
        this.frente = 0; // En implementaciones modernas, suele iniciar en 0
        this.fin = -1;
        this.cantidadElementos = 0;
    }

    // Método para insertar (Encolar / Enqueue)
    public boolean encolar(int dato) {
        if (estaLlena()) {
            return false; // O podrías lanzar una excepción
        }
        
        // Lógica circular para el índice final
        fin = (fin + 1) % capacidad;
        espacioCola[fin] = dato;
        cantidadElementos++;
        
        return true;
    }

    // Método para eliminar (Desencolar / Dequeue)
    // CAMBIO IMPORTANTE: Ahora devuelve el dato directamente
    public Integer desencolar() {
        if (estaVacia()) {
            return null; // Retorna null si no hay nada que sacar
        }

        int datoEliminado = espacioCola[frente];
        // Lógica circular para el índice frente
        frente = (frente + 1) % capacidad;
        cantidadElementos--;

        return datoEliminado;
    }
    
    // Método para ver el primer elemento sin sacarlo (Peek)
    public Integer verFrente() {
        if (estaVacia()) {
            return null;
        }
        return espacioCola[frente];
    }

    public boolean estaLlena() {
        return cantidadElementos == capacidad;
    }

    public boolean estaVacia() {
        return cantidadElementos == 0;
    }
    
    public int getTamañoActual() {
        return cantidadElementos;
    }
}