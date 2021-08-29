/*
 * @since 2021-08-29
 * User https://www.acmicpc.net/user/nect2r
 * Blog https://nect2r.tistory.com/
 * Github https://github.com/nect2r/BAEKJOON
 * Change the class name to Main
 * Delete the package
 * Run
 */
package step1;

import java.util.Scanner;

public class problem_14681 {
    public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();
        //제 1사분면
        if(A > 0 && B > 0){
            System.out.println("1");
        //제 4사분면
        }else if(A > 0 && B < 0){
            System.out.println("4");
        //제 3사분면
        }else if(A < 0 && B < 0){
            System.out.println("3");
        //제 2사분면
        }else if(A < 0 && B > 0){
            System.out.println("2");
        }
    }
}
