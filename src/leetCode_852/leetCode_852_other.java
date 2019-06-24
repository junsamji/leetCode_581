package leetCode_852;

import java.util.Arrays;
import java.util.Collections;

public class leetCode_852_other {

	public static void main(String[] args) {
		int finalValue = 0;
		// Testcase
		int[] value = {0,2,1,0};
		
		printArr(value, "원본값 [", "]");
		
		finalValue = peakIndexInMountainArray(value);
		
		System.out.println("정답:"+ finalValue);
		
	}
	
	private static int peakIndexInMountainArray(int[] A) {
		int tmp = 0;
		int max = 0;
		
		for (int i=0; i<A.length-1; i++) {
			if (A[i] > A[i+1]) {
				tmp = i;
			} else {
				tmp = i+1;
			}
			
			if (A[tmp] >= A[max]) {
				max = tmp;
			}
		}
		
		return max;
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
	
	private static void printArr(Integer[] arr, String left, String right) {
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
