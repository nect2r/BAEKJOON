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

public class problem_14681 {
    public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();
        //�� 1��и�
        if(A > 0 && B > 0){
            System.out.println("1");
        //�� 4��и�
        }else if(A > 0 && B < 0){
            System.out.println("4");
        //�� 3��и�
        }else if(A < 0 && B < 0){
            System.out.println("3");
        //�� 2��и�
        }else if(A < 0 && B > 0){
            System.out.println("2");
        }
    }
}
