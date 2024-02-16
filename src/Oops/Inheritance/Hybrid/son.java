package Oops.Inheritance.Hybrid;

public class son extends Father{

    int age = 99;
    public son(String name){
        super(name);
    }
    public void setAge(int age){
        this.age = (age);
    }
    public int getAge(){
        return age;
    }

    
}