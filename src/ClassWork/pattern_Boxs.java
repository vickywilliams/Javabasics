package ClassWork;

public class pattern_Boxs {
    public static void main(String[] args) {
        int n=17;
        System.out.println("$$$$$$ PatternboxS $$$$$");
        Patternbox (n);
    }

    public static void Patternbox(int n) {
        for (int i = 0; i < n; i++) {
            int k=n/2;
            for (int j = 0; j <n; j++) {
                if (j == 0 && i<=k ||  i == 0 && j<=k || j/2 ==k && j-i<=k 
                 || j == k || i== k || i == j 
                 || i/2 == k && i-j<=k || i+j+(k) == n-1 || i+j-(k) == n-1){
                // if(j == 0 || i == n-1 || i==0 || j/2 ==n/2 || j == n/2 || i == n/2 
                //  || i+j+(n/2) == n-1 || i+j-(n/2) == n-1){
                System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            k++;
        }
    }
}
