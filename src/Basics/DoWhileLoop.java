package Basics;

public class DoWhileLoop {
    public static void main(String args[])
    {
        int[] arr = {8,9,21,16,19,29,36,34};
        int w = 0;
        while (w < arr.length) {
            System.out.println(arr[w]);
            w++;
        }
        
        w = -1;
        
        do {
            w++;
            System.out.println(arr[w]);
            
        } while (w < arr.length-1);
    }
}

