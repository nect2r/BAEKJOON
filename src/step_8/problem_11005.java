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

public class problem_11005 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
	
		int binaryString = Integer.parseInt(st.nextToken());
		int binaryType = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();

		while(true) {
			int quotient = binaryString / binaryType;
			int remainder = binaryString % binaryType;

			// 10부터 A-> char변환 55더하기
			if(remainder >= 10) {
				sb.append((char)(remainder + 55));
			} else {
				sb.append(remainder);
			}

			if(binaryType > binaryString) {
				break;
			}

			binaryString = quotient;
		}

		//나머지가 나온 순서대로 append 했으므로 역순으로 출력
		System.out.println(sb.reverse().toString());
	}
}