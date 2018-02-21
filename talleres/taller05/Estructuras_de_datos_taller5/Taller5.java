/**
 * Write a description of class Taller5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;
public class Taller5
{
    public static void Arraysum(int[] A){ //c0
        int n=A.length;   //c1
        int sum=0;        //c2
        for(int i=0;i<n;i++){  //c3*n
            sum=sum+A[i];          //c4*n
        }
        System.out.println(sum);  //c5
    }  //c0+c1+c2+n(c3+c4)+c5

    public static int tablas(int n){ //c0
        int h=0;    //c1
        for(int i=1;i<=n;i++){ //(n-1)
            for(int j=1;j<=n;j++){ //(n-1)
                h += i*j;   // (n-1)^2
            }
        }
        return h; //c2
    }   //c0+c1+c2+(n-1)+(n-1)+(n-1)^2

    public static void ordenar(int[]A){ //c0
        int n=A.length;   //c1
        for(int i=0;i<n;i++){  //n
            int j=i;  //n
            while(j>0 && A[j-1]>A[j]){ //c4*n^2 ||c4*n(n-1)
                int temp= A[j]; //c5*n(n-1)
                A[j] = A[j-1];  //c6*n(n-1)
                A[j-1]=temp;    //c7*n(n-1)
                j=j-1;          //c8*n(n-1)
            }
        }
    } //c0+c1+n+n+c5*n(n-1)+c6*n(n-1)+c7*n(n-1)+c8*n(n-1)

    public static void main(String[] args){
        int size=0;
        int[] array = new int[size];
        //Arraysum
        for(int i=0;i<20;i++){
            //Tamaño del arreglo
            size=size+1000000;
            //Maximo numero del random
            int max=5000;
            array = new int[size];
            for(int j=0;j<size;j++)   {   
                Random generator=new Random();
                array[j]= generator.nextInt(max); 
            }
            int n=array.length-1;
            long startTime = System.currentTimeMillis();
            //Arraysum(array);
            long endTime = System.currentTimeMillis();
            long duration = (endTime - startTime);
            //System.out.println("Size: "+size+"    Time: "+duration);
        }
        
        //Tablas
        for(int i=10000; i<30000 ;i= i + 1000){
            long startTime = System.currentTimeMillis();
            //tablas(i);
            long endTime = System.currentTimeMillis();
            long duration = (endTime - startTime);
            System.out.println("i: "+i+"    Time: "+duration);        
        }
                
        //Ordenar
        size=0;
        array = new int[size];
        for(int i=0;i<20;i++){
            size=size+900;
            int max=5000;
            array = new int[size]; 
            for(int j=0;j<size;j++)   {   
                Random generator=new Random();
                array[j]= generator.nextInt(max); 
            }
            int n=array.length-1;
            long startTime = System.currentTimeMillis();
            //ordenar(array);
            long endTime = System.currentTimeMillis();
            long duration = (endTime - startTime);
            System.out.println("Size: "+size+"    Time: "+duration);
        }
    }
}