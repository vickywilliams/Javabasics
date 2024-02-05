package Pattern;
public class PatternPrint1 {
    public static void main(String[] args) {
        String s = "Racecar";
        String revs = "";
        for (int i = 0; i < s.length(); i++) {
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
