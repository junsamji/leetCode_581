package HackerRank;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Dictionary;

/**
 * 
 * @author pcshs84
 *
 * Sample Input
 * 3
 * sam 99912222
 * tom 11122222
 * harry 12299933
 * sam
 * edward
 * harry
 * https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem
 *
 */
public class HR_Day8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		HashMap<String, Integer> map = new HashMap<String, Integer>(); 
		
		for (int i=0; i<n; i++) {
			String name = in.next();
			int phone = in.nextInt();
			
			map.put(name, phone);
		}
		
		while(in.hasNext()){
			String s = in.next();
			
			if (map.get(s) != null){
				System.out.println(s+"="+map.get(s));
			} else {
				System.out.println("Not Found");
			}
			
			
		}
		
		in.close();
		
	}

}
