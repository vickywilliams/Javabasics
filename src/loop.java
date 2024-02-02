public class loop {
    public static void main(String[] args) 
    {
        int[] arr = {8,9,21,19,16,19,29,36,34};
        int total = 4;
        for(int j = 4 ; j < arr.length ; j+=3)
        {
            System.out.println( arr[j]);
            total = total+arr[j];
        }
         
        System.out.println("the total : " + total);
    }
}