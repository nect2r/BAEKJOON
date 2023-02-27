/*
 * @since 2021-10-13
 * User https://www.acmicpc.net/user/nect2r
 * Blog https://nect2r.tistory.com/
 * Github https://github.com/nect2r/BAEKJOON
 * Change the class name to Main
 * Delete the package
 * Run
 */
package none_step;

import java.util.Scanner;

public class problem_2741 {
    public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
        Integer N = scanner.nextInt();
        
        if(0 < N && N <= 100000) {
        	for(int i=1; i<=N; i++) {
        		System.out.println(i);
        	}
        }
        
        scanner.close();
    }
}
