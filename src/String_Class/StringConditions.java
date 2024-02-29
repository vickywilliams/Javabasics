package String_Class;

public class StringConditions {
    public static void main(String[] args) {
        String str1= "Hello", str3 = null, str2= "Would", str4= "lo", str5= "hello";
        System.out.println("Str1: "+ str1+ " | Str2: "+str2);
// chacking is a string empty or not    
    // Equals
    if (str1.equals(str3)){
        System.out.println("Str1: "+ str1+ " == Str2: "+str2+" : true");
    }
    else{
        System.out.println("Str1: "+ str1+ " == Str2: "+str2+" : false");
    }
    if (str1.toLowerCase().equals(str5.toLowerCase())) {
        System.out.println("Str1: "+ str1+ " == Str5: "+str5+" : true");
    }
    else{
        System.out.println("Str1: "+ str1+ " == Str5: "+str5+" : false");
    }
    if (str1.equalsIgnoreCase(str5)) {
        System.out.println("Str1: "+ str1+ " == Str5: "+str5+" : true");    
    }
    else{
        System.out.println("Str1: "+ str1+ " == Str5: "+str5+" : false");
    }
// chacking is a string empty or not
    //contains
    if (str1 != null && str4 != null && str1.contains(str4)) {
        System.out.println("Str1: "+ str1+ " == Str4: "+str4+" : true");
    }
    else{
        System.out.println("Str1: "+ str1+ " == Str4: "+str4+" : false");
    }
    if (str1 != null && str4 != null && str1.contains(str4)) {
        System.out.println("Str1: "+ str1+ " == Str4: "+str4+" : true");
    }
    else{
        System.out.println("Str1: "+ str1+ " == Str4: "+str4+" : false");
    }
}}
