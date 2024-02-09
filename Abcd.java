import java.util.Scanner;

public class Abcd
{
        public static void main(String[] args )
        {
            System.out.print("Enter two numbers: ");
            Scanner i = new Scanner(System.in);
            double a = obj.nextDouble();
            double b = obj.nextDouble();
            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = obj.next().charAt(0);
            double result;
            switch(operator)
            {
                case '+':
                    result = a + b;
                    break;
                case '-':
                    result = a - b;
                    break;
                case '*':
                    result = a * b;
                    break;
                case '/':
                    result = a / b;
                    break;
// operator doesn't match any case constant (+, -, *, /)
                    default:
                    System.out.printf("Error!operator is not correct");
                    
                        return;
}
System.out.printf("%.1f %c %.1f =%.1f", a, operator, b, result);
}
}
