package linkedlist.circular.doublelink;

public class CirDLLiisist {
    CDLList head;
	CDLList tail;
	public void insert(String name) {
		CDLList person = new CDLList(name);
		if(head==null) {
			person.connectNext=head;
			head=person;
			tail=person;
		}
		else {
			person.connectPrev=tail;
			person.connectNext=head;
			tail.connectNext=person;
			tail=person;
		}
	}
	public void print() {
		CDLList currentPerson=head;
		do {
			System.out.println(currentPerson.name);
			currentPerson = currentPerson.connectNext;
		}
		while(currentPerson != head);
	}

}
