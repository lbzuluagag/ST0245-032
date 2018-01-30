
public class Cadena
{
    public static void La_cadena(String s){
        auxiliar("",s);
    }
    
    public static void auxiliar(String copia,String s){
    
        if(s.length()==0){System.out.println(copia);
        }else{
        auxiliar(copia+s.charAt(0),s.substring(1));
        auxiliar(copia,s.substring(1));
        }
    }
}
