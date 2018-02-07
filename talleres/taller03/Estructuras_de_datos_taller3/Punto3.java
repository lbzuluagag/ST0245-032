
public class Punto3
{
    public static void per(String a){
    operacion2("",a);
    }
    
        public static void operacion2(String copia,String base){
        if(copia.length()==base.length()){
        System.out.println(copia);
        }else{
            for(int i=0;i<base.length();i++){
            operacion2(copia+base.charAt(i),base);
            }
        }
    }
    
}
