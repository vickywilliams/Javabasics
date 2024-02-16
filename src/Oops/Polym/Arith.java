package Oops.Polym;

class Arith extends SimpleMath{
    int a=0; int b=0;
    String name;
// constructor overloading (different argument and same method name & same class name)
    public Arith(int a, int b){
        super(a,b);
        this.a = a;
        this.b = b;
    }

// Method overloading(different argument and same method name)
    public int add(int a, int b){
        return a+b;
    }

//Override
    public int add(){
        super.add();
        return a+b+b;
    }

    
}