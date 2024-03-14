package linkedlist.doublelinkedlist;

public class DLListPerson {
    String name;
    DLListPerson connecrNext=null;
    DLListPerson connectPrev=null;
    public DLListPerson nextPerson;
    public Object data;
    public DLListPerson(String name2){
        this.name=name2;
    }
}
