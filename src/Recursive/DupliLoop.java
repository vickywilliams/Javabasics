package Recursive;

public class DupliLoop {
    public static void main(String[] args) {
        int[] arr = {8,21,19,8,19,77,3,4,21,99};
        duplicate(arr, 0, 0);
        
    }

    public static void duplicate(int[] arr, int i, int j) {
        if (j< arr.length-1){
            j=j+1;
        }
        else{
            i=i+1;
            j=i+1;
        }
        System.out.println("function call : i" + i +  "  j: " + j);
               if (i< arr.length-1) {
                if (arr[i] == arr[j]) {
                    System.out.println("Is a Duplicate :" + arr[i] );
                    
                }
                duplicate(arr, i, j);
            }
        System.out.println("function return: i" + "j:" );
    }
    
}
