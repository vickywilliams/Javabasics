package String_Class;

public class DuplicateChar {
    public static void main(String[] args) {
            String s = "Hello Would";
            System.out.println("Duplicate: "+findDuplicate(s));
    }
    public static String findDuplicate(String s){
        String response ="";
        s=s.trim();
        //int loop = 0;
        for (int i = 1; i < s.length(); i++) {
            if(s.substring(i).contains(s.substring(i-1,i))){
                if (!response.contains(s.substring(i-1,i))) {
                    response = response.concat(s.substring(i-1,i));
                }
            }
           // loop++; 
        }
        return response;
    }
}
