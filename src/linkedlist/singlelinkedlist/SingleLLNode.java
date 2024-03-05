package linkedlist.singlelinkedlist;

public class SingleLLNode {
    private int value;
    private SingleLLNode next;
    private int newNode;
    private int deleteAtPosition;
    
    public SingleLinkedList getNext;

    public SingleLLNode getNext(){
        return next;
    }
    public int getValue(){
        return value;
    }
    public int getnewNode(){
        return newNode;
    }
    public int getDeleteAtPosition() {
        return deleteAtPosition;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public void setNext(SingleLLNode next) {
        this.next = next;
    }
    public void setnewNode(int newNode) {
        this.newNode = newNode;
    }
    public void setDeleteAtPosition(int deleteAtPosition) {
        this.deleteAtPosition = deleteAtPosition;
    }
}
