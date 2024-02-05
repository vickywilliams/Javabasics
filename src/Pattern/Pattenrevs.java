package Pattern;

import java.util.Scanner;

public class Pattenrevs {
    public static void main(String[] args) {
        String s = "Racecar";
        String revs = "";
        for (int i = s.length()-1; i>=0; i--) {

            for (int j = 0; j < s.length(); j++) {
                if (i==j) {
                    System.out.print(s.charAt(j));   
                }
               else {
                System.out.print("*");
               } 
            }
            System.out.println("");
        }
    }
}