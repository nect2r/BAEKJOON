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

public class problem_10871 {
	public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
        Integer N = scanner.nextInt();
        Integer X = scanner.nextInt();
        Integer[] list = new Integer[N];
        
        if((1 <= N && N <= 10000) && (1 <= X && X <= 10000)) {
            for(int i=0; i<N; i++) {
            	Integer A = 	scanner.nextInt();
            	list[i] = A;
            }
            
            for(Integer C : list) {
            	if(X > C) {
            		System.out.print(C + " ");
            	}
            }
        }
        
        scanner.close();
    }
}