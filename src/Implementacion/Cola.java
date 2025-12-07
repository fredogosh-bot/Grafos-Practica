package Implementacion;

public class Cola {

    

    private int max;    

    private int[] espacioCola = new int[max];

    private int frente, final0;
    

    public Cola(int max){
        
        this.max = max;
        this.espacioCola = new int[max];
        this.frente = -1;
        this.final0 = -1;

    }

    

    

    public boolean encolar(int dato){

        if(!estaLlena()){

            final0 = (final0 + 1) % max;

            espacioCola[final0] = dato;

            if (frente == -1)

                frente = 0;
            
            return true;
        
        }
        else
            return false;

    }

    

    

    public Integer desencolar(){
        int dato;
        
        if(!estaVacia()){

            dato = espacioCola[frente];

            if(frente == final0){

                frente = -1;

                final0 = -1;

            }else

                frente = (frente+1)%max;
            return dato;
        }
        else
            return null;
    }

    

    

    public boolean estaLlena(){

        

        if ((final0 +1)% max == frente)

            return true;

        else

            return false;

        

    }

    

    

    public boolean estaVacia(){

        if (frente == -1)

            return true;

        else

            return false;

    }

    

    

}