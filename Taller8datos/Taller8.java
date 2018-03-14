
import java.util.*;

/**
 *
 * @author 
 */
public class Taller8 {
       
    //Punto 1
    public static Stack<Integer> inversa (){
        Stack<Integer> stack = new Stack<Integer>();
        Stack<Integer> cont = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        cont.push(stack.pop());
        cont.push(stack.pop());
        cont.push(stack.pop());
        System.out.print(cont);
        return cont;
    }

    //Punto 2
    public static void cola (){
        Queue<String> queue = new LinkedList<String>();
        queue.add("Juan");
        queue.add("María");
        queue.add("Pedro");
        while(queue.peek()!=null)
            System.out.println("Atiendo a: "+queue.poll());
        return;
    }

    //notacion polaca
    public static int polaca  (String string){
        String []pol=string.split(" ");
        Stack<String> stack=new Stack<String>();
        for (String retval: string.split(" ")) {
            if(retval.equals("+")){
                String x=stack.pop();
                String y=stack.pop();
                int a= Integer.parseInt(x);
                int b= Integer.parseInt(y);
                stack.push(String.valueOf(a+b));
            }else if(retval.equals("-")){

                String x=stack.pop();
                String y=stack.pop();
                int a= Integer.parseInt(x);
                int b= Integer.parseInt(y);

                stack.push(String.valueOf(b-a));
            }else if(retval.equals("/")){
                
                String x=stack.pop();
                String y=stack.pop();
                int a= Integer.parseInt(x);
                int b= Integer.parseInt(y);
                
                stack.push(String.valueOf(a/b));
            }else if(retval.equals("*")){
                
                String x=stack.pop();
                String y=stack.pop();
                int a= Integer.parseInt(x);
                int b= Integer.parseInt(y);
                
                stack.push(String.valueOf(a*b));
            }else{stack.push(retval);} 
        }
        return Integer.parseInt(stack.pop());
    }
}


