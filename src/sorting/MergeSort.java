package sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr= {21,9,12,16,17,2,9};
        mergeSort(arr, 0, arr.length-1);
    }
    public static int[] mergeSort(int [] arr, int l, int r) {
        if(l<r) {
            int middle =(r+l)/2;
            System.out.println("method call "+ l +":" + r);
            
            int [] rFinal = mergeSort(arr, middle+1, r);
            int [] lFinal = mergeSort(arr, l, middle);
            
            System.out.println("method return "+l+":"+r);
        }
        return arr;
    }
}
