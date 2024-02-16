package ClassWork;

public class PatternV {

    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; ++i) { //Outer loop for rows
            for (int j = 1; j <= i; ++j) { //Inner loop for Col
                System.out.print("* "); //Print *
            }
            System.out.println(); //New line
        }
    }

public static void pattern(int n) {
        int i, j;
        for (i = n - 1; i >= 0; i--) {
        for (j = n - 1; j > i; j--) {
        System.out.print(" "); //Print Space
        }
            System.out.print("*"); //Print star
            for (j = 1; j < (i * 2); j++)
                System.out.print(" ");//Print space
            if (i >= 1)
                System.out.print("*");
                System.out.print("\n");//Enter newline
        }
    }
}

