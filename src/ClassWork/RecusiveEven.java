package ClassWork;

public class RecusiveEven {
    public static void main(String[] args) {
        int[] arr = {4,7,23,45,76,83,91,49};
        RecusiveEven recursiveLoop = new RecusiveEven();
        recursiveLoop.even_num(arr, 0);
        recursiveLoop.prime_number(arr, 0);
        System.out.println("prime number:");
        System.out.println(" ");
        

    }
    public void even_num(int[] arr, int i){
        if (i< arr.length) {
            if(arr[i] %2 ==1)
                System.out.println("even numbers : "+arr[i]);
            even_num(arr, i+1);
        }
        return;
    }


    public int prime_number(int[] arr, int i){
        if (i==0){ 
            return 1;
        }
        return i-1;
    }
}