
/**
 * Write a description of class Arbol here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Arbol
{
    private Nodo raiz;
    public Arbol(){
        raiz = null;
    }

    private static boolean buscar(Nodo nodo, String n){
        if(nodo.dato.equals(n) ) return true;
        buscar(nodo.izq, n);
        buscar(nodo.der, n);
        return false;
    }
    
    public boolean buscar(String n){
        return buscar(raiz,n);
    }
    
    public static void postOrder(Nodo raiz){
        if(raiz != null){
            postOrder(raiz.izq);
            postOrder(raiz.der);
            if(raiz.dato != null){
                System.out.println(raiz.dato);
            }
        }
    }
    
    public static void main(String [] args){
        Arbol ZapataGiraldo = new Arbol();
        Nodo m = new Nodo("Manuela");
        Nodo raiz = m; 
        
        Nodo mo = new Nodo("Mónica");
        Nodo b = new Nodo("Blanca"); 
        Nodo c = new Nodo("Cenón"); 
        Nodo at = new Nodo("Ana Teresa");         
        Nodo r = new Nodo("Rafael");
        Nodo j = new Nodo("Jesús");
        Nodo al = new Nodo ("Ana Luisa");
        
        Nodo o = new Nodo("Oscar");
        Nodo ma = new Nodo("María");
        Nodo g = new Nodo("Gabriel"); 
        
        m.izq = mo;
        mo.izq = b;
        b.izq = at;
        b.der = c; 
        mo.der = r;
        r.izq = al;
        r.der = j;
        m.der = o;
        o.izq = ma;
        o.der = g;
        
        postOrder(raiz);
    }
}
