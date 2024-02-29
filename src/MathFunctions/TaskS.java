package MathFunctions;

public class TaskS {
    public static void main(String[] args) {
        double k = 17;
        if (isPrime(k)) {
            System.out.println(k +" is a prime number");
        }
        else{
            System.out.println(k+"is a not prime number");
        }
        Integer a= -217;
        Integer b= 317;
        Integer c = 99;
        Double d = 37.5;
        Double d1 = 22.3;
        Double d2 = 31.6;
        Double v  = Math.floor(d)+ Math.floor(d1) +Math.floor(d2)+ c;
         System.out.println("INPUT = -217  : "+Math.abs(a));
         System.out.println(" INPUT = 317 : "+Math.negateExact(b));
         System.out.println("task 3 : "+Math.round(v)); 
    }
    private static boolean isPrime(double k) {
    
        if (k <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(k); i++) {
            if(k % i == 0)
            return false;
        }
        return true;
    }
}