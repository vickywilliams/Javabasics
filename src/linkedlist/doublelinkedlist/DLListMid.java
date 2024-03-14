package linkedlist.doublelinkedlist;

public class DLListMid {
    DLListPerson head;
    DLListPerson tail;
    public void insert(String name){
        DLListPerson newperson = new DLListPerson(name);
        if (head == null) {
            head = newperson;
            tail = newperson;
        }
        else{
            newperson.connectPrev= tail;
            tail.connecrNext= newperson;
            tail = newperson;
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
