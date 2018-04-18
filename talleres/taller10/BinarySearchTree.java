
/**
 * Write a description of class BinarySearchTree here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BinarySearchTree
{

    private Node root;
    public BinarySearchTree(){
        root = null;
    }
    
    public void insert (int n){
        if(root == null) root = new Node(n);
        else insertAux(root,n);
    }

    private void insertAux(Node node, int n){
        if(node.data == n) return;
        if(node.data < n){
            if(node.right == null) node.right = new Node(n);
            else insertAux(node.right,n);           
        }else{
            if(node.left == null) node.left = new Node(n);
            else insertAux(node.left, n);
        }
    }
    
    public boolean search(int n){
        return searchAux(root,n);
    }
    
    private boolean searchAux(Node node, int n){
        if(node == null) return false;
        else if(node.data == n)return true;
        else if(node.data < n) return searchAux(node.right,n);
        return searchAux(node.left, n);
    }
    
    public void remove(int n){}
}
