
public class Euclides
{
    public int euclides(int p,int q){
        if(p!=0 && q!=0){
            
            return euclides(q,p%q);
        }
        return p;
    }
}
