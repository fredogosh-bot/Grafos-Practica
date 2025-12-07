package Implementacion;

public class Pila {
    
    private int tope;
    private int capacidad;
    private int[] arregloPila; // Usamos un nombre más claro

    // 1. Constructor flexible: El usuario decide el tamaño
    public Pila(int capacidad) {
        this.capacidad = capacidad;
        this.arregloPila = new int[capacidad];
        this.tope = -1; // -1 indica que está vacía
    }

    // 2. Método apilar (Push) con protección
    public boolean apilar(int x) {
        if (estaLlena()) {
            // Retornamos false o lanzamos excepción si no cabe más
            return false; 
        }
        tope++;
        arregloPila[tope] = x;
        return true;
    }

    // 3. Método desapilar optimizado
    // En las pilas estándar, desapilar SIEMPRE devuelve el objeto y lo elimina
    public int desapilar() {
        if (estaVacia()) {
            throw new RuntimeException("Error la pila esta vacia");
        }

        int elementoEliminado = arregloPila[tope];
        
        tope--;
        return elementoEliminado;
    }

    // Ver el último elemento sin sacarlo
    public int cima() {
        if (estaVacia()) {
            throw new RuntimeException("Error la pila esta vacia");
        }
        return arregloPila[tope];
    }

    public boolean estaVacia() {
        return tope == -1;
    }

    public boolean estaLlena() {
        // Comparamos contra la capacidad real, no un número fijo
        return tope == capacidad - 1;
    }

    public int tamañoActual() {
        return tope + 1;
    }
}