package linkedlist.stack;

import java.util.Stack;

public class LIFOut<T> {
    StackLIFOut<T> first = null;
    StackLIFOut<T> last = null;
    int count = 0;
    
    public void push(T number){
        StackLIFOut<T> current = new StackLIFOut<T>(number);
        if (first == null ){
            first = current;
            last = current;
            count++;   
        }
        else{
            last.next=current;
            last = current;
            count++;
        }
    }
    public int size(){
        return count;
    }

    public void pop(){
        if (first == last) {
            first = null;
            last = null;
            count = 0;    
        }
        if (first != null) {
            StackLIFOut<T> current = first;
            while (current != null) {
                if (current.next == last) {
                    current.next = null;
                    last = current;
                    count--;
                    break;
                }
                current = current.next;
            }
        }
    }
    
    public void print(){
        if (first != null) {
            StackLIFOut<T> current = first;
            while (current != null) {
                System.out.println(current.value);
                current = current.next;
           }
        }
        System.out.println("GEt in Element in size : ");
        System.out.println(count);
    }

}
