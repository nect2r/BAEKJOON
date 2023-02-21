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
		int[] result = new int[size];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<size; i++) {
			int a = Integer.parseInt(st.nextToken());
			arr[i] = a;
			result[i] = a;
		}

		Arrays.sort(arr);

		Map<Integer,Integer> map = new HashMap<>();

		int count = 0;
		for(int i=0; i<size; i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], count);
				count++;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<size; i++) {
			sb.append(map.get(result[i]) + " ");
		}

		System.out.println(sb);
	}
}