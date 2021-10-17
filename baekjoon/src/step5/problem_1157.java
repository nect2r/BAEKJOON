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

public class problem_1157 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String word = in.next();
		
		for(int i=0; i<word.length(); i++) {
			System.out.println(word.charAt(i));
		}
		
		in.close();
	}
}