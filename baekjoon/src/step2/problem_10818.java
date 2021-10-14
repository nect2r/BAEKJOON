/*
 * @since 2021-10-13
 * User https://www.acmicpc.net/user/nect2r
 * Blog https://nect2r.tistory.com/
 * Github https://github.com/nect2r/BAEKJOON
 * Change the class name to Main
 * Delete the package
 * Run
 */
package step2;

import java.util.Arrays;
import java.util.Scanner;

public class problem_10818 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int[] list = new int[N];
		
		for(int i=0; i<N; i++) {
			list[i] = in.nextInt();
		}
		
		in.close();
		Arrays.sort(list);
		System.out.println(list[0] + " " + list[N - 1]);
	}
}