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

public class problem_8393 {
    public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();
        Integer count = 0;
        
        if(1 <= n && n <= 10000) {
        	for(int i=1; i<=n; i++) {
        		count = count + i;
        	}
        }else {
        	System.out.println("n�� 1���� ũ�ų� ���ƾ��ϸ�, 10000���� �۰ų� ���ƾ��մϴ�.");
        }
        
        System.out.println(count);
    }
}