/*
 * @since 2021-12-16
 * User https://www.acmicpc.net/user/nect2r
 * Blog https://nect2r.tistory.com/
 * Github https://github.com/nect2r/BAEKJOON
 * Change the class name to Main
 * Delete the package
 * Run
 */
package step5;

import java.util.*;

public class problem_2292 {
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		int count = in.nextInt();
		
		//������ 1���ͽ���
		//1�ΰ�� 1
		//2~7 2
		//8~20 3
		//21~37 4
		//������ 6���þ 
		
		//���� ������
		int point = 0;
		
		//������ �ִ� ��
		int beforepoint = 1;
		
		//������ ���Ͽ� ���� input�� ���Ͽ� �˼������Ű���..
		while(true) {
			beforepoint = (6 * point) + beforepoint;
			point++;

			if(beforepoint >= count) {
				System.out.println(point);
				break;
			}
		}
		
	}
}