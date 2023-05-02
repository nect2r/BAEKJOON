/*
 * @since 2023-05-02
 * User https://www.acmicpc.net/user/nect2r
 * Blog https://nect2r.tistory.com/
 * Github https://github.com/nect2r/BAEKJOON
 * Change the class name to Main
 * Delete the package
 * Run
 */
package step_8;

import java.io.*;
import java.util.*;

public class problem_2720 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int count = Integer.parseInt(st.nextToken());

		for(int i = 0; i < count; i ++) {
			st = new StringTokenizer(br.readLine());
			int change = Integer.parseInt(st.nextToken());

			printChange(change);
		}

		System.out.println(sb.toString());
	}

	static final StringBuilder sb = new StringBuilder();
	static final int QUARTER = 25;
	static final int DIME = 10;
	static final int NICKEL = 5;

	private static void printChange(int change) {
		sb.append(change / QUARTER);
		sb.append(" ");
		change = change % QUARTER;

		sb.append(change / DIME);
		sb.append(" ");
		change = change % DIME;

		sb.append(change / NICKEL);
		sb.append(" ");
		change = change % NICKEL;

		sb.append(change);
		sb.append("\n");
	}
}