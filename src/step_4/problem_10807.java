/*
 * @since 2022-11-13
 * User https://www.acmicpc.net/user/nect2r
 * Blog https://nect2r.tistory.com/
 * Github https://github.com/nect2r/BAEKJOON
 * Change the class name to Main
 * Delete the package
 * Run
 */
package step_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem_10807 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		bf.readLine();
		String[] strs = bf.readLine().split(" ");
		String search = bf.readLine();
		int chk = 0;

		for(int i=0; i<strs.length; i++) {
			if(search.equals(strs[i])) {
				chk++;
			}
		}

		System.out.println(chk);
	}
}