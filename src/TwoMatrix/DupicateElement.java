package TwoMatrix;

public class DupicateElement {
    public static void main(String[] args) {

        int [] arr = new int [] {11,8,23,21,12,4,5,7,23,12};  
        System.out.println("Duplicate value show : ");  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
     }
    

    }
}
