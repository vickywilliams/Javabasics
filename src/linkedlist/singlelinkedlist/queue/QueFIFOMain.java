package linkedlist.singlelinkedlist.queue;

public class QueFIFOMain {

    public static void main(String[] args) {
        QueFIFOLagic<String> queue = new QueFIFOLagic<String>();
        queue.enqueue("vicky");
        queue.enqueue("kamal");
        queue.enqueue("immanu");
        queue.enqueue("chathiriyan
        ");
        queue.print();
        System.out.println("************");
        queue.dequeue();
        queue.print();
        System.out.println("************");
        queue.dequeue();
        queue.dequeue();
        queue.print();
        System.out.println("***********");
        queue.dequeue();
        queue.dequeue();
        queue.print();
    }
}