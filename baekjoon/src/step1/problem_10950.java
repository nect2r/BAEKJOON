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

public class problem_10950 {
    public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
        Integer N = scanner.nextInt();
        scanner.close();
        
        if(1 <= N && N <= 9) {
        	for(int i=1; i <= 9; i++) {
            	System.out.println(N + " * " + i + " = " + N*i);
            }
        }else {
        	System.out.println("�Է��� N�� 1���� ũ�ų� ����, 9���� �۰ų� ���ƾ��մϴ�.");
        }
    }
}