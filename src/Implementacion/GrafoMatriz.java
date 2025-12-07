package Implementacion;


    
public class GrafoMatriz {

    private int numVerts;
    private int[][] matAd;
    
    public GrafoMatriz(int numVerts) {
        this.numVerts = numVerts;
        this.matAd = new int[numVerts][numVerts]; // Se crea con el tamaño correcto
    }    

    public void nuevoArco(int va, int vb) {
        va --;
        vb --;
        
        if (va < 0 || vb < 0 || va >= numVerts || vb >= numVerts)            
            throw new IllegalArgumentException("Índice de vértice fuera de rango.");
        
        matAd[va][vb] = 1;
        matAd[vb][va] = 1;//modificacion para grafos no dirigidos ya que son simetricos
                            
    }
    
    /*
    
    // para grafos ponderados
    public void nuevoArco(int va, int vb, int valor) {
        
        if (va < 0 || vb < 0 || va > numVerts || vb > numVerts) 
            throw new IllegalArgumentException("Índice de vértice fuera de rango.");
        
        matAd[va][vb] = valor;
    }
    */

    public boolean adyacente(int va, int vb) {

        if (va < 0 || vb < 0 || va >= numVerts || vb >= numVerts) 
            throw new IllegalArgumentException("Índice de vértice fuera de rango.");
        
        return matAd[va][vb] == 1;
    }

    public void Pvalor(int va, int vb, int v) {

        // Validación de índices (consistente con el método adyacente)
        if (va < 0 || vb < 0 || va >= numVerts || vb >= numVerts) 
            throw new IllegalArgumentException("Índice de vértice fuera de rango.");

        matAd[va][vb] = v;
    }
    
    // método iterativo utilizando la pila DFS
    public void recProfundo(int verticeInicio) {
        verticeInicio--; // ajuste inicial de usuario a índice
        
        // uso boolean en lugar de numeros
        boolean[] visitados = new boolean[numVerts]; 
        
        Pila pilaProcesos = new Pila(numVerts); // ojala mi clase Pila funcione bien
        pilaProcesos.apilar(verticeInicio);
        visitados[verticeInicio] = true;
            
        int marcador = 1;
        
        while (!pilaProcesos.estaVacia()) {

            int va = pilaProcesos.desapilar(); 

            System.out.println("Elemento " + marcador + ": " + (va + 1)); // Imprime +1 para el usuario

            for (int vb = 0; vb < numVerts; vb++) {
                // visitados [] verifica si NO ha sido visitado
                if (adyacente(va,vb) && !visitados[vb]) {
                    pilaProcesos.apilar(vb);
                    visitados[vb] = true; // marca como visitado al apilar para evitar duplicados
                }
            }
            marcador++;
        }
    }

    

    
}
