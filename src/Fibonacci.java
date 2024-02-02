public class Fibonacci {
    public static void main(String[] args) {
        int fibonacci = 5;
        int a = 0;
        int b = 1;
        int result = 0;
        int total = 0;

        for(int i=0; i<=fibonacci; i++){
            result = a+b;
            System.out.println( a );
            total = total+a;
            a=b; 
            b=result;
            
        }
            
            int i =1;
             
            while (i <= fibonacci) {
                System.out.println(a);
                result = a+b;
                total = total+a;
                a = b;
                b = result;
                i++;

            }
            System.out.println("sum: " +total);
    }
}
