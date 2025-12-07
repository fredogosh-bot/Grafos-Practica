package Implementacion;

public class Pila {
    
    private int tope = -1;
    private static int tamPila = 20;
    int[] pila = new int[tamPila];
    
    //---------------------------------------
    
    
    public void apilar(int x){
        tope++;
        pila[tope] = x;
    }
    
    
    public void desapilar(){
        tope--;
    }
    
    
    public int cima(){
        return pila[tope];
    }
    
       
    public boolean estaVacia(){
        return tope == -1;
    }
    
    
    public boolean estaLlena(){
        return tope == 49;
    }
    
    
    public int tamaño(){
        return tope+1;
    }
    
    
    public int cimaYDesapilar(){
        tope--;
        return pila[tope+1];
    }
    
}
