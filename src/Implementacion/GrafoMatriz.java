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
    
    // Método público que llama el usuario
    public void recProfundo(int verticeInicio) {
        verticeInicio--; // Ajustar índice usuario -> arreglo
        
        boolean[] visitados = new boolean[numVerts];
        
        // Llamada inicial a la recursión
        dfs(verticeInicio, visitados);
    }

    // Método privado recursivo
    private void dfs(int actual, boolean[] visitados) {
        // PASO 1: Marcar el nodo 'actual' como visitado
        visitados[actual] = true;
        
        // PASO 2: Imprimir el nodo (recuerda sumar 1 para mostrar al usuario)
        System.out.println("Elemento visitado: " + (actual+1));

        // PASO 3: Recorrer todos los posibles vecinos
        for (int i = 0; i < numVerts; i++) {
            
            if ( adyacente(actual, i) && !visitados[i] ) {
                
                // operacion recursiva
                dfs(i, visitados);
            }
        }
    }
    

    
}
