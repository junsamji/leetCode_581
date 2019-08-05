package HackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Difference {
  	private int[] elements;
  	public int maximumDifference;

	public Difference(int[] a) {
		this.elements = a;
	}

	public void computeDifference(){
        
        maximumDifference = 0;

        for (int i=0; i<elements.length-1; i++){
            maximumDifference = Math.abs(elements[i] - elements[i+1]);
        }
    }

} // End of Difference class

public class HR_DAY14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);

	}

}
