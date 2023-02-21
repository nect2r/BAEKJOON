/*
 * @since 2021-10-17
 * User https://www.acmicpc.net/user/nect2r
 * Blog https://nect2r.tistory.com/
 * Github https://github.com/nect2r/BAEKJOON
 * Change the class name to Main
 * Delete the package
 * Run
 */
package step_6;

import java.util.Scanner;

public class problem_10809 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String word = in.next();
		int[] arr = new int[26];
		
		for(int i = 0; i < arr.length; i++){
			arr[i] = -1;
		}
		
		for(int i=0; i<word.length(); i++) {
			arr[(int)word.charAt(i)-97] = word.indexOf(word.charAt(i));
		}
		
		for(int a : arr) {
			System.out.print(a + " ");
		}
		
		in.close();
	}
}