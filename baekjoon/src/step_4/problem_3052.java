/*
 * @since 2021-10-16
 * User https://www.acmicpc.net/user/nect2r
 * Blog https://nect2r.tistory.com/
 * Github https://github.com/nect2r/BAEKJOON
 * Change the class name to Main
 * Delete the package
 * Run
 */
package step_4;

import java.util.HashSet;
import java.util.Scanner;

public class problem_3052 {
	public static void main(String[] args) {
		 
		Scanner in = new Scanner(System.in);
		HashSet<Integer> h = new HashSet<Integer>();
		
		for (int i = 0; i < 10; i++) {
			h.add(in.nextInt() % 42);
		}
        
		in.close();
		System.out.print(h.size());
	}
}