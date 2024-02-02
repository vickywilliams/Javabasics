import java.util.Scanner;

public class OddEvev {
    public static void main(String[] args) {
        System.out.println("enter the vale = "); 
        Scanner Input = new Scanner(System.in);

        int num = Input.nextInt();
        
        if (!(num % 2 == 0)) {
            System.out.println("the value is odd");
        }
        else{
            System.out.println("the value is even");
        }
    }
    
}
