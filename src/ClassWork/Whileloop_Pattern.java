package ClassWork;

public class Whileloop_Pattern {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("--------- Patternbox -----------");
        Patternbox (n);
        System.out.println("--------- Patternboxx ----------");
        Patternboxx (n);
        System.out.println("--------- PatternLsape ----------");
        PatternLsap (n);
    }
    public static void Patternbox(int n){
        int i = 0;
        while (i<n) {
            int j = 0;
            while (j<n) {
                if (j == 0 || i == n-1 || i==0||j==n-1) {
                    System.out.print("*");
                }
                else{
                  System.out.print(" ");
                }
            j++;
            } 
            System.out.println(" ");
            i++;
         }  
    }

    public static void Patternboxx(int n){
       int i = 0;
        while (i<n) {
            int j = 0;
            while (j<n) {
                if (j == 0 || i == n-1 || i==0 || j==n-1|| i==j || i+j==n-1) {
                    System.out.print("*");
                }
                else{
                  System.out.print(" ");
                }
            j++;
            } 
            System.out.println(" ");
            i++;
         } 
    }

    public static void PatternLsap(int n){
        int i = 0;
        while (i<n) {
            int j = 0;
            while (j<n) {
                if (j == 0 || i == n-1 || i+j == n-1) {
                    System.out.print("*");
                }
                else{
                  System.out.print(" ");
                }
            j++;
            } 
            System.out.println(" ");
            i++;
         }  
    }
}
