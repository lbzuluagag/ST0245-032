import java.util.ArrayList;

public class DiagraphAM extends Graph {

    int[][] matriz;

    public DiagraphAM(int size) {
        super(size);
        matriz = new int[size][size];
    }

    public int getWeight(int source, int destination) {
        return matriz[source][destination];
    }

    public void addArc(int source, int destination, int weight) {
        matriz[source][destination] = weight;
    }

    public ArrayList<Integer> getSuccessors(int vertex, int size) {
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if (matriz[vertex][i] != 0) {
                lista.add(i);
            }
        }
        return lista;
    }
    //Override implementado por el método abstracto
    @Override
    public ArrayList<Integer> getSuccessors(int vertice) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}