package Arrays;

import java.util.Arrays;

public class TestBinary {
	public static void main(String[] args) {
		int[] arr = {30,20,50,10,80,9,7,12,100,40,8};
		Arrays.sort(arr);
		
		int value = 10;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(myBinary(arr,40));
		
	}


	public static int myBinary(int[] arr,int value) {
		int low = 0;
		int high = arr.length-1;
		
		while(low <= high) {
			int mid = (low+high)/2;
			
			if(value == arr[mid]) {
				return mid;
			}
			if(value>arr[mid]) {
				low = mid+1;
			}
			if(value<arr[mid]) {
				high = mid-1;
		}
			
		}
		return -1;
	}
}
