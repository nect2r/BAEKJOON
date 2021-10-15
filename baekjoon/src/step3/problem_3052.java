/*
 * @since 2021-10-14
 * User https://www.acmicpc.net/user/nect2r
 * Blog https://nect2r.tistory.com/
 * Github https://github.com/nect2r/BAEKJOON
 * Change the class name to Main
 * Delete the package
 * Run
 */
package step3;

import java.util.Scanner;

public class problem_3052 {
	public static void main(String[] args) {
		 
		Scanner in = new Scanner(System.in);
 
		int list[] = {   in.nextInt()%42
			  			,in.nextInt()%42
						,in.nextInt()%42
						,in.nextInt()%42
						,in.nextInt()%42
						,in.nextInt()%42
						,in.nextInt()%42
						,in.nextInt()%42
						,in.nextInt()%42
						,in.nextInt()%42
					  };
		
		Integer count = 0;
		
		for(int o : list) {
			if(list[0] != o) {
				count++;
			}
			System.out.println(o);
		}
	}
}