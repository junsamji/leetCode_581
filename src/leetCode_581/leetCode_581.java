package leetCode_581;

import java.util.Arrays;

public class leetCode_581 {

	public static void main(String[] args) {
		// Testcase
		int[] value = {2,6,4,8,10,9,15};
		//int[] value = {2,1};
		
		int[] result = findUnsortedSubarray(value);
		
		printArr(value, "원본값 [", "]");
		printArr(result, "변환값 [", "] ");
		
		int startIndex = 0;
		int endIndex = 0;
		int finalValue = 0;
		
		for (int i=0; i<value.length; i++) {
			if (value[i] != result[i]) {
				startIndex = i;
				break;
			}
		}
		
		for (int j=value.length-1; j>startIndex; j--) {
			if (value[j] != result[j]) {
				endIndex = j;
				break;
			}
		}
		
		if (startIndex == endIndex) {
			finalValue = (endIndex - startIndex);
		} else {
			finalValue = (endIndex - startIndex) + 1;
		}
		
		System.out.println("정답:"+ finalValue);
		
	}
	
	private static int[] findUnsortedSubarray(int[] num) {
		int[] arr = num.clone();
		
		//My Method
		//selectSort(arr);
		Arrays.sort(arr);
		
		return arr;
	}
	
	/**
	 * 직접 만든 선택 정렬
	 * @param arr
	 */
	private static void selectSort(int[] arr) {
		for (int i=0; i<arr.length; i++) {
			int minIdex = i;
			
			for (int j=i+1; j<arr.length; j++) {
				if (arr[minIdex] > arr[j]) {
					minIdex = j;
				}
			}
			
			int tmp = arr[i];
			arr[i] = arr[minIdex];
			arr[minIdex] = tmp;
		}
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
