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

public class problem_9498 {
    public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        scanner.close();
        if(90 <= A && A <= 100){
            System.out.println("A");
        }else if(80 <= A && A <= 89){
            System.out.println("B");
        }else if(70 <= A && A <= 79){
            System.out.println("C");
        }else if(60 <= A && A <= 69){
            System.out.println("D");
        }else{
            System.out.println("F");
        }
    }
}
