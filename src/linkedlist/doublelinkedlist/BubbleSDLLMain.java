package linkedlist.doublelinkedlist;

public class BubbleSDLLMain {
    public static void main(String[] args) {
        BubbleSDLLLogic dl = new BubbleSDLLLogic();
        dl.insert(12);
        dl.insert(16);
        dl.insert(19);
        dl.insert(10);
        dl.insert(18);
        dl.insert(7);
        dl.insert(67);
        System.out.println("***--------***");
        dl.print();
        dl.bubbleSort();
        System.out.println("@@@----- BobbleSort -----@@@");
        dl.print();
    }
}
