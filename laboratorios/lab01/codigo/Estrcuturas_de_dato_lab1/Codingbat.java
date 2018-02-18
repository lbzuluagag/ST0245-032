
public class Codingbat
{
    public static int count8(int n) {
        if(n/10==0){

            if(n==8)
                return 1;
            return 0;
        }else if(n%10==8){
            if((n/10)%10==8){
                return 2+(count8(n/10));

            }else {return 1+count8(n/10);}
        }else {return 0+count8(n/10);}
    }

    public static int powerN(int base, int n) {
        if(n==0){
            return 1;
        }else return base*powerN(base,n-1);
    }

    public static int countX(String str) {
        if(str.length()>0){
            if(str.charAt(0)=='x'){
                return 1+countX(str.substring(1));
            }else {return 0+countX(str.substring(1));}
        }else return 0;
    }

    public static int countHi(String str) {
        if(str.length()>=2){
            int x=(str.substring(0,2).compareTo("hi"));
            if(x==0){
                return 1+countHi(str.substring(1));
            }else return 0+countHi(str.substring(1));
        }else {return 0;}
    }

    public static String changeXY(String str) {
        return str.replace("x","y");
    }

    //recursion 2
    //split53
    public static boolean split53(int[] nums) {
        return help(nums,0,0,0);
    }

    public static boolean help(int[] nums,int cont5,int cont3,int i){
        if(i>=nums.length) return cont3==cont5;

        if(nums[i]%5==0) return help(nums,cont5+nums[i],cont3,i+1);

        if(nums[i]%3==0) return help(nums,cont5,cont3+nums[i],i+1);

        return help(nums,cont5+nums[i],cont3,i+1)||help(nums,cont5,cont3+nums[i],i+1);

    }

    //splitarray
    public static boolean splitArray(int[] nums) {
        return help2(nums,0,0,0);
    }

    public static boolean help2(int[]nums,int i,int cont1,int cont2){
        if(i>=nums.length) return cont1==cont2;
        return help(nums,i+1,cont1+nums[i],cont2)||help(nums,i+1,cont1,cont2+nums[i]);

    }

    //splitOdd10
    public static boolean splitOdd10(int[] nums) {
        return help3(nums,0,0,0);  
    }

    public static boolean help3(int[]nums,int i,int cont1,int cont2){
        if(i>=nums.length){
            if(cont1%10==0 && cont2%2==1)return true;
            if(cont1%2==1 && cont2%10==0)return true;
            return false;
        }
        return help3(nums,i+1,cont1+nums[i],cont2)||help3(nums,i+1,cont1,cont2+nums[i]);
    }

    //groupsum6

    public static boolean groupSum6(int start, int[] nums, int target) {
        if(start>=nums.length){
            if(target==0)return true;
            return false;
        }else {}
        if(nums[start]==6)return groupSum6(start+1,nums,target-6);
        return groupSum6(start+1,nums,target-nums[start])||groupSum6(start+1,nums,target);
    }

    //groupsum5

    public static boolean groupSum5(int start, int[] nums, int target) {
        if(start>=nums.length)return target==0;
        if(nums[start]%5==0){
            if(start<nums.length-1){
                if(nums[start+1]==1){
                    return groupSum5(start+2,nums,target-nums[start]);
                }else {return groupSum5(start+1,nums,target-nums[start]);}
            }return groupSum5(start+1,nums,target-nums[start]);
        }return groupSum5(start+1,nums,target-nums[start])||groupSum5(start+1,nums,target);
    }

}
