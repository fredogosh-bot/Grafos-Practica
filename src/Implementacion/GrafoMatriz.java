package Implementacion;


    
public class GrafoMatriz {

    
    private int[][] matAd;
    private int numVerts;
    

    public void setNumVerts(int numVerts) {
        this.numVerts = numVerts;
    }

    public int getNumVerts() {
        return numVerts;
    }
    

    public void nuevoArco(int va, int vb) {
        va --;
        vb --;
        if (va < 0 || vb < 0 || va > numVerts || vb > numVerts)            
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
        va--;
        vb--;

        if (va < 0 || vb < 0 || va >= numVerts || vb >= numVerts) 
            throw new IllegalArgumentException("Índice de vértice fuera de rango.");
        
        return matAd[va][vb] == 1;
    }

    public void Pvalor(int va, int vb, int v) {
        va--;
        vb--;
        // Validación de índices (consistente con el método adyacente)
        if (va < 0 || vb < 0 || va >= numVerts || vb >= numVerts) 
            throw new IllegalArgumentException("Índice de vértice fuera de rango.");

        matAd[va][vb] = v;
    }
    
    
    // este es un proceso que se le aplica a la matriz de adyacencia
    // por eso no entra como parametro es un metodo del objeto grafo
    public void RecAncho(int[][] matAd,int vertice){
        
            int[] procesados = new int[numVerts];
            Cola recAnchura = new Cola();
            recAnchura.insertaCCircular(vertice); //se inserta el vertice en la cola       
            procesados[0] = vertice;//el vertice se marca como visitado
            
            while(!recAnchura.colaCircularVacia()){
                
            }
        
    }
    
    public void RecProfundidad(int vertice){
        Pila recProfundo = new Pila();
    }
    
}
