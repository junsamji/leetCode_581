package leetCode_162;

public class leetCode_162 {
	public static void main(String[] args) {
		//int[] test = {-2147483647,-2147483648};
		int[] test = {1,2,3};
		
		int result = findPeakElement(test);
		
		System.out.println(result);
	}
	
	/**
	 * Find Peak Element (Medium)
	 * https://leetcode.com/problems/find-peak-element/
	 * 
	 */
	
	private static int findPeakElement(int[] nums) {
		int peakIndex = 0;
		int max = 0;
		
		for (int i=0; i<nums.length - 1; i++) {
			
			if ( i == 0) max = nums[i];
			
			if (nums[i] != nums[i+1] && nums[i] >= max) max = Math.max(nums[i], nums[i+1]);

		}
		
		for (int j=0; j<=nums.length-1; j++) {
			if (max == nums[j]) peakIndex = j;
		}
		
		return peakIndex;
	}

}
