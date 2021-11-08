/*
 * @since 2021-11-08
 * User https://www.acmicpc.net/user/nect2r
 * Blog https://nect2r.tistory.com/
 * Github https://github.com/nect2r/BAEKJOON
 * Change the class name to Main
 * Delete the package
 * Run
 */
package step5;

import java.util.*;

public class problem_2941 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String T = in.nextLine();
		
		String[] str = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		
		int total = 0;
		int lastIndex = 0;

		for(int i=0; i<str.length; i++) {
			if(lastIndex != -1) {
				lastIndex = T.indexOf(str[i])+2;
				i -= 1;
				total += 1;
			}else {
				lastIndex = T.indexOf(str[i])+2;
			}
			
			System.out.println(lastIndex);
		}

		System.out.println("크로아티아 알파벳 갯수 : " + total);
		System.out.println("단어의 길이 : " + T.length());
		
		in.close();
	}
}