package leetCode_121;

import java.util.Arrays;

/**
 * 
 * Input: [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 *              Not 7-1 = 6, as selling price needs to be larger than buying price.
 *
 * Input: [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transaction is done, i.e. max profit = 0.
 *
 */

public class leetCode_121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] test = {7,1,5,3,6,4};
		//int[] test = {7,6,4,3,1};
		//int[] test = {2,4,1};
		//int[] test = {3,2,6,5,0,3};
		int[] test = {1,2,4};
		
		int result = maxProfit(test);
		
		System.out.println("결과: "+result);
		

	}
	
	public static int maxProfit(int[] prices) {
		int max = 0, index_min = 0, min = 0;
		
		if (prices.length <= 1) {
			return 0;
		} else if (prices.length <= 2) {
			for (int i=0; i<prices.length - 1; i++) {
				if (prices[i] - prices[i+1] < min) min = prices[i] - prices[i+1];
			}
		} else {
			for (int i=0; i<prices.length; i++) {
				for (int j=i+1; j<prices.length; j++) {
					if (prices[i] - prices[j] < min) {
						min = prices[i] - prices[j];
					}				
				}
			}
		}
		
		
		
		min = min * -1;
		
		
		/*for (int i=0; i<prices.length - 1; i++) {
			if (i==0) {
				min = prices[i]; 
				index_min = i;
			}

			if (min > prices[i+1]) {
				if (i+1 == prices.length - 1) {
					continue;
				} else {
					min  = prices[i+1];
					index_min = i+1;
				}
			}
		}*/
		
		
		/*System.out.println("min:"+min);
		System.out.println("index_min:"+index_min);*/
		
		/*for (int j=index_min; j<prices.length; j++) {
			if (prices[j] - prices[index_min] > max) max = prices[j] - prices[index_min];
		}*/
		
		return min;
	}

}
