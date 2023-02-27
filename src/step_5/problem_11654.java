/*
 * @since 2021-10-17
 * User https://www.acmicpc.net/user/nect2r
 * Blog https://nect2r.tistory.com/
 * Github https://github.com/nect2r/BAEKJOON
 * Change the class name to Main
 * Delete the package
 * Run
 */
package step_5;

import java.util.Scanner;

public class problem_11654 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String N = in.next();
		char M = N.charAt(0);
		
		if((M >= 48 && M <= 57) || (M >= 65 && M <= 90) || (M >= 97 && M <= 122)) {
			System.out.println((int)M);
		}
		
		in.close();
	}
}
