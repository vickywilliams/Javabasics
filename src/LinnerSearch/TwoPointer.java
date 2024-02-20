package LinnerSearch;

public class TwoPointer {
    private static boolean flase;
    public static void main(String[] args) {
        int arr[] = {7,21,8,9,16,23};
        int n = 39;
        System.out.println(add(arr,n));
        ase (arr, n);
        
    }
    public static void ase(int[] arr, int n){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
               if (arr[i] + arr[j] == n) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        System.out.println(arr[i] + "");
    }
    
}
    public static boolean add(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
               if (arr[i] + arr[j] == n) {
                  return true;
               }

            }
        }
        return flase; 
    }
}
