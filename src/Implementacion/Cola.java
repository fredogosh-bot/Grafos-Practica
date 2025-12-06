package Implementacion;

public class Cola {
    
    private static final int MAX = 20;    
    private int[] espacioCola = new int[MAX];
    private int frente, final0;
    private int dato;
    
    public int getDato(){
        return dato;
    }
    
    public void setDato(int dato){
        this.dato = dato;
    }
    
    public Cola(){
        frente = -1;
        final0 = -1;
    }
    
    
    public boolean insertaCCircular(int dato){
        boolean resp = false;
        if(!colaCircularLlena()){
            resp = true;
            final0 = (final0 + 1) % MAX;
            espacioCola[final0] = dato;
            if (frente == -1)
                frente = 0;
        }
        return resp;
    }
    
    
    public boolean eliminaCCircular(){
        boolean resp = false;
        if(!colaCircularVacia()){
            resp = true;
            setDato(espacioCola[frente]);
            if(frente == final0){
                frente = -1;
                final0 = -1;
            }else
                frente = (frente+1)%MAX;
        }
        return resp;
    }
    
    
    public boolean colaCircularLlena(){
        
        if ((final0 +1)% MAX == frente)
            return true;
        else
            return false;
        
    }
    
    
    public boolean colaCircularVacia(){
        if (frente == -1)
            return true;
        else
            return false;
    }
    
    
}
