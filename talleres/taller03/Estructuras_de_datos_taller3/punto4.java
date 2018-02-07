
public class punto4
{
    
    public static void per(String a){
    operacion("",a);
    }
    
    public static void operacion(String copia,String base){
        if(base.length()<=0){
        System.out.println(copia);
        }else{
            for(int i=0;i<base.length();i++){
            operacion(copia+base.charAt(i),base.substring(0,i)+base.substring(i+1));
            }
        }
    }
    
}
