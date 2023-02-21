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

public class problem_2480 {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
        int first = input.nextInt();
        int second = input.nextInt();
        int third = input.nextInt();
        
        if(first == second && second == third) {
        	System.out.println(10000 + first * 1000);
        }else if(first == second || first == third) {
        	System.out.println(1000 + first * 100);
        }else if(second == third) {
        	System.out.println(1000 + second * 100);
        }else {
        	if(first >= second && first >= third) {
        		System.out.println(first * 100);
        	}else if(second >= first && second >= third) {
        		System.out.println(second * 100);
        	}else if(third >= first && third >= third) {
        		System.out.println(third * 100);
        	}
        }
        input.close();
    }
}
