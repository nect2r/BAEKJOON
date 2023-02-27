/*
 * @since 2022-11-13
 * User https://www.acmicpc.net/user/nect2r
 * Blog https://nect2r.tistory.com/
 * Github https://github.com/nect2r/BAEKJOON
 * Change the class name to Main
 * Delete the package
 * Run
 */
package step_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem_3003 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strs = br.readLine().split(" ");

		System.out.println((1-Integer.parseInt(strs[0])) + " " + (1-Integer.parseInt(strs[1])) + " " + (2-Integer.parseInt(strs[2])) + " " + (2-Integer.parseInt(strs[3])) + " " + (2-Integer.parseInt(strs[4])) + " " + (8-Integer.parseInt(strs[5])));
	}
}
