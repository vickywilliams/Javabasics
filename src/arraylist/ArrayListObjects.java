package arraylist;

import java.util.ArrayList;

public class ArrayListObjects {
    public static void main(String[] args) {
        ArrayList<Person> alPerson = new ArrayList<Person>();
        Person p1 = new Person("vicky", "male", 24);
        Person p2 = new Person("xxxx","yyyy", 00);
        Person p3 = new Person("tamil", "english", 10);
        Person p4 = new Person();
        p4.setAge(15);
        p4.setGender("male");
        
        p4.setName("mettal");
        alPerson.add(p1);
        alPerson.add(p2);
        alPerson.add(p3);
        alPerson.add(p4);
        alPerson.add(new Person("sindhe","fimale",17));

// for (Person person : alPerson){}

// for (int i = 0; i < alPerson.size(); i++) {
//     Person person = alPerson.get(i);}
        
        alPerson.forEach(person->{
            System.out.println("****************");
            System.out.println("name : "+person.getName());
            System.out.println("gender: "+person.getGender());
            System.out.println("age : "+person.getAge());
        });
    }
    
}
