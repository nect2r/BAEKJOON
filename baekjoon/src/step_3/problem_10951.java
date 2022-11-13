/*
 * @since 2021-10-13
 * User https://www.acmicpc.net/user/nect2r
 * Blog https://nect2r.tistory.com/
 * Github https://github.com/nect2r/BAEKJOON
 * Change the class name to Main
 * Delete the package
 * Run
 */
package step_3;

import java.util.Scanner;

public class problem_10951 {
    public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
    	Integer A,B;
    	
    	while(scanner.hasNext()) {
    		A = scanner.nextInt();
    		B = scanner.nextInt();
    		
    		if((0 < A && A < 10) && (0 < B && B < 10)) {
    			System.out.println(A+B);
    		}else {
    			break;
    		}
    	}
    	
        scanner.close();
    }
}