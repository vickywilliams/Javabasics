package Pattern;

public class Pattarndri {
    public static void main(String[] args) {
    int n =5;
    middle(n);
    } 
    public static void middle (int n) {
        for (int i =1; i<=n; i++) {
            for (int j = n+i; j >= 1; j--) {
                if (i >= j-(i-1)) 
                    System.out.print(j);
                else 
                    System.out.print(" ");   
                }
                System.out.println();
            }
         }
    public static void right(int n) {
        for (int i =1; i<=n; i++) {
            for (int j = n; j >= n; j--) {
                if (i>=j) 
                    System.out.print(j);
                else 
                    System.out.print(" ");
                    
                }
                System.out.println();
            }
            
        }
        public static void left (int n) {
            for (int i =1; i<=n; i++) {
                for (int j = n; j >= i; j++) {
                        System.out.print(j);   
                    }
                    System.out.println();
                }
    }
}