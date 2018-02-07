
public class punto2
{
    public static void punto2(String s){
    aux("",s);
    }
    
    public static void aux(String copia,String base){
    if (base.length()==0){
    System.out.println(copia);
    }else{
    aux(copia+base.charAt(0),base.substring(1));
    aux(copia,base.substring(1));
    }
    
    }
}
