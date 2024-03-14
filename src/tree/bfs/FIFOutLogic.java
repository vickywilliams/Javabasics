package tree.bfs;


public class FIFOutLogic{
    FIFOutLogic root;
    private String value;
    private FIFOutLogic left;
    private FIFOutLogic right;
    public void setRoot(FIFOutLogic root) {
        this.root = root;
    }
    
     public void preOrder(FIFOutLogic child){
        if (child != root) {
            System.err.print(" "+child.value);
            preOrder(child.left);
            preOrder(child.right);  
        }   
    }
    public void inOrder(FIFOutLogic child){
        if (child != root) {
            inOrder(child.left);
            System.err.print(" "+child.value);
            inOrder(child.right);  
        }   
    }
    public void postOrder(FIFOutLogic child){
        if (child != root) {
            postOrder(child.left);
            postOrder(child.right);  
            System.err.print(" "+child.value);
        }   
    }
    public static int hight(FIFOutLogic root, int i){
        if (root == null) {
            return i;
        }
    int Lh = hight(root.left,i+1);
    int Rh = hight(root.right,i+1);
    if (Lh < Rh) 
        return Rh;
    else
        return Lh;
    
    }
    public FIFOutLogic mirror(FIFOutLogic root){
        if (root == null) {
            return root;
        }
        FIFOutLogic left = mirror(root.left);
        FIFOutLogic right = mirror(root.right);
        if (left != null || right != null) {
            root.left = right;
            root.right = left;
        }
        return root;
    }
}
