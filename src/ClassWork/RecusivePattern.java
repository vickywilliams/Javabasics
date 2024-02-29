package ClassWork;

public class RecusivePattern {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("$$$$$$ Patternbox $$$$$");
        patternbox(n, 1, 1);
    }

    static void printbox(int k, int j){
    if (k == 0 || j == 0)   // base case
        return;
        System.out.print ("* ");
        printbox(k - 1, j + 1);    // recursively calling printn()
    }
 
    static void patternbox(int n, int i, int j) { // function to print the pattern
        if (n == 0 || n == i-1 )      // base case
            return;
            printbox(i, j);
            System.out.println();
        patternbox(n-i, i ,j);
    }
 }
