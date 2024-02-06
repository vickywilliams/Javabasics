import java.util.Scanner;

public class Palidromeforloop {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        System.out.println("enter the string");
        String str= sr.next();
        String str1=str;
        String str2="";
        for(int i=str1.length()-1; i>=0;i--){
            str2 += str1.charAt(i);
        }
        if (str2.equals(str1)) {
            System.out.println("its a palindrome");
            
        }
        else{
            System.out.println("not a palindrome");
        }
        

    }
}
