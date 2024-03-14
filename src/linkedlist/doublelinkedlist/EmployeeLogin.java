package linkedlist.doublelinkedlist;

public class EmployeeLogin {
    DLListPerson head;
    DLListPerson tail;
    public void insert(String string){
        DLListPerson person = new DLListPerson(string);
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
        DLListPerson currentPerson = head;
        while (currentPerson != null) {
            System.out.println(currentPerson.name);
            currentPerson= currentPerson.connecrNext;
        }
    }
}
