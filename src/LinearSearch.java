public class LinearSearch {
   
   
   public static int print(int n, int i){
    if(i>n){
        return 0;
    }
    if (i <= n) {
        System.out.println("given elements : "+i);
    }
     print(n, ++i);
     return i;

   }
   public static int search(int val, int i){
    if (i>val) {
        return 0;
    }
    if (i<=val) {
        System.out.println("given elements : "+i);
    }return search(val, ++i);
   }
   
   public static int linearser(int[] tr, int i,  int value){
    if (i>tr.length) {
        return 0;
    }
    if(i<tr.length){
    if (tr[i] == value ) {
        System.err.println("given elements : "+tr[i]+" index :"+i);
    }
}
    linearser(tr, ++i, value);
    return i;
    
   }
    public static boolean isPrime(int num, int i) {
        if (num <= 1) {
            return false; 
        }
        if (i <= Math.sqrt(num)) {
            if (num % i == 0) {
                return false; 
            }
            isPrime(num, i+1);
        }
        return true; 
    }
public static int madangle(int i, int j, int n ) {
    if (i>n) {
        return 0;
    }
    if (j<n) {
        if (j/2==n/2 || i/2==j/2) {
           System.out.println("*"); 
        }
       // System.out.println("");
    }
    return madangle(++i, ++j, n);   
}




public static void main(String[] args) {
    int n=5;
    print(n,0);
    System.err.println("********************");
    search(5, 0);
    System.err.println("----------------------");
    int[] tr = {1,3,8,545,89,6,98,90};
    linearser(tr, 0, 89);
    System.err.println("*___****xxxxxxx****xxxxxx_____");
    System.out.println();
    int num = 67;
    if (isPrime(num, 2)) {
        System.out.println(num + " is a prime number.");
    } else {
        System.out.println(num + " is not a prime number.");
    } 
    System.out.println("------------------------------");  
    System.out.println();
    madangle(0, 0, 7);
    

} 
}
