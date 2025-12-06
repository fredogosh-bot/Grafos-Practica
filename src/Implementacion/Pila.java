package Implementacion;

public class Pila {
    
    private int tope = -1;
    private static int tamPila = 20;
    Object[] pila = new Object[tamPila];
    
    //---------------------------------------
    
    
    public void apilar(Object x){
        tope++;
        pila[tope] = x;
    }
    
    
    public void desapilar(){
        tope--;
    }
    
    
    public Object cima(){
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
    
    
    public Object cimaYDesapilar(){
        tope--;
        return pila[tope+1];
    }
    
}
