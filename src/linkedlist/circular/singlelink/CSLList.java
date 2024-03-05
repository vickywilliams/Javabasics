package linkedlist.circular.singlelink;

public class CSLList {
    CirSingleLList head = null;
    CirSingleLList tail = null;
    
    public void insert(String name){
        CirSingleLList person = new CirSingleLList(name);
        if (head == null) {
            person.connecrtNext = person;
            head = person;
            tail = person; 
        }
        else{
            person.connecrtNext= head;
            tail.connecrtNext = person;
            tail = person;
        }
    }

    public void print(){
        CirSingleLList currentPerson = head;
        if (currentPerson != null) {
           do{
               System.out.println(currentPerson.name);
               currentPerson = currentPerson.connecrtNext;
            } while (currentPerson != head); 
        }
        else {
            System.out.println("List is empty");
        }
    }

}
