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

public class problem_2108GG {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		int[] numbers = new int[size];
		double avg = 0.0;

		for(int i=0; i<size; i++) {
			numbers[i] = Integer.parseInt(br.readLine());
			avg += numbers[i];
		}

		avg = Math.round(avg / size);

		Arrays.sort(numbers);

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write((int)avg + "\n");
		bw.write(numbers[size/2] + "\n");
		bw.write(Math.abs(numbers[0]) + numbers[size-1] + "\n");
		bw.flush();
		bw.close();

		/**
		 * 카운팅 정렬 배워서 다시 풀어야 함..
		 * sort 사용시 결국 최빈값을 구하기 위해서 카운팅 정렬을 다시해야 하기떄문에..
		 */
	}
}