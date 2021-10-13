/*
 * @since 2021-10-13
 * User https://www.acmicpc.net/user/nect2r
 * Blog https://nect2r.tistory.com/
 * Github https://github.com/nect2r/BAEKJOON
 * Change the class name to Main
 * Delete the package
 * Run
 */
package step1;

import java.util.Scanner;

public class problem_2739 {
    public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
    	Integer T = scanner.nextInt();
    	
    	for(int i=0; i<T; i++) {
    		Integer A = scanner.nextInt();
    		Integer B = scanner.nextInt();
    		
    		if((0 < A) && (B < 10)) {
    			System.out.println(A+B);
    		}else {
    			System.out.println("A는 0보다 커야하며, B는 10보다 작아야합니다.");
    			break;
    		}
    	}
    	
    	scanner.close();
    }
}