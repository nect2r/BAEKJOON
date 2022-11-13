/*
 * @since 2022-11-13
 * User https://www.acmicpc.net/user/nect2r
 * Blog https://nect2r.tistory.com/
 * Github https://github.com/nect2r/BAEKJOON
 * Change the class name to Main
 * Delete the package
 * Run
 */
package step_9;

import java.io.*;

public class problem_2566 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int maxNumber = 0;
		int x = 0;
		int y = 0;

		for(int i=0; i<9; i++) {
			String[] strs = br.readLine().split(" ");

			for(int j=0; j<strs.length; j++) {
				if(maxNumber < Integer.parseInt(strs[j])) {
					maxNumber = Integer.parseInt(strs[j]);
					x = i;
					y = j;
				}
			}
		}
		System.out.println(maxNumber);
		System.out.println(x+1 + " " + (y+1));
	}
}