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

public class problem_8393 {
    public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();
        Integer count = 0;
        
        if(1 <= n && n <= 10000) {
        	for(int i=1; i<=n; i++) {
        		count = count + i;
        	}
        }else {
        	System.out.println("n은 1보다 크거나 같아야하며, 10000보다 작거나 같아야합니다.");
        }
        
        System.out.println(count);
        scanner.close();
    }
}