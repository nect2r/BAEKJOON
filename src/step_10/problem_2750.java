/*
 * @since 2022-11-13
 * User https://www.acmicpc.net/user/nect2r
 * Blog https://nect2r.tistory.com/
 * Github https://github.com/nect2r/BAEKJOON
 * Change the class name to Main
 * Delete the package
 * Run
 */
package step_10;

import java.io.*;

public class problem_2750 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		int[] arrys = new int[count];

		for(int i=0; i<count; i++) {
			arrys[i] = Integer.parseInt(br.readLine());
		}

		for(int i=1; i<arrys.length; i++) {
			int key = arrys[i];
			int position = i;

			while(position > 0 && key < arrys[position - 1]) {
				arrys[position] = arrys[position - 1];
				position--;
			}

			arrys[position] = key;
		}

		for(int i=0; i<count; i++) {
			System.out.println(arrys[i]);
		}
	}
}