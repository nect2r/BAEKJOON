/*
 * @since 2021-08-24
 * User https://www.acmicpc.net/user/nect2r
 * Blog https://nect2r.tistory.com/
 * Github https://github.com/nect2r/BAEKJOON
 * Change the class name to Main
 * Delete the package
 * Run
 */
package step_1;

import java.util.Scanner;

public class problem_10430 {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        System.out.println((num1 + num2) % num3); 
        System.out.println(((num1 % num3) + (num2 % num3)) % num3);
        System.out.println((num1 * num2) % num3);
        System.out.println(((num1 % num3) * (num2 % num3)) % num3); 
        input.close();
    }
}
