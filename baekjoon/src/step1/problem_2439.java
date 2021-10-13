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

public class problem_2439 {
	public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
        Integer T = scanner.nextInt();
        
        if(1 <= T && T <= 100) {
        	String star = "*";
        	
			for(int i=1; i<=T; i++) {
				String space = "";
				for(int j=1; j<=T-i; j++) {
					space = space + " ";
				}
				System.out.println(space + star);
				star = star + "*";
			}
        }
        scanner.close();
    }
}