/*
 * @since 2023-05-02
 * User https://www.acmicpc.net/user/nect2r
 * Blog https://nect2r.tistory.com/
 * Github https://github.com/nect2r/BAEKJOON
 * Change the class name to Main
 * Delete the package
 * Run
 */
package step_5;

import java.io.*;
import java.util.*;

public class problem_27866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
	
		String S = st.nextToken();
		st = new StringTokenizer(br.readLine());
		int i = Integer.parseInt(st.nextToken());

		System.out.println(S.charAt(i - 1));
	}
}
