package tree.dfs;

public class Task {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index of the target element if found
            }
        }
        return -1; // Return -1 if the target element is not found
    }

    public static void main(String[] args) {
        int[] arr = {12, 45, 89, 56, 23, 67, 34};
        int target = 56;

        // Perform linear search
        int resultIndex = linearSearch(arr, target);

        if (resultIndex == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + resultIndex);
        }
    }
}
