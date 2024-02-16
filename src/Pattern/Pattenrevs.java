package Pattern;

import java.util.Scanner;

public class Pattenrevs {
    public static void main(String[] args) {
        String s = "Racecar";
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

    @Override
    public String toString() {
        return "Pattenrevs []";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }
}