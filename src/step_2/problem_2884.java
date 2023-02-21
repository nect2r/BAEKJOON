/*
 * @since 2021-10-13
 * User https://www.acmicpc.net/user/nect2r
 * Blog https://nect2r.tistory.com/
 * Github https://github.com/nect2r/BAEKJOON
 * Change the class name to Main
 * Delete the package
 * Run
 */
package step_2;

import java.util.Scanner;

public class problem_2884 {
    public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
        String A = scanner.nextLine();
        scanner.close();
        
        //��
        Integer hour = Integer.parseInt(String.valueOf(A.subSequence(0, A.indexOf(" "))));
        //��
        Integer minute = Integer.parseInt(String.valueOf(A.subSequence(A.indexOf(" ")+1, A.length())));
        if((0 > hour || hour > 23) || (0 > minute || minute > 59)) {
        	System.out.println("�ð��� �ǹٸ��� �Ƚ��ϴ�.");
        }else {
        	//�����ϴ� ��
            Integer minusMinute = 45;
            
            //���� �г��� �P���� minus�ؾ��ϴ� ����� ��ũ�� �ð��� �����ϱ⶧��
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