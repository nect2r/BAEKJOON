/*
 * @since 2021-11-07
 * User https://www.acmicpc.net/user/nect2r
 * Blog https://nect2r.tistory.com/
 * Github https://github.com/nect2r/BAEKJOON
 * Change the class name to Main
 * Delete the package
 * Run
 */
package step_5;

import java.util.Scanner;

public class problem_2908 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String T1 = in.next();
		String T2 = in.next();
		
		int a,b = 0;
		
		StringBuffer sb1 = new StringBuffer(T1);
		a = Integer.parseInt(sb1.reverse().toString());
		StringBuffer sb2 = new StringBuffer(T2);
		b = Integer.parseInt(sb2.reverse().toString());
		
		if(a > b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
		
		
		in.close();
	}
}
