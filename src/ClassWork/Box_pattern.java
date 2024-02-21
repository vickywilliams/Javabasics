package ClassWork;

public class Box_pattern {
     
    public static void main(String[] args) {
        int n=5;
        System.out.println("$$$$$$ Patternbox $$$$$");
        Patternbox (n);
        System.out.println("$$$$$$ Patternboxx $$$$$");
        Patternboxx(n);
    }
    public static void Patternbox(int n) {
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                if (j == 0 || i == n-1 || i==0||j==n-1 ) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void Patternboxx(int n){
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                if (j == 0 || i == n-1 || i==0 || j==n-1 || i+j == n-1 || i == j ) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }   
}
