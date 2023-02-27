/*
 * @since 2022-11-13
 * User https://www.acmicpc.net/user/nect2r
 * Blog https://nect2r.tistory.com/
 * Github https://github.com/nect2r/BAEKJOON
 * Change the class name to Main
 * Delete the package
 * Run
 */
package none_step;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class problem_2744 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String strs = bf.readLine();
		StringBuilder sb = new StringBuilder();

		for(int i=0; i<strs.length(); i++) {
			char a = strs.charAt(i);

			if(a > 96 && a < 123){
				sb.append(Character.toUpperCase(a));
			}else{
				sb.append(Character.toLowerCase(a));
			}
		}

		System.out.println(sb.toString());
	}
}
