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

public class problem_2884 {
    public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
        String A = scanner.nextLine();
        scanner.close();
        
        //시
        Integer hour = Integer.parseInt(String.valueOf(A.subSequence(0, A.indexOf(" "))));
        //분
        Integer minute = Integer.parseInt(String.valueOf(A.subSequence(A.indexOf(" ")+1, A.length())));
        if((0 > hour || hour > 23) || (0 > minute || minute > 59)) {
        	System.out.println("시간이 옳바르지 안습니다.");
        }else {
        	//뺴야하는 분
            Integer minusMinute = 45;
            
            //만약 분끼리 뻇을떄 minus해야하는 대상이 더크면 시간도 뺴야하기때문
            if(minute < minusMinute) {
            	hour = hour-1;
            	minute = (minute+60) - minusMinute;
            }else {
            	minute = minute - minusMinute;
            }
            
            if(hour < 0) {
            	hour = hour + 24;
            }
            System.out.println(hour + " " + minute);
        }
    }
}