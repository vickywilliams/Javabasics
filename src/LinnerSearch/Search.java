package LinnerSearch;

public class Search {
    public static void main(String[] args) {
		int arr[]= {2,3,4,5,6,7,8,9,10,11,12,15,17,18,20};
		int n=20;
		print("Linear", linearSearch(arr,n),n);
		print("Binary", binarySearch(arr,n),n);
		print("Ternary", ternarySearch (arr,n),n);
	}
	
	private static void print(String search, int res, int n) {
		if(res != -1) 
			System.out.println(search+" search: value: "+n+" index: "+res);
		else
			System.out.println(search+" search: :(");
	}
	
	private static int linearSearch(int[] arr, int n) {
		int loopExcution = 0;
		for(int i=0;i<arr.length;i++) {
			loopExcution++;
			if(arr[i] == n) {
				System.out.println("Linear search loop excution: "+loopExcution);
				return i;
			}
		}
		System.out.println("Linear search loop excution: "+loopExcution);
		return -1;
	}
	
	private static int binarySearch(int arr[],int n) {
		int start=0;
		int end=arr.length;
		int loopExcution=0;
		while(start <= end) {
			loopExcution++;
			int mid=(end+start)/2;
			if(arr[mid]==n) {
				System.out.println("Binary search loop excution: "+loopExcution);
				return mid;
			}
			else if(arr[mid]<n) {
				start = mid+1;
			}
			else if(arr[mid]>n) {
				end=mid-1;
			}
		}
		System.out.println(loopExcution);
		return -1;
	}
	
	private static int ternarySearch(int arr[],int n) {
		int start = 0;
		int end = arr.length-1;	
		int loopExcution=0;
		while(start<=end) {
			loopExcution++;
			int mid1 = start + (end-start)/3;
			int mid2 = end - (end-start)/3;
			if(arr[mid1]==n) {
				System.out.println("Ternary search loop excution: "+loopExcution);
				return mid1;
			}
			if(arr[mid2]==n) {
				System.out.println("Ternary search loop excution: "+loopExcution);
				return mid2;
			}
			if(arr[mid1]>n) {
				end=mid2-1;
			}
			else if(arr[mid2]<n) {
				start=mid1+1;
			}
			else {
				start=mid1+1;
				end=mid2-1;
			}
		}
		return -1;
    }
}
