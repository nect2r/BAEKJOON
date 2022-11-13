/*
 * @since 2021-12-01
 * User https://www.acmicpc.net/user/nect2r
 * Blog https://nect2r.tistory.com/
 * Github https://github.com/nect2r/BAEKJOON
 * Change the class name to Main
 * Delete the package
 * Run
 */
package step_7;

import java.util.*;

public class problem_1712 {
	static Scanner in = new Scanner(System.in);
	 
	public static void main(String[] args) {
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		
		if(B >= C) {
			System.out.println("-1");
		}else {
			System.out.println(A/(C-B) + 1);
		}
		
		in.close();
	}
}