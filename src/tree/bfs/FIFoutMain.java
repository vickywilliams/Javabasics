package tree.bfs;


import tree.dfs.PreInPost_Order;
import tree.dfs.PreInPost_OrderLogic;

public class FIFoutMain {
    public static void main(String[] args) {
        PreInPost_Order root = new PreInPost_Order(11);
        root.left = new PreInPost_Order(2);
        root.right = new PreInPost_Order(8);
        root.left.left = new PreInPost_Order(6);
        root.left.right = new PreInPost_Order(21);
        root.left.left.left= new PreInPost_Order(4);
        root.left.left.right = new PreInPost_Order(7);
        root.left.right.right= new PreInPost_Order(8);
        root.right.left = new PreInPost_Order(3);
        root.right.right = new PreInPost_Order(7);
        root.right.left.right = new PreInPost_Order(14);
        root.right.right.left= new PreInPost_Order(29);
        root.right.right.left.right= new PreInPost_Order(16);
        PreInPost_OrderLogic dfs = new PreInPost_OrderLogic();
        System.out.println("*****PRE ORDER ELEMENTS*****");
        dfs.preOrder(root);
        System.out.println();
        System.out.println("*****IN OEDER ELEMENTS*****");
        dfs.inOrder(root);
        System.out.println();
        System.out.println("*****POST ORDER ELEMENTS*****");
        dfs.postOrder(root);
        
    }
}
