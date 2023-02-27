/*
 * @since 2021-11-07
 * User https://www.acmicpc.net/user/nect2r
 * Blog https://nect2r.tistory.com/
 * Github https://github.com/nect2r/BAEKJOON
 * Change the class name to Main
 * Delete the package
 * Run
 */
package step_5;

import java.util.Scanner;
import java.util.StringTokenizer;

public class problem_1152 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String T = in.nextLine();

		StringTokenizer st = new StringTokenizer(T," ");
		
		System.out.println(st.countTokens());	
		
		in.close();
	}
}
