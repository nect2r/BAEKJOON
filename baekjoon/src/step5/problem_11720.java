/*
 * @since 2021-10-17
 * User https://www.acmicpc.net/user/nect2r
 * Blog https://nect2r.tistory.com/
 * Github https://github.com/nect2r/BAEKJOON
 * Change the class name to Main
 * Delete the package
 * Run
 */
package step5;

import java.util.Scanner;

public class problem_11720 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		String M = in.next();
		
		if(M.length() <= N) {
			int sum = 0;
			for(int i=0; i<M.length(); i++) {
				sum += M.charAt(i)-'0';
			}
			System.out.println(sum);
		}
		
		in.close();
	}
}