/*
 * @since 2021-12-17
 * User https://www.acmicpc.net/user/nect2r
 * Blog https://nect2r.tistory.com/
 * Github https://github.com/nect2r/BAEKJOON
 * Change the class name to Main
 * Delete the package
 * Run
 */
package step_8;

import java.io.IOException;
import java.util.Scanner;

public class problem_11653 {
	
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
        int M = input.nextInt();

        if(M != 1) {
        	for(int i = 2; i <= M; i++) {
            	if(M % i == 0) {
            		System.out.println(i);
            		M = M / i;
            		i = 1;
            	}
            }
        }
		input.close();
	}
}