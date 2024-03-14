package tree.dfs;

public class PreInPost_OrderLogic {
    PreInPost_Order root;
    public void setRoot(PreInPost_Order root) {
        this.root = root;
    }
    
     public void preOrder(PreInPost_Order child){
        if (child != root) {
            System.err.print(" "+child.value);
            preOrder(child.left);
            preOrder(child.right);  
        }   
    }
    public void inOrder(PreInPost_Order child){
        if (child != root) {
            inOrder(child.left);
            System.err.print(" "+child.value);
            inOrder(child.right);  
        }   
    }
    public void postOrder(PreInPost_Order child){
        if (child != root) {
            postOrder(child.left);
            postOrder(child.right);  
            System.err.print(" "+child.value);
        }   
    }
    public static int hight(PreInPost_Order root, int i){
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
    public static int wigth(PreInPost_Order root, int i){
        if (root == null) {
            return i;
        }
    int L = wigth(root.left,i+1);
    int R = wigth(root.right,i+1);
    if (L < R) 
        return R;
    else
        return L;
    }
}
