package leetCode_852;

import java.util.Arrays;

public class leetCode_852 {

	public static void main(String[] args) {
		// Testcase
		int[] value = {2,6,4,8,10,9,15};
		//int[] value = {2,1};
		
		int[] result = peakIndexInMountainArray(value);
		
		//System.out.println("정답:"+ finalValue);
		
	}
	
	private static int[] peakIndexInMountainArray(int[] A) {
		int[] arr = A.clone();
		
		//My Method
		//selectSort(arr);
		Arrays.sort(arr);
		
		return arr;
	}
	
	private static void printArr(int[] arr, String left, String right) {
		String result = "";
		
		for (int i=0; i<arr.length; i++) {
			if (i == arr.length - 1) {
				result += arr[i];
			} else {
				result += arr[i] + ",";
			}
		}
		System.out.println(left + result + right);
	}

}
