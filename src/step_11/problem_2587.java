/*
 * @since 2022-11-13
 * User https://www.acmicpc.net/user/nect2r
 * Blog https://nect2r.tistory.com/
 * Github https://github.com/nect2r/BAEKJOON
 * Change the class name to Main
 * Delete the package
 * Run
 */
package step_11;

import java.io.*;

public class problem_2587 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int avg = 0;
		int[] arrys = new int[5];

		for(int i=0; i<5; i++) {
			arrys[i] = Integer.parseInt(br.readLine());
			avg += arrys[i];
		}

		for(int i=1; i<5; i++) {
			int key = arrys[i];
			int position = i; 

			while(position > 0 && key < arrys[position - 1]) {
				arrys[position] = arrys[position - 1];
				position--;
			}

			arrys[position] = key;
		}

		System.out.println(avg / 5);
		System.out.println(arrys[2]);
	}
}
