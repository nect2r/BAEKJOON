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

public class problem_2525 {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
        int hour = input.nextInt();
        int minet = input.nextInt();
        int plusMinet = input.nextInt();
    
        hour = hour + plusMinet / 60;
        minet = minet + plusMinet % 60;
        if(minet >= 60){
            hour++;
            minet = minet - 60;
        }
        if(hour >= 24) {
        	hour = hour - 24;
        }
        System.out.println(hour + " " + minet);
        input.close();
    }
}
