package Oops.encapsulation;

public class ParsonMain {
    public static void main(String[] args) {
        Person person = new Person("vicky", "williams");

        person.setAge("15-04-1998");
        person.setGender("male");
        person.setBloodGroup("O+");

        String name = person.getFirstName()+""+person.getLastName()+"/"+person.getAge()+"/"+person.getGender()+"/"+person.getBloodGroup();
        System.out.println(name);
    }
}
