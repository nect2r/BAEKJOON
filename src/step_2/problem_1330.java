/*
 * @since 2021-08-29
 * User https://www.acmicpc.net/user/nect2r
 * Blog https://nect2r.tistory.com/
 * Github https://github.com/nect2r/BAEKJOON
 * Change the class name to Main
 * Delete the package
 * Run
 */
package step_2;

import java.util.Scanner;

public class problem_1330 {
    public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();
        if(A < B){
            System.out.println("<");
        }else if(A > B){
            System.out.println(">");
        }else if(A == B){
            System.out.println("==");
        }
    }
}
