package linkedlist.doublelinkedlist;


public class EmployeeMain {
    public static void main(String[] args) {
        EmployeeLogin person = new EmployeeLogin();

        person.insert("null");
        person.insert("niraml");
        person.insert("dil");
        person.insert("null");

        System.out.println("Ascending");
        person.print();
        System.out.println("Descending");
        person.print();

        DlLinkedPerson<Employee> dllObj = new DlLinkedPerson<Employee>();
        dllObj.insert(new Employee("dilshad nirmal", "001", "26-02-2002", "male", "9361761055", "TUP", "student"));
        dllObj.insert(new Employee("gokul", "002", "26-02-2002", "male", "9361761055", "TUP", "student"));
        dllObj.insert(new Employee("gowtham", "003", "26-02-2002", "male", "9361761055", "TUP", "student"));
        dllObj.insert(new Employee("chithapa vignesh", "004", "26-02-2002", "male", "9361761055", "TUP", "student"));
        dllObj.insert(new Employee("gymboy vignesh", "005", "26-02-2002", "male", "9361761055", "TUP", "student"));



    }
}