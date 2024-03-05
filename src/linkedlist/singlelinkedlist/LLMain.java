package linkedlist.singlelinkedlist;

public class LLMain {

    public static void main(String[] args) {
        System.err.println("single LinkList elements is: ");
        SingleLinkedList sll = new SingleLinkedList();
        sll.insert(5);
        sll.insert(3);
        sll.insert(15, 0);
        sll.insert(6);
        sll.insert(9);
        sll.insert(12, 0);
        sll.insert(4);
        sll.insert(2);
        System.out.println("MIDDLE ELEMENT");
        sll.print();
    }
}
