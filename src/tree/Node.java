package tree;

public class Node {
    int data;
    int rcount;
    int lcount;
    Node left, right;
    Node (int data){
        this.data = data;
        this.rcount = this.lcount = 0;
        this.left = null;
        this.right = null;
    }
    static void inorder(Node root){
        if (root != null) {
            inorder(root.left);
            System.out.println(root.data+ " ");
            inorder(root.right);
        }
    }
    static boolean isPBT(int count){
        count = count + 1;
        while (count % 2 == 0)
        count =count / 2;
        if (count == 1){
            return true;
        }
        else{

            return false;
        }  
    }
    static Node insert(Node root, int data){
        if (root == null) {
            Node n = new Node(data);
            return n;
        }
        if (root.rcount == root.lcount) {
            root.left = insert(root.left, data);
            root.lcount += 1;
        }
        else if (root.rcount < root.lcount) {
            if (isPBT(root.lcount)) {
                root.right = insert(root.right, data);
                root.rcount += 1;
            }
            else{
                root.left = insert(root.left, data);
                root.lcount += 1;
            }
        }
        return root;
    }
    public static void main(String[] args) {
        int arr[] = {8, 6, 7, 12, 5, 1, 9};
        int size = 7;
        Node root = null;
        for (int i = 0; i < size; i++) {
            root = insert(root,arr[i]);
            inorder(root);
        }
        
    }
}
