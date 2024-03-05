package linkedlist.singlelinkedlist;

public class MainDelete {
    public static void main(String[] args) {
        System.err.println("single LinkList elements is: ");
        SLLDelete dl = new SLLDelete();
        dl.insert(5);
        dl.insert(3);
        dl.insert(15);
        dl.insert(6);
        dl.insert(9);
        dl.insert(12);
        dl.insert(4);
        dl.insert(2);
        dl.positionToDelete(0);
        System.out.println("DeLeTe ELEMENT");
        dl.print();
    }
}
