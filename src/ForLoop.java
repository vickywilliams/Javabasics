public class ForLoop {
    public static void main(String[] args) 
    {
        int[] arr = {8,9,21,19,16};
        int total = 2;
        for(int j = 2 ; j < arr.length ; j+=2)
        {
            System.out.println( arr[j]);
            total = total+arr[j];
        }
         
    }
}
