package Pattern;

import java.util.Scanner;

public class pattenStar {
    public static void main(String[] args) {
    int i, j, k, l, n;
    int n = 5;
    for (i = 1; i <= n; i++) {
        
        for (k = 1; k <= n-i; k++) {
            System.out.print(" ");
        }
        for (l = 1; l <= n-k; l++) {
            System.out.print(" ");
            if (l==i) {
                System.out.println(l=i); 
            }
        }
        for (j = 1; j <= i; j++) {
            System.out.print(j+ " ");
        }
        
        System.out.println();
    }
}
    
}