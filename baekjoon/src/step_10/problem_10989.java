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
import java.util.*;

public class problem_10989 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		int[] numbers = new int[size];

		for(int i=0; i<size; i++) {
			numbers[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(numbers);

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=0; i<size; i++) {
			bw.write(numbers[i] + "\n");
		}
		bw.flush();
		bw.close();
	}
}