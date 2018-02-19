
public class punto1
{
       //Punto 1.1
    public static void arraysum(int[]nums){
        System.out.print("La suma de los elementos es:"+aux2(nums,0));
    }
    public static int aux2(int[]nums,int i){
        if(i>=nums.length){
            return 0;
        }else {return nums[i]+aux2(nums,i+1);}
    }
    //Punto 1.2
    public static int maximo(int arr[]){
        return aux(arr,0);
    }
    public static int aux(int a[],int n){
        int max=a[n];
        int temp;
        if(n==0){
            max=a[0];
        }
        if(n!=0){
            temp = aux(a,n-1);
            if(temp>max){
                max=temp;
            }
        }
        return max;
    }
    //Punto 1.3
    public static int fibonacci(int n){
        if (n<=1){
            return n;
        }
        else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    
 
}
