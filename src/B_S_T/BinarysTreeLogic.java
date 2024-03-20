package B_S_T;


public class BinarysTreeLogic {
    BinarySTree root = null;
    public BinarySTree insert(int valur){
        if (root == null) {
            root = new BinarySTree(valur);
            return root;
        }
        else{
            return insert( root,valur);
        }
    }
    private BinarySTree insert(BinarySTree currentRoot, int value){
        if (currentRoot == null) {
            BinarySTree newNode = new BinarySTree(value);
            return newNode;
        }
        if (value <= currentRoot.value) {
            System.out.println("parent : " + currentRoot.value + " left : "+ value);
            currentRoot.left = insert(currentRoot.left, value);
        }
        else if (value > currentRoot.value) {
            System.out.println("parent : " + currentRoot.value + " right : "+ value);
            currentRoot.right = insert(currentRoot.right, value);
        }
        return currentRoot;
    }
    public boolean find(int value) {
        if (find(root, value) == null ) {
            System.out.println("false for value: " + value);
            return false;
        } else {
            System.out.println("true for value: " + value);
            return true;
        }
    }

    private BinarySTree find(BinarySTree currentNode, int value) {

        if (currentNode == null) {
            return null;
        }

        if (currentNode.value == value) {
            return currentNode;
        } else if (currentNode.value > value) {
            // System.out.println("left: " + currentNode.value);
            return  find(currentNode.left, value);
        } else {
            // System.out.println("right: " + currentNode.value);
           return find(currentNode.right, value);
        }
    }
    
}
