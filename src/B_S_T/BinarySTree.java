package B_S_T;

public class BinarySTree {
    int value;
    BinarySTree left; BinarySTree right;
    public BinarySTree (int value){
        this.value = value; 
    }    
    public BinarySTree getLeft() {
        return left;
    }
    public BinarySTree getRight() {
        return right;
    }
    public int getValue() {
        return value;
    }
    public void setLeft(BinarySTree left) {
        this.left = left;
    }
    public void setRight(BinarySTree right) {
        this.right = right;
    }
    public void setValue(int value) {
        this.value = value;
    }
}
