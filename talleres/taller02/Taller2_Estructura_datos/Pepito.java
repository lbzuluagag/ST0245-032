
public class Pepito
{

    public static boolean pepe(int start,int []nums,int target){
        if(start>=nums.length)return target==0;
        return pepe(start+1,nums,target-nums[start])||pepe(start+1,nums,target);
    }
}