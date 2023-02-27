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

public class problem_1978 {
	
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int count = 0;
        
        for(int i = 0; i < size; i++) {
        	int num = input.nextInt();
        	boolean flag = true;
        	for(int j = 2; j < num; j++) {
        		if(num % j == 0) {
        			flag = false;
        		}
        	}
        	if(flag && num != 1) {
        		count++;
        	}
        }
        System.out.println(count);
		input.close();
	}
}
