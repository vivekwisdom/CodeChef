/**
 * 
 */
package vw.codechef.practice.easy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author vivek
 *
 */
public class UncleJohny {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
		for (int i = 0; i < testCases; i++) {
			int n = in.nextInt();
			int[] arr = new int[n];
			for (int j = 0; j < n; j++) {
				arr[j] = in.nextInt();
			}
			int k = in.nextInt();
			int ni = arr[k - 1];
			Arrays.sort(arr);
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == ni) {
					System.out.println(j + 1);
				}
			}
		}

	}

}
