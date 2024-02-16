package ClassWork;

public class Star {
    static void print_rectangle(int n, int m) {
        int i, j;
        for (i = 1; i <= n; i++) {
        for (j = 1; j <= m; j++) {
        if (i == 1 || i == n || j == 1 || j == m) //Logic to print
        System.out.print("*"); //True?, print star
        else
        System.out.print(" "); //True?, print space
        }
        System.out.println();
        }
        }
        public static void main(String args[]) {
        int rows = 10, columns = 10;
        print_rectangle(rows, columns); //Method call
        }
}
