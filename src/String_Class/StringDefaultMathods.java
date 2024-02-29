package String_Class;

public class StringDefaultMathods {
    
    public static void main(String[] args) {
        String s = "Hello Would";

        System.out.println("length: "+s.length());
        System.out.println("length: "+s.toCharArray().length);
        System.out.println("replace: "+s.replace("would"," all"));
        System.out.println("substring: "+s.substring(0,8));
        System.out.println("concat: "+s.concat(" All"));
        System.out.println("solit: "+s.split(" ")[0]+"  2: "+s.split(" ")[1]);
        System.out.println("Trim: "+s.trim());  // remove white space
        System.out.println("Index of: "+s.indexOf("l"));
        System.out.println("Uppercase: "+s.toUpperCase());
        System.out.println("Uppercase: "+s.toString());

        int j = 3;
        String s1 = String.valueOf(j);
        System.out.println("equals: "+s1.equals("3"));

        String[] sArr = s.split("s");
        char[ ] sArr1 = s.toCharArray();

        System.out.println("********* split **********");
//split eavch char
        for (int i = 0; i < sArr.length; i++) {
            System.out.println(sArr[i]);
        }
        System.out.println("********* toChar Array **********");
        for (int i = 0; i < sArr1.length; i++) {
            System.out.println(sArr1[i]);
        }
    }
}
