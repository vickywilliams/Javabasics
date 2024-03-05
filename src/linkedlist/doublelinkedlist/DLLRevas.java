package linkedlist.doublelinkedlist;

public class DLLRevas {
    DLListPerson head;
    DLListPerson tail;
    public void insert(String name){
        DLListPerson person = new DLListPerson(name);
        if (head == null) {
            head = person;
            tail = person;
        }
        else{
            tail.connecrNext= person;
            person.connectPrev= tail;
            tail = person;
        }
    }
    public void print(){
        DLListPerson currentPerson = tail;
        while (currentPerson != null) {
            System.out.println(currentPerson.name);
            currentPerson= currentPerson.connectPrev;
        }
    }
}
