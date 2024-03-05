package linkedlist.singlelinkedlist;

public class SingleLLEx2 {
    public static void main(String[] args) {
        SingleLLNode head = null;
        SingleLLNode tail = null;

        SingleLLNode obj1 = new SingleLLNode();
        obj1.setValue(5);

        if (head == null) {
            head = obj1;
            tail = obj1;
        }
        SingleLLNode obj2 = new SingleLLNode();
        obj2.setValue(3);
        tail.setNext(obj2);
        tail = obj2;

        SingleLLNode obj3 = new SingleLLNode();
        obj2.setValue(6);
        tail.setNext(obj3);
        tail = obj3;
    }
}
