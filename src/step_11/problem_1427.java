/*
 * @since 2022-11-16
 * User https://www.acmicpc.net/user/nect2r
 * Blog https://nect2r.tistory.com/
 * Github https://github.com/nect2r/BAEKJOON
 * Change the class name to Main
 * Delete the package
 * Run
 */
package step_11;

import java.io.*;

public class problem_1427 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] c = br.readLine().toCharArray();

		for(int i=1; i<c.length; i++) {
			int value = c[i];
			int position = i;

			while(position > 0 && value > c[position - 1]) {
				c[position] = c[position - 1];
				position--;
				c[position] = (char) value;
			}
		}

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		for(char s : c) {
			sb.append(s);
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
