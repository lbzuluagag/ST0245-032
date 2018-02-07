
public class Hanoi
{
    public static void hanoi(int discos){
    hanoi_real(discos,"inicio","mitad","destino");
    }
    
    public static void hanoi_real(int discos,String a,String b,String c){
    if(discos==1){
    System.out.println("mover disco desde "+a+" hasta "+c);
    }else {
    hanoi_real(discos-1,a,c,b);
    System.out.println("mover disco desde "+a+" hasta "+c);
    hanoi_real(discos-1,b,a,c);
    
    }
    
    }
    
    public static void main(String []args){
    hanoi(3);
    }
}
