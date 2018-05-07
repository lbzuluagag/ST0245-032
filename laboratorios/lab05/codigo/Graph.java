
/**
 * Abstract class Graph - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
import java.util.ArrayList;
public abstract class Graph
//https://github.com/ilabradors
{
    protected int size;
    public  Graph(int vertices) 
    {
        size = vertices;
    }

    public  abstract void addArc(int source, int destination, int weight);

    public abstract ArrayList<Integer> getSuccessors(int vertice);

    public abstract int getWeight(int source, int destination);

    public  int size() {return size;}
}
