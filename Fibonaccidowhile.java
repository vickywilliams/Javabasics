public class Fibonaccidowhile {
    public static void main(String[] args) {
        int fibonacci = 5;
        int[] arr = new int [5];
        int a = 0;
        int b = 1;
        int result = 0;
        int total = 0;
        int i=0;
        
        while ( i <= fibonacci) {
            System.out.println(a);
            result = a+b;
            total = total+a;
            a = b;

            b = result;
            i++;
        }
        b = 1;
        do {
            a++;
            System.out.println(arr[b]);
            
        } while (b <= arr.length+1);
    }
}
