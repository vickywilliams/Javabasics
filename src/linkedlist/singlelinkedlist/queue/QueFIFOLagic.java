package linkedlist.singlelinkedlist.queue;


public class QueFIFOLagic<Q> {
    QueFIFout<Q> head = null;
    QueFIFout<Q> tail = null;
    int count=0;

    public int size(){
        return count;
    }

    public void enqueue(Q value){
        QueFIFout<Q> current = new QueFIFout<Q>(value);
      if (head == null) {
        head = current;
        tail = current;
      }
      else{
        tail.next = current;
        tail = current;
      }
      count++;
    }

    public void dequeue(){
        if (head != null) {
            head = head.next;
            count --;
        }

    }

    public void print(){
        QueFIFout<Q> current = head;
        if (head != null) {
            while (current != null) {
                System.out.println(current.value);
                current = current.next;
            }
        }
        System.out.println("Size: "+count);
    }
}
