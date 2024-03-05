package linkedlist.singlelinkedlist;

public class SLLDelete {
    SingleLLNode head = null, tail = null;
    public void insert(int value){

        SingleLLNode singleLLNode = new SingleLLNode();
        singleLLNode.setValue(value);

        if (head == null) {
            head = singleLLNode;
            tail = singleLLNode;
        }
        else{
            tail.setNext(singleLLNode);
            tail = singleLLNode;
        }
    }
     @SuppressWarnings("null")
    public void positionToDelete( int position){
           SingleLLNode deleted = new SingleLLNode();
        deleted.setDeleteAtPosition(position);
        if (head == null && position == 0){
           head = deleted;
           tail = deleted; 
        }
        else if(position == 1){
            deleted.setNext(head);
            head = deleted ;
        }
        else {
            int index = 1;
            SingleLLNode currentItem = head;
            while (currentItem != null) {
                if(currentItem == deleted){
                    deleted.setNext(currentItem.getNext());
                    currentItem.setNext(deleted);
                    break;
                }
                currentItem = currentItem.getNext();
                index++;
            }
            if (index > position) {
                System.out.println("INdex out of bound error");
            }
        }
     }

    public void print(){
        SingleLLNode currentVal = head;
        if (head != null) {
            //System.out.println("print");
            while (currentVal != null) {
                System.out.println(currentVal.getValue()+" ");
                currentVal = currentVal.getNext();
            }
        }
        else{
            System.out.println("link list is mt");
        }
    }
}
