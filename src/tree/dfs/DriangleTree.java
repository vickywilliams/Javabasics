package tree.dfs;

public class DriangleTree {
    PreInPost_Order root;
    public void setRoot(PreInPost_Order root) {
        this.root = root;
    }
    public static int tree(PreInPost_Order root, int i){
        if (root == null) {
            return i;
        }
    int Lh = tree(root.left,i+1);
    int Rh = tree(root.right,i+1);
    if (Lh < Rh) 
        return Rh;
    else
        return Lh;
    
    }
    
}
