package tree.dfs;

public class PreInPost_OrderMain {
    public static void main(String[] args) {
        int i = 0;
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

        PreInPost_Order root1 = new PreInPost_Order(14);
        root1.left = new PreInPost_Order(6);
        root1.left.left = new PreInPost_Order(9);
        root1.left.left.right = new PreInPost_Order(11);
        root1.left.right = new PreInPost_Order(7);
        root1.left.right.left = new PreInPost_Order(13);
        root1.left.right.left.right = new PreInPost_Order(16);
        root1.left.right.right = new PreInPost_Order(15);
        root1.right = new PreInPost_Order(8);
        root1.right.left = new PreInPost_Order(2);
        root1.right.left.left = new PreInPost_Order(7);
        root1.right.left.right = new PreInPost_Order(3);
        root1.right.left.right.left = new PreInPost_Order(4);
        root1.right.right = new PreInPost_Order(1);
        root1.right.right.left = new PreInPost_Order(21);
        root1.right.right.left.left = new PreInPost_Order(12);
        root1.right.right.right = new PreInPost_Order(4);
        System.out.println();
        System.out.println("-----------------------------------------------------------------");
        System.out.println("*****PRE ORDER ELEMENTS*****");
        dfs.preOrder(root1);
        System.out.println();
        System.out.println("*****IN OEDER ELEMENTS*****");
        dfs.inOrder(root1);
        System.out.println();
        System.out.println("*****POST ORDER ELEMENTS*****");
        dfs.postOrder(root1);

        PreInPost_Order ro = new PreInPost_Order(2);
        ro.left = new PreInPost_Order(3);
        ro.left.left = new PreInPost_Order(6);
        ro.left.left.left = new PreInPost_Order(7);
        ro.left.left.right = new PreInPost_Order(11);
        ro.left.left.right.left = new PreInPost_Order(2);
        ro.left.left.right.left.right = new PreInPost_Order(4);
        ro.left.right = new PreInPost_Order(9);
        ro.left.right.left = new PreInPost_Order(21);
        ro.right = new PreInPost_Order(5);
        ro.right.left = new PreInPost_Order(12);
        ro.right.left.left = new PreInPost_Order(16);
        ro.right.left.right = new PreInPost_Order(11);
        ro.right.right = new PreInPost_Order(18);
        ro.right.right.left = new PreInPost_Order(5);
        ro.right.right.left.left = new PreInPost_Order(10);
        ro.right.right.right = new PreInPost_Order(19);
        System.out.println();
        System.out.println("----------------------------------------------------------------");
        System.out.println("*****PRE ORDER ELEMENTS*****");
        dfs.preOrder(ro);
        System.out.println();
        System.out.println("*****IN OEDER ELEMENTS*****");
        dfs.inOrder(ro);
        System.out.println();
        System.out.println("*****POST ORDER ELEMENTS*****");
        dfs.postOrder(ro);
        System.out.println();
        System.out.println("HIGHT : "+PreInPost_OrderLogic.hight(root,i));
        System.out.println(" Tree : "+DriangleTree.tree(ro, i));

    }
}
