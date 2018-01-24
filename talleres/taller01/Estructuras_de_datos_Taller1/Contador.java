
public class Contador
{
    private String id;
    private int x=0;
    
    public Contador(String id){
    this.id=id;
    }
    
    public void incrementar(){
        id=String.valueOf(Integer.parseInt(id)+1);
        //setid();
        x++;
    }
    
    public int incrementos(){
        return x;
    }
    
    public String toString(){
        return id;
    }
    
    
}