import java.lang.IndexOutOfBoundsException; // Usar esto cuando se salga el índice
// Una lista simplemente enlazada
import java.util.*;
public class LinkedListMauricio {
    // Un nodo para una lista simplemente enlazada
    class Node {
        public int data;
        public Node next;
        public Node(int data)
        {
            next = null;
            this.data = data;
        }  
    }
    int codigo;
    String referencia;
    Stack<Integer> nei=new Stack<Integer>();
    Stack<String> nes=new Stack<String>();

    private Node first;
    private int size;
    public LinkedListMauricio()
    {
        size = 0;
        first = null;   
    }

    /**
     * Returns the node at the specified position in this list.
     * @param index - index of the node to return
     * @return the node at the specified position in this list
     * @throws IndexOutOfBoundsException
     */
    private Node getNode(int index) throws IndexOutOfBoundsException {
        if (index >= 0 && index < size) {
            Node temp = first;
            for (int i = 0; i < index; i++) {
                temp = temp.next; 
            }
            return temp;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    /**
     * Returns the element at the specified position in this list.
     * @param index - index of the element to return
     * @return the element at the specified position in this list
     */
    public int get(int index) {
        Node temp = null;
        try {
            temp = getNode(index);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            System.exit(0);
        }

        return temp.data;
    }

    // Retorna el tamaño actual de la lista
    public int size() // O(1)
    {
        return this.size;
    }

    // Inserta un dato en la posición index
    public void insert(int data, int index)
    {
        Node n = new Node(data);
        if(index==0){
            n.next=first;
            first=n;

        }else {
            Node cont=this.getNode(index-1);
            n.next=cont.next;
            cont.next=n;
        }
        size++;
    }

    public int multiplicacion(){
        int x=1;
        Node cont;
        cont=first;
        for(int i=0;i<size;i++){
            x=cont.data*x;
            cont=cont.next;
        }
        return x;
    }

    public void smartinsert(int data){
        boolean bandera=contains(data);
        if(bandera==true){
            return;
        }else{
            insert(data,size);
        }

    }

    public void pivote(){
        int pos=0;
        int res;
        int num=999999;
        for(int i=0;i<size;i++){
            int conti=0;
            int contd=0;
            for(int j=0;j<size;j++){
                if(j<i){
                    conti=get(j)+conti;
                }else {contd=get(j)+contd;}
            }
            if(conti-contd<0){
                res=(conti-contd)*(-1);
            }else{res=conti-contd;}

            if(res<num){
                num=res;
                pos=i;
            }else{}
        }
        System.out.println(num+"  "+pos);
    }
    // Borra el dato en la posición index
    public void remove(int index)
    {
        if(index==0){
            first=this.getNode(index+1);
        }else{
            Node cont= this.getNode(index-1);
            cont.next= this.getNode(index).next;
        }
        size--;
    }

    // Verifica si está un dato en la lista
    public boolean contains(int dato)
    {
        Node temp=first;
        for(int i=0;i<size;i++){
            if(temp.data==dato){
                return true;
            }else{}
            temp=temp.next;
        }
        return false;
    }
    boolean bandera=true;
    public void solicitudNeveras(String nombretienda,int cantidadneveras){
        if(bandera){
            nevera();
        }else{}
        System.out.println("El cliente "+nombretienda+" Solicito las siguientes neveras: ");
        for(int i=1;i<=cantidadneveras;i++){
            System.out.print(i+": ");
            System.out.println("Referencia: "+nei.pop()+"\n Marca: "+nes.pop()+"\n \n \n");
        }
    } 

    public void nevera(){
        bandera=false;
        nei.push(124554634);    nes.push("LG");    
        nei.push(152334234);    nes.push("Samsung");    
        nei.push(124576243);    nes.push("Microsoft");    
        nei.push(124523454);    nes.push("Colgate");   
        nei.push(109876544);    nes.push("Yisus");   
        nei.push(123456974);    nes.push("Helmuth"); 
        nei.push(232345654);   nes.push("Mauricio");
        nei.push(723622344);    nes.push("Edwin");
        nei.push(233457354);   nes.push("Paola"); 
        nei.push(0237456124);   nes.push("Exito");
    }

    public static void InicioFin(String texto_malo){
        String texto="";
        boolean flag=false;
        for(int i=0;i<texto_malo.length();i++){
            if(texto_malo.charAt(i)=='[')
            {
                i++;
                flag=true;}
            if(texto_malo.charAt(i)==']')
            {
                i++;
                flag=false;}

            if(flag==true){
                texto=texto_malo.charAt(i)+texto;
            }else{texto=texto+texto_malo.charAt(i);}
        }
        System.out.print("El texto inicial es: \n"+texto_malo+"\n \n \n El texto final es: \n \n"+texto);
    }

}
