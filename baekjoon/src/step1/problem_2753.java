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

public class problem_2753 {
    public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        scanner.close();
        if((A % 4 == 0 && A % 100 != 0) || A % 400 == 0){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}
