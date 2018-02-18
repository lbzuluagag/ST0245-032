
public class punto1
{
    public static void arraysum(int[]nums){
        System.out.print("La suma de los elementos es:"+aux(nums,0));

    }

    public static int aux(int[]nums,int i){
        if(i>=nums.length){
            return 0;
        }else {return nums[i]+aux(nums,i+1);}

    }
}
