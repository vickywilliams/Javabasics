package MathFunctions;

import java.util.Random;

public class MathExample {
    public static void main(String[] args) {
        Integer a = 23;
        Double c = 12.7;
        Double d = 11.2;

        System.out.println("Abs : "+Math.abs(c));
        System.out.println("Abs : "+ Math.ceil(c));
        System.out.println("Abs : "+Math.floor(c));
        System.out.println("Abs : "+Math.round(c));
        System.out.println("Abs : "+Math.round(d));
        System.out.println("Abs : "+Math.sqrt(a));
        System.out.println("Abs : "+Math.max(c, a));
        System.out.println("Abs : "+Math.min(a, d));
        System.out.println("Abs : "+Math.random());
        System.out.println("Abs : "+Math.pow(21, 3));
        System.out.println("Abs : "+Math.exp(d));
        
        Random r = new Random();
        System.out.println("Random numbers : "+r.nextDouble(1.45,999.99));

    }
}
