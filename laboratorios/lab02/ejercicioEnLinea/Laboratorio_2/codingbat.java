
public class codingbat
{
    //codingbat Array2
    public int sum13(int[] nums) {
  int cont=0;
  if (nums.length==0){
    return 0;
  }else{}
  for(int i=0;i<nums.length;i++){
    if(nums[i]==13){
      i++;
    }else{cont=cont+nums[i];}
    
  }
  return cont;
}
//Array 2
public int sum67(int[] nums) {
 boolean bandera=true;
 int cont=0;
 for(int i=0;i<nums.length;i++){
   
   if(nums[i]==6){
     bandera=false;
   }else{}
   if(bandera==true){
     cont=cont+nums[i];
   }
   if(nums[i]==7){
     bandera=true;
   }else{}
 }
 return cont;
}
//Array 2
public boolean has22(int[] nums) {
  for(int i=0;i<nums.length-1;i++){
    if(nums[i]==2 && nums[i+1]==2){
      return true;
    }else{}
    
  }
  return false;
}
//Array 2
public boolean lucky13(int[] nums) {
  for(int i=0;i<nums.length;i++){
    if(nums[i]==1 || nums[i]==3){
      return false;
    }
  }
  return true;
}
//Array 2
public boolean sum28(int[] nums) {
  int cont=4;
  
  for(int i=0;i<nums.length;i++){
    if(nums[i]==2){
      cont--;
    }else{}
    
  }
  return cont==0;
}
//Array 3
public boolean canBalance(int[] nums) {
  int conti=0;
  int contd=0;
  for(int i=0;i<nums.length;i++){
    conti=0;
    contd=0;
    for(int j=0;j<nums.length;j++){
      if(j>i){
        conti=conti+nums[j];
      }else {contd=contd+nums[j];}
    }
    if(contd==conti){
      return true;
    }else{}
    
  }
  return false;
}
//Array 3
public int[] seriesUp(int n) {
  int nums[]=new int[(n*(n+1))/2];
  int pos=0;
 for(int i=1;i<=n;i++){
   for(int j=1;j<=i;j++){
     nums[pos]=j;
     pos++;
   }
 } 
 return nums;
}
//Array 3
public int[] fix45(int[] nums) {
int cont=0;
  for(int i=0;i<nums.length-1;i++){
    if(nums[i]==4 && nums[i+1]!=5){
      while(nums[cont]!=5 ||(cont != 0 && nums[cont - 1] == 4) ){
        cont++;
      }
      nums[cont]=nums[i+1];
      nums[1+i]=5;
    }
  }
  return nums;
}
//Array 3
public int[] fix34(int[] nums) {
  int temp=0;
  for(int i=0; i<nums.length; i++){
    if(nums[i]==3){
        temp = nums[i+1];
        nums[i+1]=4;
      for(int j=i+2; j<nums.length; j++){
        if(nums[j]==4){
          nums[j]=temp;
        }
      }
    }  
  }
  return nums; 
}
//Array
public int[] squareUp(int n) { //c0
  int[] nums = new int[n*n]; //c12
  int cont = 0; // c1
  int p = 1; // c2
  if(n == 0){ // c3
    return nums; // c4
  }
  for(int i = n-1; i<nums.length; i+=n) { // c5*n
     cont = i;  // c6*n
     for(int j = 1; j <= p; j++) { // c7*(n*n)
      nums[cont] = j; // c8*(n*n)
      cont--; // c9*(n*n)
     }
     p++; // c10*n
  }
  return nums; // c11
}



}
