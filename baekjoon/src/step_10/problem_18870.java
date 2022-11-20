/*
 * @since 2022-11-16
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

public class problem_18870 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		int[] arr = new int[size];
		int pMin = Integer.MAX_VALUE;

		StringTokenizer st = new StringTokenizer(br.readLine());

		for(int i=0; i<size; i++) {
			arr[i] = Integer.parseInt(st.nextToken());

			if(arr[i] < pMin && arr[i] >= 0) {
				pMin = arr[i];
			}
		}

		StringBuilder sb = new StringBuilder();
		for(int i=0; i<size; i++) {
			sb.append(arr[i] + " ");
		}
		System.out.println(sb.toString());
	}
}