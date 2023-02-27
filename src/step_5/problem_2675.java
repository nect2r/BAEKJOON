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

public class problem_2675 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		
		for(int i=0; i<T; i++) {
			int R = in.nextInt();
			String S = in.next();
			String P = "";
			
			for(int x=0; x<S.length(); x++) {
				for(int j=0; j<R; j++) {
					P = P + S.charAt(x);
				}
			}
			
			System.out.println(P);
		}
		
		in.close();
	}
}
