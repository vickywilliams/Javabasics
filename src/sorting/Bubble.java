package sorting;

public class Bubble {
    public static void main(String[] args) {
        int arr[] = {21,9,16,18,17,2};
        System.out.println("@@@@@@@ BUBBLE SORT @@@@@@@");
        int[] arr1 = bubblesort(arr.clone());
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
            
        }
            System.out.println("@@@@@@@ SELETION SORT @@@@@@@");
            int[] arr2 = seletionsort(arr.clone());
            for (int i = 0; i < arr2.length; i++) {
                System.out.println(arr2[i]);
                
            }
            System.out.println("@@@@@@@ INSETION SORT @@@@@@@");
            int[] arr3 = seletionsort(arr.clone());
            for (int i = 0; i < arr3.length; i++) {
                System.out.println(arr3[i]);
                
            }
    }
     public static int[] insertionsort(int arr[] ) {
        for (int i = 0; i < arr.length; i++) {
            int currenVal = arr[i];
            int j = i - 1;
            while (j>=0 && arr[j] >currenVal) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = currenVal; 
        }
        return arr;
    }
    public static int[] seletionsort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            int minIntex = i;
            for (int j = i+1; j < arr.length; j++) {
               if (arr[i] > arr[minIntex]) {
                minIntex = j;
            }
        }
        int temp = arr[i];
        arr[i] = arr[minIntex];
        arr[minIntex] = temp;

    }
        return arr;
    
}
    public static int[] bubblesort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
               if (arr[i] > arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            }
    }
        return arr;
    
}
}
