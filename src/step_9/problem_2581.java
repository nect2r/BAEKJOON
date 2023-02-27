/*
 * @since 2021-12-17
 * User https://www.acmicpc.net/user/nect2r
 * Blog https://nect2r.tistory.com/
 * Github https://github.com/nect2r/BAEKJOON
 * Change the class name to Main
 * Delete the package
 * Run
 */
package step_9;

import java.io.IOException;
import java.util.Scanner;

public class problem_2581 {
	
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
        int M = input.nextInt();
        int N = input.nextInt();
        int sum = 0;
        int min = 0;
        
        for(int i = M; i <= N; i++) {
        	boolean flag = true;
        	for(int j = 2; j < i; j++) {
        		if(i % j == 0) {
        			flag = false;
        		}
        	}
        	if(flag && i != 1) {
        		if(sum == 0) {
        			min = i;
        		}
        		sum+=i;
        	}
        }
        
        if(sum == 0) {
        	System.out.println(-1);
        }else {
        	System.out.println(sum);
        	System.out.println(min);
        }
		input.close();
	}
}
